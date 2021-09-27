package design.easyfactory;

/**
 * @author : Zhang Huang
 * @date : 2021-09-01 4:41 下午
 */
public class ReduceOperation extends AbstractOperation {
    @Override
    public String operation(String numA, String numB) {
        System.out.println("减法运算");
        return numA + "-" + numB;
    }
}
