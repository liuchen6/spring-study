package org.liuc.demo02;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userServiceImpl;

    public void setUserService(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    public void insert() {
        log("add");
        userServiceImpl.insert();
    }

    public void delete() {
        log("delete");
        userServiceImpl.delete();
    }

    public void update() {
        log("update");
        userServiceImpl.update();
    }

    public void select() {
        log("select");
        userServiceImpl.select();
    }

    public void log(String msg) {
        System.out.println("使用了"+msg+"方法");
    }
}
