package design.proxy;

/**
 * Proxy
 *
 * @author : Zhang Huang
 * @date : 2021-09-18 5:07 下午
 */
public class Proxy implements SendGift {

    private final Pursuit pursuit;

    public Proxy(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void sendGift(String giftName) {
        pursuit.sendGift(giftName);
    }
}
