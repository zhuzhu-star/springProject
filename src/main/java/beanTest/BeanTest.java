package beanTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/2 1:07 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class BeanTest {
    public static void main(String[] args) {
        //获取到配置bean的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object beanTest = applicationContext.getBean("beanOne");
        System.out.println(applicationContext.getBean("beanOne"));
    }
}
