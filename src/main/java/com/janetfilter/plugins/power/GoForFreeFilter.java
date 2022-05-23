package com.janetfilter.plugins.power;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GoForFreeFilter {
    public static byte[] testFilter(byte[] encode) {
        System.out.println("222222222222222222222222222");
        System.out.println(String.valueOf(encode));
        // System.out.println(String.valueOf(Base64.getDecoder().decode(encode)));
        return encode;
    }
}
