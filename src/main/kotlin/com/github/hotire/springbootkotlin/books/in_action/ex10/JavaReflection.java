package com.github.hotire.springbootkotlin.books.in_action.ex10;

import javax.validation.constraints.NotNull;
import java.util.Arrays;

public class JavaReflection {

    @NotNull
    public void method() {

    }

    public static void reflection() {
        Arrays.stream(JavaReflection.class.getDeclaredMethods()).forEach(method -> {
            method.isAnnotationPresent(Deprecated.class);
            Deprecated deprecated = method.getAnnotation(Deprecated.class);
            System.out.println(deprecated);
        });
    }

    public static void main(String ... args) {
        reflection();
    }

}
