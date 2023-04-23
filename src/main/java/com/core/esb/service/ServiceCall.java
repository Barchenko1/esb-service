package com.core.esb.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceCall<E> implements IServiceCall<E> {

    RestTemplate restTemplate = new RestTemplate();

    public E doCall(String url, Class<E> type) {
        E result = restTemplate.getForObject(url, type);
        return result;
    }
}
