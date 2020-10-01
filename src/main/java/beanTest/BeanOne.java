package beanTest;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/2 1:17 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class BeanOne {

    private String name;

    public BeanOne(){
        System.out.println("这是BeanOne的构造函数");
    }

    void speak() {
        System.out.println("这是beanOne");
    }

    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }
}
