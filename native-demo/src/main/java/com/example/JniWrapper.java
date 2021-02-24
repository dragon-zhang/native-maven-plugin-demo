package com.example;

import org.scijava.nativelib.NativeLoader;

import java.io.IOException;

public class JniWrapper {

    private final static String LIB_NAME = "JniLibrary";

    static {
        try {
            NativeLoader.loadLibrary(LIB_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public native String getString();
}
