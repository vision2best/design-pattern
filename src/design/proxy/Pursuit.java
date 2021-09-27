package design.proxy;

/**
 * Real Subject
 *
 * @author : Zhang Huang
 * @date : 2021-09-18 5:06 下午
 */
public class Pursuit implements SendGift {

    private final Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void sendGift(String giftName) {
        System.out.println(girl.getName() + "收到" + giftName + "礼物");
    }
}
