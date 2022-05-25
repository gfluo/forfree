package com.janetfilter.plugins.power;

import com.janetfilter.core.models.FilterRule;
import com.janetfilter.core.plugin.MyTransformer;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.tree.*;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Base64;

import static jdk.internal.org.objectweb.asm.Opcodes.*;
import static sun.java2d.cmm.ColorTransform.In;

public class GoForFreeTransformer implements MyTransformer {
    public GoForFreeTransformer(List<FilterRule> rules) {
        //ArgsFilter.setRules(rules);
    }

    @Override
    public String getHookClassName() {
        /*String licence = new String(Base64.getDecoder().decode("eyJsaWNlbnNlSWQiOiJJSE1XTE1TRUFMIiwibGljZW5zZWVOYW1lIjoidHJlbmRzIHJhYmJpcyIsImFzc2lnbmVlTmFtZSI6IiIsImFzc2lnbmVlRW1haWwiOiIiLCJsaWNlbnNlUmVzdHJpY3Rpb24iOiIiLCJjaGVja0NvbmN1cnJlbnRVc2UiOmZhbHNlLCJwcm9kdWN0cyI6W3siY29kZSI6IlBDIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUFBDIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjp0cnVlfSx7ImNvZGUiOiJQV1MiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTAyLTA4IiwicGFpZFVwVG8iOiIyMDIzLTAyLTA4IiwiZXh0ZW5kZWQiOnRydWV9LHsiY29kZSI6IlBTSSIsImZhbGxiYWNrRGF0ZSI6IjIwMjMtMDItMDgiLCJwYWlkVXBUbyI6IjIwMjMtMDItMDgiLCJleHRlbmRlZCI6dHJ1ZX0seyJjb2RlIjoiUENXTVAiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTAyLTA4IiwicGFpZFVwVG8iOiIyMDIzLTAyLTA4IiwiZXh0ZW5kZWQiOnRydWV9XSwibWV0YWRhdGEiOiIwMTIwMjIwMjA4UFNBTjAwMDAwNSIsImhhc2giOiJUUklBTDozMzQzMzQ3ODMiLCJncmFjZVBlcmlvZERheXMiOjcsImF1dG9Qcm9sb25nYXRlZCI6ZmFsc2UsImlzQXV0b1Byb2xvbmdhdGVkIjpmYWxzZX0"));
        System.out.println("Old+++++++++++++++++++++++: " + licence);
        licence = licence.replace("trends rabbis", "luogf");
        System.out.println("New+++++++++++++++++++++++: " + licence);
        byte[] newEncode = Base64.getEncoder().encode(licence.getBytes(StandardCharsets.ISO_8859_1));
        System.out.println(new String(newEncode, StandardCharsets.ISO_8859_1));
        System.out.println("Transfer++++++++++++++++++++++" + new String(Base64.getDecoder().decode(newEncode)));

        String replace = "eyJsaWNlbnNlSWQiOiJJSE1XTE1TRUFMIiwibGljZW5zZWVOYW1lIjoibHVvZ2YiLCJhc3NpZ25lZU5hbWUiOiIiLCJhc3NpZ25lZUVtYWlsIjoiIiwibGljZW5zZVJlc3RyaWN0aW9uIjoiIiwiY2hlY2tDb25jdXJyZW50VXNlIjpmYWxzZSwicHJvZHVjdHMiOlt7ImNvZGUiOiJQQyIsImZhbGxiYWNrRGF0ZSI6IjIwMjMtMDItMDgiLCJwYWlkVXBUbyI6IjIwMjMtMDItMDgiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlBQQyIsImZhbGxiYWNrRGF0ZSI6IjIwMjMtMDItMDgiLCJwYWlkVXBUbyI6IjIwMjMtMDItMDgiLCJleHRlbmRlZCI6dHJ1ZX0seyJjb2RlIjoiUFdTIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjp0cnVlfSx7ImNvZGUiOiJQU0kiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTAyLTA4IiwicGFpZFVwVG8iOiIyMDIzLTAyLTA4IiwiZXh0ZW5kZWQiOnRydWV9LHsiY29kZSI6IlBDV01QIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjp0cnVlfV0sIm1ldGFkYXRhIjoiMDEyMDIyMDIwOFBTQU4wMDAwMDUiLCJoYXNoIjoiVFJJQUw6MzM0MzM0NzgzIiwiZ3JhY2VQZXJpb2REYXlzIjo3LCJhdXRvUHJvbG9uZ2F0ZWQiOmZhbHNlLCJpc0F1dG9Qcm9sb25nYXRlZCI6ZmFsc2V9";
        System.out.println("TransferENcode++++++++++++++++++++++" + new String(Base64.getDecoder().decode(replace.getBytes(StandardCharsets.ISO_8859_1))));
        *//*String replace = "JTdCJTIybGljZW5zZUlkJTIyJTNBJTIySUhNV0xNU0VBTCUyMiUyQyUyMmxpY2Vuc2VlTmFtZSUyMiUzQSUyMmx1b2dmJTIyJTJDJTIyYXNzaWduZWVOYW1lJTIyJTNBJTIyJTIyJTJDJTIyYXNzaWduZWVFbWFpbCUyMiUzQSUyMiUyMiUyQyUyMmxpY2Vuc2VSZXN0cmljdGlvbiUyMiUzQSUyMiUyMiUyQyUyMmNoZWNrQ29uY3VycmVudFVzZSUyMiUzQWZhbHNlJTJDJTIycHJvZHVjdHMlMjIlM0ElNUIlN0IlMjJjb2RlJTIyJTNBJTIyUEMlMjIlMkMlMjJmYWxsYmFja0RhdGUlMjIlM0ElMjIyMDIzLTAyLTA4JTIyJTJDJTIycGFpZFVwVG8lMjIlM0ElMjIyMDIzLTAyLTA4JTIyJTJDJTIyZXh0ZW5kZWQlMjIlM0FmYWxzZSU3RCUyQyU3QiUyMmNvZGUlMjIlM0ElMjJQUEMlMjIlMkMlMjJmYWxsYmFja0RhdGUlMjIlM0ElMjIyMDIzLTAyLTA4JTIyJTJDJTIycGFpZFVwVG8lMjIlM0ElMjIyMDIzLTAyLTA4JTIyJTJDJTIyZXh0ZW5kZWQlMjIlM0F0cnVlJTdEJTJDJTdCJTIyY29kZSUyMiUzQSUyMlBXUyUyMiUyQyUyMmZhbGxiYWNrRGF0ZSUyMiUzQSUyMjIwMjMtMDItMDglMjIlMkMlMjJwYWlkVXBUbyUyMiUzQSUyMjIwMjMtMDItMDglMjIlMkMlMjJleHRlbmRlZCUyMiUzQXRydWUlN0QlMkMlN0IlMjJjb2RlJTIyJTNBJTIyUFNJJTIyJTJDJTIyZmFsbGJhY2tEYXRlJTIyJTNBJTIyMjAyMy0wMi0wOCUyMiUyQyUyMnBhaWRVcFRvJTIyJTNBJTIyMjAyMy0wMi0wOCUyMiUyQyUyMmV4dGVuZGVkJTIyJTNBdHJ1ZSU3RCUyQyU3QiUyMmNvZGUlMjIlM0ElMjJQQ1dNUCUyMiUyQyUyMmZhbGxiYWNrRGF0ZSUyMiUzQSUyMjIwMjMtMDItMDglMjIlMkMlMjJwYWlkVXBUbyUyMiUzQSUyMjIwMjMtMDItMDglMjIlMkMlMjJleHRlbmRlZCUyMiUzQXRydWUlN0QlNUQlMkMlMjJtZXRhZGF0YSUyMiUzQSUyMjAxMjAyMjAyMDhQU0FOMDAwMDA1JTIyJTJDJTIyaGFzaCUyMiUzQSUyMlRSSUFMJTNBMzM0MzM0NzgzJTIyJTJDJTIyZ3JhY2VQZXJpb2REYXlzJTIyJTNBNyUyQyUyMmF1dG9Qcm9sb25nYXRlZCUyMiUzQWZhbHNlJTJDJTIyaXNBdXRvUHJvbG9uZ2F0ZWQlMjIlM0FmYWxzZSU3RA==";
        System.out.println(new String(Base64.getEncoder().encode(replace.getBytes(StandardCharsets.UTF_8))));*/
        // return "java/util/Base64$Decoder";
        return "com/jetbrains/ls/responses/ObtainLicenseResponse";
    }

    @Override
    public byte[] transform(String className, byte[] classBytes, int order) throws Exception {
        // Base64.getDecoder().decode(base64encodedString);
        System.out.println("your yd=lsl, ----------------");
        ClassReader reader = new ClassReader(classBytes);
        ClassNode node = new ClassNode(ASM5);
        reader.accept(node, 0);

        for (MethodNode mn : node.methods) {
            System.out.println(mn.name);
            System.out.println(mn.desc);
            if ("getPropertyValueString".equals(mn.name)) {//&& "([B)[B".equals(mn.desc)) {
                // System.out.println(mn.desc);
                System.out.println("Just ok 11111111111111111111");
                InsnList list = new InsnList();
                // list.add(new VarInsnNode(ALOAD, 0));
                list.add(new VarInsnNode(ALOAD, 1));
                list.add(new MethodInsnNode(INVOKESTATIC, "com/janetfilter/plugins/power/GoForFreeFilter", "testFilter", "([B)[B", false));
                list.add(new VarInsnNode(ASTORE, 1));
                mn.instructions.insert(list);
            }
        }

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        node.accept(writer);

        return writer.toByteArray();
    }
}
