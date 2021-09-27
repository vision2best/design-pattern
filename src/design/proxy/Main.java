package design.proxy;

/**
 * @author : Zhang Huang
 * @date : 2021-09-18 5:12 下午
 */
public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setName("凤姐");
        Proxy proxy = new Proxy(girl);
        proxy.sendGift("洋娃娃");

    }
}
