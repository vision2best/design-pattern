package design.easyfactory;

/**
 * @author : Zhang Huang
 * @date : 2021-09-01 4:44 下午
 */
public class OperationFactory {
    public static AbstractOperation createOperation(String operate) {
        AbstractOperation operation = null;
        switch (operate) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new ReduceOperation();
                break;
            case "*":
                operation = new MultiplyOperation();
                break;
            case "/":
                operation = new DivideOperation();
                break;
        }
        return operation;
    }
}
