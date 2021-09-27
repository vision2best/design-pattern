package design.decorator;

/**
 * 被装饰者
 *
 * @author : Zhang Huang
 * @date : 2021-09-17 7:06 下午
 */
public class OldKingPerson implements Person {
    @Override
    public void wearClothes() {
        // TODO Auto-generated method stub
        System.out.println("今天衣服怎么穿呢");
    }
}
