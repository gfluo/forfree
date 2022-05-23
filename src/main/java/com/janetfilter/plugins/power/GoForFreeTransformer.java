package com.janetfilter.plugins.power;

import com.janetfilter.core.models.FilterRule;
import com.janetfilter.core.plugin.MyTransformer;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.tree.ClassNode;
import jdk.internal.org.objectweb.asm.tree.MethodNode;

import java.util.List;

import static jdk.internal.org.objectweb.asm.Opcodes.ASM5;

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
        System.out.println("your yd=lsl, ----------------");
        ClassReader reader = new ClassReader(classBytes);
        ClassNode node = new ClassNode(ASM5);
        reader.accept(node, 0);

        for (MethodNode mn : node.methods) {
            System.out.println(mn.name);
        }

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        node.accept(writer);

        return writer.toByteArray();
    }
}