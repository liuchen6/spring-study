package org.liuc.dao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    //利用set进行动态参数的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void getUser() {
        userDao.getUser();
    }
}
