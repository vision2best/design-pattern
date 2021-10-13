package design.build;

/**
 * @author : zhanghuang
 * @date : 2021-10-13 7:08 下午
 */
public class ConcreteBuild1 extends Build {

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("部件X");
    }

    @Override
    public void buildPartB() {
        product.addPart("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
