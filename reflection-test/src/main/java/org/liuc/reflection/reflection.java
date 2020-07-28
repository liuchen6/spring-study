package org.liuc.reflection;

public class reflection extends Object{

    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的class对象（Class类型的对象）
        Class c1 = Class.forName("org.liuc.reflection.User");
        Class c2 = Class.forName("org.liuc.reflection.User");

        //一个类在内存中只有一个class对象，类被加载后，类的整体结构都封装在class对象中
        System.out.println(c1.hashCode()==c2.hashCode());
    }
}
