package com.example;

public class RemoteApplication {
    public static void main( String[] args ) {
        JniWrapper jni = new JniWrapper();
        System.out.println(jni.getString());
    }
}
