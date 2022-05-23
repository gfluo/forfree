package com.janetfilter.plugins.power;

import com.janetfilter.core.models.FilterRule;
import com.janetfilter.core.plugin.MyTransformer;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.tree.*;

import java.util.List;
import java.util.Base64;

import static jdk.internal.org.objectweb.asm.Opcodes.*;

public class GoForFreeTransformer implements MyTransformer {
    public GoForFreeTransformer(List<FilterRule> rules) {
        //ArgsFilter.setRules(rules);
    }

    @Override
    public String getHookClassName() {
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
                InsnList list = new InsnList();
                // list.add(new VarInsnNode(ALOAD, 0));
                list.add(new VarInsnNode(ALOAD, 1));
                list.add(new MethodInsnNode(INVOKESTATIC, "com/janetfilter/plugins/power/GoForFreeFilter", "testFilter", "\"(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;\"", false));
                list.add(new VarInsnNode(ASTORE, 1));
                mn.instructions.insert(list);
            }
        }

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        node.accept(writer);

        return writer.toByteArray();
    }
}
