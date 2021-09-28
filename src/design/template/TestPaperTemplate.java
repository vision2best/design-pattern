package design.template;

/**
 * 模版方法模式，定义一个操作中的算法骨架，将一些步骤延迟到子类中
 *
 * @author : zhanghuang
 * @date : 2021-09-28 10:18 上午
 */
public abstract class TestPaperTemplate {

    public void testQuestion1() {
        System.out.println("杨过得到，后来给了郭靖，炼成倚天剑屠龙刀的玄铁可能是【】");
        System.out.println("a.球墨铸铁 b.马口铁 c.高速合金钢 d.碳素纤维");
        System.out.println("答案" + answer1());
    }

    public void testQuestion2() {
        System.out.println("杨过、程英、陆无双铲除了情花，造成了【】");
        System.out.println("a.使这种植物不再害人 b.使一种珍惜物种灭绝 c.破坏了那个生物圈的平衡性 d.造成该地区沙漠化");
        System.out.println("答案" + answer2());
    }

    public void testQuestion3() {
        System.out.println("蓝凤凰致使华山师徒、桃谷六仙呕吐不止，如果你是大夫，会给他们开什么药【】");
        System.out.println("a.阿司匹林 b.牛黄解毒片 c.氟哌酸 d.让他喝大量的生牛奶 e.以上全不对");
        System.out.println("答案" + answer3());
    }

    abstract String answer1();

    abstract String answer2();

    abstract String answer3();
}
