package design.decorator;

/**
 * @author : Zhang Huang
 * @date : 2021-09-17 7:10 下午
 */
public class Coat extends Clothes {
    public Coat(Person person) {
        super(person);
        System.out.println("外套");
    }

    public void wear03() {
        System.out.println("第三步：披上一件大气的外套");
    }

    @Override
    public void wearClothes() {
        // TODO Auto-generated method stub
        super.wearClothes();
        wear03();
    }

}
