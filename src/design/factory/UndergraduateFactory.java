package design.factory;

/**
 * 学雷锋大学生工厂
 *
 * @author : zhanghuang
 * @date : 2021-09-27 2:12 下午
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
