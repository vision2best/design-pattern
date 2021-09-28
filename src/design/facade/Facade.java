package design.facade;

/**
 * @author : zhanghuang
 * @date : 2021-09-28 11:23 上午
 */
public class Facade {
    private final SubSystemOne subSystemOne;
    private final SubSystemTwo subSystemTwo;
    private final SubSystemThree subSystemThree;
    private final SubSystemFour subSystemFour;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("方法组A：");
        subSystemOne.method();
        subSystemTwo.method();
    }

    public void methodB() {
        System.out.println("方法组B：");
        subSystemTwo.method();
        subSystemThree.method();
    }

    public void methodC() {
        System.out.println("方法组C：");
        subSystemThree.method();
        subSystemFour.method();
    }

}
