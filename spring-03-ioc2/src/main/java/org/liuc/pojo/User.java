package org.liuc.pojo;

public class User {

    private String name;

    public User() {
        System.out.println("User的无参构造函数被创建了！");
    }

    /*public User(String name) {
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
