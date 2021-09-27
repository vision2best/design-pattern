package design.strategy;

/**
 * 正常收费策略
 *
 * @author : Zhang Huang
 * @date : 2021-09-16 7:17 下午
 */
public class CashNormalStrategy implements CashStrategy {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
