package design.template;

/**
 * @author : zhanghuang
 * @date : 2021-09-28 10:26 上午
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("学生A抄的试卷：");
        TestPaperA testPaperA = new TestPaperA();
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        testPaperA.testQuestion3();

        System.out.println("=======================");

        System.out.println("学生B抄的试卷：");
        TestPaperB testPaperB = new TestPaperB();
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();
    }
}
