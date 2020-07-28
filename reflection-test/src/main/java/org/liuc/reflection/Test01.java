package org.liuc.reflection;

//Class类的创建方式
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //方法一：通过【对象】获取Class类
        Person person = new Student();

        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        //方法二：通过【forName】获取
        Class c2 = Class.forName("org.liuc.reflection.Student");
        System.out.println(c2.hashCode());

        //方法三：通过【类名.class】获取
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //方法四：基本类型的包装类都有一个Type属性，可以获取Class类
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        //根据子类获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5.hashCode());

    }

}

class Person {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {
    public Student() {
        this.name = "学生01";
    }
}

class Teacher extends Person {
    public Teacher() {
        this.name = "老师01";
    }
}
