package design.prototype;

/**
 * @author : zhanghuang
 * @date : 2021-09-27 3:47 下午
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("zhangsan");
        a.setPersonInfo("男", "27");
        a.setWorkExperience("2021-至今", "servyou");
        Resume b = a.clone();
        b.setWorkExperience("2020-至今","bianque");
        a.display();
        b.display();
    }
}
