package design.factory;

/**
 * @author : zhanghuang
 * @date : 2021-09-27 2:09 下午
 */
public class SimpleFactory {
    public static LeiFeng createLeiFeng(String type) {
        LeiFeng leiFeng = null;
        switch (type) {
            case "学雷锋的大学生":
                leiFeng = new Undergraduate();
                break;
            case "社区工作者":
                leiFeng = new Volunteer();
                break;
        }
        return leiFeng;
    }
}
