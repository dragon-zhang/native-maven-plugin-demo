package com.example;

import org.scijava.nativelib.NativeLoader;

import java.io.IOException;

public class JniWrapper {

    final private static String LIB_NAME = "jnilibrary";

    static {
        try {
            NativeLoader.loadLibrary(LIB_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public native String getString();
}
