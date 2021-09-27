package design.decorator;

/**
 * @author : Zhang Huang
 * @date : 2021-09-17 7:09 下午
 */
public class Shirt extends Clothes {
    public Shirt(Person person) {
        super(person);
        System.out.println("衬衣");
    }

    public void wear02() {
        System.out.println("第二步：扣上一件帅气的衬衣");
    }

    @Override
    public void wearClothes() {
        // TODO Auto-generated method stub
        super.wearClothes();
        wear02();
    }
}
