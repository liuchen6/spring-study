package test;

public class Demo1 {

    /*
    * 懒汉式
    * */

    //私有化构造器
    private Demo1() {

    }

    //创建静态内部类
    private static class Inner{
        //定义实例
        private static final Demo1 INSTANCE = new Demo1();
    }

    //对外提供接口
    public static Demo1 getInstance() {
        return Inner.INSTANCE;
    }
}
