package com.huangxuan.hardlibrary;

public class HardControl {
    public static native int ledCtrl(int which, int status);
    public static native int ledOpen();
    public static native void ledClose();

    static {
        try {
            System.loadLibrary("ledshardcontrol");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}