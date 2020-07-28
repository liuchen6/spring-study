package org.liuc.pojo;

public class User2 {

    private String name;

    public User2() {
        System.out.println("User2的无参构造函数被创建了！");
    }

    /*public User2(String name) {
        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show() {
        System.out.println("name="+name);
    }
}
