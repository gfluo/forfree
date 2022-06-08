package com.janetfilter.plugins.power;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class GoForFreeFilter {
    public static String testFilter(String encode) {
        if (encode.equals("2023-02-08")) {
            return "2099-12-31";
        }
        // System.out.println(new String(encode));
        // if (new String(encode).equals("eyJsaWNlbnNlSWQiOiJIT1FTMFpBNllKIiwibGljZW5zZWVOYW1lIjoiaHlwb3MgdGltYnJlcyIsImFzc2lnbmVlTmFtZSI6IiIsImFzc2lnbmVlRW1haWwiOiIiLCJsaWNlbnNlUmVzdHJpY3Rpb24iOiIiLCJjaGVja0NvbmN1cnJlbnRVc2UiOmZhbHNlLCJwcm9kdWN0cyI6W3siY29kZSI6IlBDV01QIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wNC0xMyIsInBhaWRVcFRvIjoiMjAyMy0wNC0xMyIsImV4dGVuZGVkIjp0cnVlfSx7ImNvZGUiOiJQV1MiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTA0LTEzIiwicGFpZFVwVG8iOiIyMDIzLTA0LTEzIiwiZXh0ZW5kZWQiOnRydWV9LHsiY29kZSI6IlBTSSIsImZhbGxiYWNrRGF0ZSI6IjIwMjMtMDQtMTMiLCJwYWlkVXBUbyI6IjIwMjMtMDQtMTMiLCJleHRlbmRlZCI6dHJ1ZX0seyJjb2RlIjoiV1MiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTA0LTEzIiwicGFpZFVwVG8iOiIyMDIzLTA0LTEzIiwiZXh0ZW5kZWQiOmZhbHNlfV0sIm1ldGFkYXRhIjoiMDEyMDIyMDQxMVBTQU4wMDAwMDUiLCJoYXNoIjoiVFJJQUw6LTE4Mjc3NTAwNjMiLCJncmFjZVBlcmlvZERheXMiOjcsImF1dG9Qcm9sb25nYXRlZCI6ZmFsc2UsImlzQXV0b1Byb2xvbmdhdGVkIjpmYWxzZX0=")) {
            //System.out.println("decode licence----------------------------------------");
            //String replace = "eyJsaWNlbnNlSWQiOiJIT1FTMFpBNllKIiwibGljZW5zZWVOYW1lIjoibHVvZ2YiLCJhc3NpZ25lZU5hbWUiOiIiLCJhc3NpZ25lZUVtYWlsIjoiIiwibGljZW5zZVJlc3RyaWN0aW9uIjoiIiwiY2hlY2tDb25jdXJyZW50VXNlIjpmYWxzZSwicHJvZHVjdHMiOlt7ImNvZGUiOiJQQ1dNUCIsImZhbGxiYWNrRGF0ZSI6IjIwMjMtMDQtMTMiLCJwYWlkVXBUbyI6IjIwMjMtMDQtMTMiLCJleHRlbmRlZCI6dHJ1ZX0seyJjb2RlIjoiUFdTIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wNC0xMyIsInBhaWRVcFRvIjoiMjAyMy0wNC0xMyIsImV4dGVuZGVkIjp0cnVlfSx7ImNvZGUiOiJQU0kiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTA0LTEzIiwicGFpZFVwVG8iOiIyMDIzLTA0LTEzIiwiZXh0ZW5kZWQiOnRydWV9LHsiY29kZSI6IldTIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wNC0xMyIsInBhaWRVcFRvIjoiMjAyMy0wNC0xMyIsImV4dGVuZGVkIjpmYWxzZX1dLCJtZXRhZGF0YSI6IjAxMjAyMjA0MTFQU0FOMDAwMDA1IiwiaGFzaCI6IlRSSUFMOi0xODI3NzUwMDYzIiwiZ3JhY2VQZXJpb2REYXlzIjo3LCJhdXRvUHJvbG9uZ2F0ZWQiOmZhbHNlLCJpc0F1dG9Qcm9sb25nYXRlZCI6ZmFsc2V9";
            //return replace.getBytes();
        //}
        // System.out.println(new String(Base64.getDecoder().decode(encode)));
        System.out.println(encode);
        return encode;
    }
}
