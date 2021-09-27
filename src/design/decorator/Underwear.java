package design.decorator;

/**
 * @author : Zhang Huang
 * @date : 2021-09-17 7:08 下午
 */
public class Underwear extends Clothes {
    public Underwear(Person person) {
        super(person);
        System.out.println("内衣");
    }
    public void wear01() {
        System.out.println("第一步：套进一件很薄的内衣");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        wear01();// 穿内衣
    }
}
