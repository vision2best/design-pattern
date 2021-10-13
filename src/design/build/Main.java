package design.build;

/**
 * @author : zhanghuang
 * @date : 2021-10-13 7:12 下午
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuild1 concreteBuild1 = new ConcreteBuild1();
        ConcreteBuild2 concreteBuild2 = new ConcreteBuild2();
        director.construct(concreteBuild1);
        Product result = concreteBuild1.getResult();
        result.show();

        director.construct(concreteBuild2);
        Product result1 = concreteBuild2.getResult();
        result1.show();
    }
}
