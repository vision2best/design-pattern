package design.factory;

/**
 * 测试工厂模式
 *
 * @author : zhanghuang
 * @date : 2021-09-27 2:14 下午
 */
public class Main {
    public static void main(String[] args) {
        IFactory undergraduateFactory = new UndergraduateFactory();
        LeiFeng student = undergraduateFactory.createLeiFeng();
        IFactory volunteerFactory = new VolunteerFactory();
        LeiFeng volunteer = volunteerFactory.createLeiFeng();
        student.sweep();
        student.wash();
        student.buyRice();


        volunteer.sweep();
        volunteer.wash();
        volunteer.buyRice();
    }
}
