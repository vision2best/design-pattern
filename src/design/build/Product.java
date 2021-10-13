package design.build;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品
 *
 * @author : zhanghuang
 * @date : 2021-10-13 7:01 下午
 */
public class Product {

    List<String> parts = new ArrayList<>();

    /**
     * 添加部件
     *
     * @param part 部件
     */
    public void addPart(String part) {
        parts.add(part);
    }

    /**
     * 展示所有部件
     */
    public void show() {
        parts.forEach(System.out::println);
    }
}
