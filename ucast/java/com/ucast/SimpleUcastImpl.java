package com.ucast;

import android.os.RemoteException;

public class SimpleUcastImpl implements ISimpleUcast {

    private ISimpleDeviceService deviceService;

    public SimpleUcastImpl(ISimpleDeviceService deviceService) {
        if (deviceService == null) {
            throw new IllegalArgumentException("my service is null");
        }
        this.deviceService = deviceService;
    }

    @Override
    public SimpleUcastResponse helloGrab(int a, int b) {
        try {
            SimpleDeviceResult result = deviceService.plusNumber(a, b);
            return new SimpleUcastResponse(result.getName(), result.getResult());
        } catch (RemoteException e) {
            return null;
        }
    }
}