package org.liuc.annotation;

import java.lang.annotation.*;

public class Test01 {

    @MyAnnotation
    public void test() {

    }

    //定义一个注解
    //Target：说明了Annotation所修饰的对象范围：Annotation可被用于 packages、types（类、接口、枚举、Annotation类型）、
    // 类型成员（方法、构造方法、成员变量、枚举值）、方法参数和本地变量（如循环变量、catch参数）。
    // 在Annotation类型的声明中使用了target可更加明晰其修饰的目标。
    @Target(value = {ElementType.METHOD,ElementType.TYPE})

    //Retention:作用是定义被它所注解的注解保留多久，一共有三种策略，定义在RetentionPolicy枚举中.
    //从注释上看：
    //source：注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃；被编译器忽略
    //class：注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期
    //runtime：注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在
    //这3个生命周期分别对应于：Java源文件(.java文件) ---> .class文件 ---> 内存中的字节码。
    @Retention(value = RetentionPolicy.RUNTIME)

    //Documented：表明这个注释是由 javadoc记录的，在默认情况下也有类似的记录工具。 如果一个类型声明被注释了文档化，它的注释成为公共API的一部分。
    @Documented

    //Inherited：子类可以继承父类的注解
    @Inherited
    @interface MyAnnotation {

    }
}
