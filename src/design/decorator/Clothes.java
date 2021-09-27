package design.decorator;

/**
 * Decorator 装饰者
 *
 * @author : Zhang Huang
 * @date : 2021-09-17 7:05 下午
 */
public abstract class Clothes implements Person {
    private Person person;

    public Clothes(Person person) {
        this.person = person;
    }

    @Override
    public void wearClothes() {
        person.wearClothes();
    }
}
