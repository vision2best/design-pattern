package design.build;

/**
 * @author : zhanghuang
 * @date : 2021-10-13 7:09 下午
 */
public class ConcreteBuild2 extends Build {

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("部件A");
    }

    @Override
    public void buildPartB() {
        product.addPart("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
