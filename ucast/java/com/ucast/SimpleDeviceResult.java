package com.ucast;

import android.os.Parcel;
import android.os.Parcelable;

public final class SimpleDeviceResult implements Parcelable {
    private int result;
    private String name;

    public int getResult() {
        return result;
    }

    public String getName() {
        return name;
    }

    private SimpleDeviceResult(Parcel in) {
        result = in.readInt();
        name = in.readString();
    }

    public SimpleDeviceResult(String name, int result) {
        this.name = name;
        this.result = result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(result);
        dest.writeString(name);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<SimpleDeviceResult> CREATOR = new Parcelable.Creator<SimpleDeviceResult>() {
        @Override
        public SimpleDeviceResult createFromParcel(Parcel in) {
            return new SimpleDeviceResult(in);
        }

        @Override
        public SimpleDeviceResult[] newArray(int size) {
            return new SimpleDeviceResult[size];
        }
    };
}