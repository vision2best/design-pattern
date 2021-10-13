package design.build;

/**
 * @author : zhanghuang
 * @date : 2021-10-13 7:11 下午
 */
public class Director {
    public void construct(Build build) {
        build.buildPartA();
        build.buildPartB();
    }
}
