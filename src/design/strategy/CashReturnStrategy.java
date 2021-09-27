package design.strategy;

/**
 * 满返策略
 *
 * @author : Zhang Huang
 * @date : 2021-09-16 7:20 下午
 */
public class CashReturnStrategy implements CashStrategy {
    //满多少
    private double moneyCondition = 0;
    //返多少
    private double moneyReturn = 0;

    public CashReturnStrategy(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            //每满返
            result = money - money / moneyCondition * moneyReturn;
        }
        return result;
    }
}
