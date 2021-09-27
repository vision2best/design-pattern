package design.decorator;

/**
 * @author : Zhang Huang
 * @date : 2021-09-17 7:12 下午
 */
public class Main {
    public static void main(String[] args) {
        Person person = new OldKingPerson();
        Clothes cloths = new Coat(new Shirt(new Underwear(person)));
        cloths.wearClothes();
    }
}
