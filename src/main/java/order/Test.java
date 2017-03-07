package order;

import order.com.com.com.TargetCom;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geyao on 2017/3/6.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        TargetBean targetBean = context.getBean("targetBean", TargetBean.class);

        targetBean.fun("测试");
        System.out.println();
        targetBean.foo();
        System.out.println();
        targetBean.add("蜡笔小丑","马戏团");

        TargetCom targetCom = context.getBean("targetCom", TargetCom.class);
        System.out.println();
        targetCom.foo();
    }
}
