package com.janetfilter.plugins.power;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class GoForFreeFilter {
    public static String testFilter(String encode) {
        if (encode.equals("2023-06-01")) {
            return "2099-12-31";
        }
        return encode;
    }
}
