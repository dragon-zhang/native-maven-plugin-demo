package com.example;

/**
 * @author zhangzicheng
 */
public class LocalApplication {
    public static void main( String[] args ) {
        JniWrapper jni = new JniWrapper();
        System.out.println(jni.getString());
    }
}
