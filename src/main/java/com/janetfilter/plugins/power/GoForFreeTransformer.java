package com.janetfilter.plugins.power;

import com.janetfilter.core.models.FilterRule;
import com.janetfilter.core.plugin.MyTransformer;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.tree.*;

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
        System.out.println(new String(Base64.getDecoder().decode("eyJsaWNlbnNlSWQiOiJJSE1XTE1TRUFMIiwibGljZW5zZWVOYW1lIjoidHJlbmRzIHJhYmJpcyIsImFzc2lnbmVlTmFtZSI6IiIsImFzc2lnbmVlRW1haWwiOiIiLCJsaWNlbnNlUmVzdHJpY3Rpb24iOiIiLCJjaGVja0NvbmN1cnJlbnRVc2UiOmZhbHNlLCJwcm9kdWN0cyI6W3siY29kZSI6IlBDIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUFBDIiwiZmFsbGJhY2tEYXRlIjoiMjAyMy0wMi0wOCIsInBhaWRVcFRvIjoiMjAyMy0wMi0wOCIsImV4dGVuZGVkIjp0cnVlfSx7ImNvZGUiOiJQV1MiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTAyLTA4IiwicGFpZFVwVG8iOiIyMDIzLTAyLTA4IiwiZXh0ZW5kZWQiOnRydWV9LHsiY29kZSI6IlBTSSIsImZhbGxiYWNrRGF0ZSI6IjIwMjMtMDItMDgiLCJwYWlkVXBUbyI6IjIwMjMtMDItMDgiLCJleHRlbmRlZCI6dHJ1ZX0seyJjb2RlIjoiUENXTVAiLCJmYWxsYmFja0RhdGUiOiIyMDIzLTAyLTA4IiwicGFpZFVwVG8iOiIyMDIzLTAyLTA4IiwiZXh0ZW5kZWQiOnRydWV9XSwibWV0YWRhdGEiOiIwMTIwMjIwMjA4UFNBTjAwMDAwNSIsImhhc2giOiJUUklBTDozMzQzMzQ3ODMiLCJncmFjZVBlcmlvZERheXMiOjcsImF1dG9Qcm9sb25nYXRlZCI6ZmFsc2UsImlzQXV0b1Byb2xvbmdhdGVkIjpmYWxzZX0=")));
        System.out.println("+++++++++++++++++++++++");
        return "java/util/Base64$Decoder";
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
            if ("decode".equals(mn.name)&& "([B)[B".equals(mn.desc)) {
                // System.out.println(mn.desc);
                System.out.println("Just ok 11111111111111111111");
                AbstractInsnNode[] as = mn.instructions.toArray();
                for (int i = 0; i < as.length; i++) {
                    AbstractInsnNode ai = as[i];
                    System.out.println(ai.getOpcode());
                    System.out.println(ai.toString());
                }
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
