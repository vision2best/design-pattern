package design.easyfactory;

/**
 * @author : Zhang Huang
 * @date : 2021-09-01 4:37 下午
 */
public class AddOperation extends AbstractOperation {

    @Override
    public String operation(String numA, String numB) {
        System.out.println("加法运算");
        return numA + "+" + numB;
    }
}
