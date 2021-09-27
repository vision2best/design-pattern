package design.easyfactory;

/**
 * @author : Zhang Huang
 * @date : 2021-09-01 4:48 下午
 */
public class Main {
    public static void main(String[] args) {
        AbstractOperation operation = OperationFactory.createOperation("+");
        String result = operation.operation("1", "2");
        System.out.println(result);
        operation = OperationFactory.createOperation("-");
        result = operation.operation("1", "2");
        System.out.println(result);
        operation = OperationFactory.createOperation("*");
        result = operation.operation("1", "2");
        System.out.println(result);
        operation = OperationFactory.createOperation("/");
        result = operation.operation("1", "2");
        System.out.println(result);
    }
}
