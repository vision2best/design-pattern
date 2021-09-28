package design.template;

/**
 * @author : zhanghuang
 * @date : 2021-09-28 10:25 上午
 */
public class TestPaperA extends TestPaperTemplate {
    @Override
    String answer1() {
        return "b";
    }

    @Override
    String answer2() {
        return "c";
    }

    @Override
    String answer3() {
        return "a";
    }
}
