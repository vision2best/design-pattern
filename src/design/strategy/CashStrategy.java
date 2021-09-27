package design.strategy;

/**
 * 收费算法接口
 *
 * @author : Zhang Huang
 * @date : 2021-09-16 7:16 下午
 */
public interface CashStrategy {
    double acceptCash(double money);
}
