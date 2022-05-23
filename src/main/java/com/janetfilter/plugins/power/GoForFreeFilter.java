package com.janetfilter.plugins.power;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class GoForFreeFilter {
    public static byte[] testFilter(byte[] encode) {
        System.out.println("222222222222222222222222222");
        // System.out.println(String.valueOf(encode));
        return "fuck our".getBytes(StandardCharsets.UTF_8);
    }
}
