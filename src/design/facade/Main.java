package design.facade;

/**
 * @author : zhanghuang
 * @date : 2021-09-28 11:28 上午
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }
}
