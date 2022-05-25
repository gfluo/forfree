package com.janetfilter.plugins.power;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class GoForFreeFilter {
    public static byte[] testFilter(byte[] encode) {

        if (new String(encode).equals("eyJsaWNlbnNlSWQiOiJJSE1XTE1TRUFMIiwibGljZW5zZWVOYW1lIjoidHJlbmRzIHJhYmJpcyIsImFzc2lnbmVlTmFtZSI6IiIsImFzc2lnbmVlRW1haWwiOiIiLCJsaWNlbnNlUmVzdHJpY3Rpb24iOiIiLCJjaGVja0NvbmN1cnJlbnRVc2UiOmZhbHNlLCJwcm9kdWN0cyI6W3siY29kZSI6IlBDIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUFBDIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjp0cnVlfSx7ImNvZGUiOiJQV1MiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTAyLTA4IiwicGFpZFVwVG8iOiIyMDIzLTAyLTA4IiwiZXh0ZW5kZWQiOnRydWV9LHsiY29kZSI6IlBTSSIsImZhbGxiYWNrRGF0ZSI6IjIwMjMtMDItMDgiLCJwYWlkVXBUbyI6IjIwMjMtMDItMDgiLCJleHRlbmRlZCI6dHJ1ZX0seyJjb2RlIjoiUENXTVAiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTAyLTA4IiwicGFpZFVwVG8iOiIyMDIzLTAyLTA4IiwiZXh0ZW5kZWQiOnRydWV9XSwibWV0YWRhdGEiOiIwMTIwMjIwMjA4UFNBTjAwMDAwNSIsImhhc2giOiJUUklBTDozMzQzMzQ3ODMiLCJncmFjZVBlcmlvZERheXMiOjcsImF1dG9Qcm9sb25nYXRlZCI6ZmFsc2UsImlzQXV0b1Byb2xvbmdhdGVkIjpmYWxzZX0")) {
            // System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");

        }
        // System.out.println(new String(Base64.getDecoder().decode(encode)));
        return encode;
    }
}
