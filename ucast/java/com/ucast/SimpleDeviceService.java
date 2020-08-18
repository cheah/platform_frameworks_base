package com.ucast;

public class SimpleDeviceService extends ISimpleDeviceService.Stub {

    public SimpleDeviceResult plusNumber(int a, int b) {
        return new SimpleDeviceResult("I am UCAST", a + b);
    }
}