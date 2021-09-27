package design.strategy;

/**
 * 打折收费策略
 *
 * @author : Zhang Huang
 * @date : 2021-09-16 7:18 下午
 */
public class CashDiscountStrategy implements CashStrategy {
    //折扣
    private double discountRate = 1;

    public CashDiscountStrategy(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double acceptCash(double money) {
        return money * discountRate;
    }
}
