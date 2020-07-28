package org.liuc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test02 {
    //定义注解MyAnnotation
    @Target({ElementType.TYPE,ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation{
        //注解的参数：参数类型 + 参数名()
        String name() default "";
        int age();
        int id() default -1;        //如果默认值为-1，代表不存在
        String[] schools() default {"南大"};

    }

    //使用注解MyAnnotation
    @MyAnnotation(age = 18)
    public void test() {

    }

    //定义注解MyAnnotation2
    @Target({ElementType.TYPE,ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation2 {
        String value();
    }

    //使用注解MyAnnotation2
    @MyAnnotation2("liuc")      //注解中定义的参数名为value，则在使用该注解时，可以省略写value
    public void test2() {

    }

}
