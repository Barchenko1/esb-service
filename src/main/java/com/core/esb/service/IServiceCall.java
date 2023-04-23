package com.core.esb.service;

public interface IServiceCall<E> {
    public E doCall(String url, Class<E> type);
}
