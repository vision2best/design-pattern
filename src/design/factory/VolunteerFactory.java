package design.factory;

/**
 * 社区工作者工厂
 *
 * @author : zhanghuang
 * @date : 2021-09-27 2:13 下午
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
