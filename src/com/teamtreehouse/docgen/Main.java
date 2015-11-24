package com.teamtreehouse.docgen;

import com.teamtreehouse.math.MathUtils;

public class Main {
    public static void main(String[] args) {
        // Process the MathUtils class's annotations
        /*Class<?> clazz = MathUtils.class;
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method: methods) {
            System.out.printf("%s %n", method.getName());
            System.out.printf("\t# params: %s%n", method.getParameterCount());
            System.out.printf("\treturn type: %s%n", method.getReturnType().getSimpleName());

            int mods = method.getModifiers();
            String modStr = Modifier.toString(mods);
            System.out.printf("\tmodifiers: %s%n", modStr);
        }*/

        DocProcessor.process(MathUtils.class);
    }
}