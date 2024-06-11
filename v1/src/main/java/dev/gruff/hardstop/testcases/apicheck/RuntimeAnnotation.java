package dev.gruff.hardstop.testcases.apicheck;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})

public @interface RuntimeAnnotation {

    String title() default "";

    Class action1() default Object.class;
    int action2();

    int action3();

    String id();
}
