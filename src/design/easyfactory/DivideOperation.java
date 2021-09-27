package design.easyfactory;

/**
 * @author : Zhang Huang
 * @date : 2021-09-01 4:43 下午
 */
public class DivideOperation extends AbstractOperation{
    @Override
    public String operation(String numA, String numB) {
        System.out.println("除法运算");
        return numA + "/" + numB;
    }
}
