package com.janetfilter.plugins.power;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class GoForFreeFilter {
    public static byte[] testFilter(byte[] encode) {
        //System.out.println("222222222222222222222222222");
        //System.out.println(new String(encode));
        if (new String(encode).equals("eyJsaWNlbnNlSWQiOiJJSE1XTE1TRUFMIiwibGljZW5zZWVOYW1lIjoidHJlbmRzIHJhYmJpcyIsImFzc2lnbmVlTmFtZSI6IiIsImFzc2lnbmVlRW1haWwiOiIiLCJsaWNlbnNlUmVzdHJpY3Rpb24iOiIiLCJjaGVja0NvbmN1cnJlbnRVc2UiOmZhbHNlLCJwcm9kdWN0cyI6W3siY29kZSI6IlBDIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUFBDIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjp0cnVlfSx7ImNvZGUiOiJQV1MiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTAyLTA4IiwicGFpZFVwVG8iOiIyMDIzLTAyLTA4IiwiZXh0ZW5kZWQiOnRydWV9LHsiY29kZSI6IlBTSSIsImZhbGxiYWNrRGF0ZSI6IjIwMjMtMDItMDgiLCJwYWlkVXBUbyI6IjIwMjMtMDItMDgiLCJleHRlbmRlZCI6dHJ1ZX0seyJjb2RlIjoiUENXTVAiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTAyLTA4IiwicGFpZFVwVG8iOiIyMDIzLTAyLTA4IiwiZXh0ZW5kZWQiOnRydWV9XSwibWV0YWRhdGEiOiIwMTIwMjIwMjA4UFNBTjAwMDAwNSIsImhhc2giOiJUUklBTDozMzQzMzQ3ODMiLCJncmFjZVBlcmlvZERheXMiOjcsImF1dG9Qcm9sb25nYXRlZCI6ZmFsc2UsImlzQXV0b1Byb2xvbmdhdGVkIjpmYWxzZX0")) {
            //System.out.println("src:" + Arrays.toString(encode));
            //System.out.println("transfer" + Arrays.toString(new String(encode).getBytes(StandardCharsets.UTF_8)));
            //System.out.println(new String(Base64.getDecoder().decode("eyJsaWNlbnNlSWQiOiJJSE1XTE1TRUFMIiwibGljZW5zZWVOYW1lIjoidHJlbmRzIHJhYmJpcyIsImFzc2lnbmVlTmFtZSI6IiIsImFzc2lnbmVlRW1haWwiOiIiLCJsaWNlbnNlUmVzdHJpY3Rpb24iOiIiLCJjaGVja0NvbmN1cnJlbnRVc2UiOmZhbHNlLCJwcm9kdWN0cyI6W3siY29kZSI6IlBDIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUFBDIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjp0cnVlfSx7ImNvZGUiOiJQV1MiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTAyLTA4IiwicGFpZFVwVG8iOiIyMDIzLTAyLTA4IiwiZXh0ZW5kZWQiOnRydWV9LHsiY29kZSI6IlBTSSIsImZhbGxiYWNrRGF0ZSI6IjIwMjMtMDItMDgiLCJwYWlkVXBUbyI6IjIwMjMtMDItMDgiLCJleHRlbmRlZCI6dHJ1ZX0seyJjb2RlIjoiUENXTVAiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTAyLTA4IiwicGFpZFVwVG8iOiIyMDIzLTAyLTA4IiwiZXh0ZW5kZWQiOnRydWV9XSwibWV0YWRhdGEiOiIwMTIwMjIwMjA4UFNBTjAwMDAwNSIsImhhc2giOiJUUklBTDozMzQzMzQ3ODMiLCJncmFjZVBlcmlvZERheXMiOjcsImF1dG9Qcm9sb25nYXRlZCI6ZmFsc2UsImlzQXV0b1Byb2xvbmdhdGVkIjpmYWxzZX0=")));
            String lie = "{\"licenseId\":\"IHMWLMSEAL\",\"licenseeName\":\"luogf\",\"assigneeName\":\"\",\"assigneeEmail\":\"\",\"licenseRestriction\":\"\",\"checkConcurrentUse\":false,\"products\":[{\"code\":\"PC\",\"fallbackDate\":\"2023-02-08\",\"paidUpTo\":\"2023-02-08\",\"extended\":false},{\"code\":\"PPC\",\"fallbackDate\":\"2023-02-08\",\"paidUpTo\":\"2023-02-08\",\"extended\":true},{\"code\":\"PWS\",\"fallbackDate\":\"2023-02-08\",\"paidUpTo\":\"2023-02-08\",\"extended\":true},{\"code\":\"PSI\",\"fallbackDate\":\"2023-02-08\",\"paidUpTo\":\"2023-02-08\",\"extended\":true},{\"code\":\"PCWMP\",\"fallbackDate\":\"2023-02-08\",\"paidUpTo\":\"2023-02-08\",\"extended\":true}],\"metadata\":\"0120220208PSAN000005\",\"hash\":\"TRIAL:334334783\",\"gracePeriodDays\":7,\"autoProlongated\":false,\"isAutoProlongated\":false}";
            return Base64.getEncoder().encode(lie.getBytes(StandardCharsets.ISO_8859_1));
            // return new String(encode, StandardCharsets.ISO_8859_1).getBytes(StandardCharsets.ISO_8859_1);
        }
        // System.out.println(new String(Base64.getDecoder().decode(encode)));
        return encode;
    }
}
