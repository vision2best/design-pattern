package design.easyfactory;

/**
 * @author : Zhang Huang
 * @date : 2021-09-01 4:42 下午
 */
public class MultiplyOperation extends AbstractOperation{
    @Override
    public String operation(String numA, String numB) {
        System.out.println("乘法运算");
        return numA + "*" + numB;
    }
}
