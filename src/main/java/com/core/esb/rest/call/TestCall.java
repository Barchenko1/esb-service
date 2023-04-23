package com.core.esb.rest.call;

import com.core.esb.service.IServiceCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.core.esb.url.TdsApi.TDS_URL;


@RestController
@RequestMapping("/esb")
public class TestCall {
    private final IServiceCall<String> serviceCall;

    @Autowired
    public TestCall(IServiceCall<String> serviceCall) {
        this.serviceCall = serviceCall;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<String> getCall() {
        String result = serviceCall.doCall(TDS_URL, String.class);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
