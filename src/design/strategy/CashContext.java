package design.strategy;

/**
 * 结合工厂模式 + 策略模式
 *
 * @author : Zhang Huang
 * @date : 2021-09-16 7:24 下午
 */
public class CashContext {
    private CashStrategy cashStrategy;

    public CashContext(CashStrategy cashStrategy) {
        this.cashStrategy = cashStrategy;
    }

    public CashContext(String type) {
        //可以利用反射来new 策略
        if ("正常收费".equals(type)) {
            cashStrategy = new CashNormalStrategy();
        } else if ("满300返100".equals(type)) {
            cashStrategy = new CashReturnStrategy(300, 100);
        } else if ("打8折".equals(type)) {
            cashStrategy = new CashDiscountStrategy(0.8);

        }
    }

    public double acceptCash(double money) {
        return cashStrategy.acceptCash(money);
    }
}
