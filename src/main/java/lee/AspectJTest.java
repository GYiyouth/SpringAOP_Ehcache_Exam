package lee;

import order.TargetBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geyao on 2017/3/5.
 */
public class AspectJTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("从spring容器获取实现了接口的对象");
        HelloInterface hello = context.getBean("hello", HelloInterface.class);
        hello.foo();

//        System.out.println("\n从spring容器直接获取实现类");
//        Hello helloImpl = context.getBean("hello", Hello.class);
//          上面这句代码有问题，会报错Bean named 'hello' is expected to be of type 'lee.Hello' but was actually of type 'com.sun.proxy.$Proxy7'
//        helloImpl.foo();
//        helloImpl.addUser("容器获取获取", "不是接口");

//        System.out.println("\n不从spring容器里获取到的对象， 会触发增强吗");
//        HelloInterface hello1 = new Hello();
//        hello1.foo();
//        hello1.addUser("fa ", " erwe");

//        System.out.println("\n从spring容器里获取的对象，没有实现接口，会触发接口吗");
//        World world = context.getBean("world", World.class);
//        try {
//            world.foo();
//        }catch (Exception e){
//            System.out.println("catch!!!");
//        }

//        int n = world.getNum();
//        System.out.println();
//        System.out.println(n);
//        world.setNum(5);
//        System.out.println(world.getNum());
//        world.setNum(2);
//        world.addUser("容器获取获取", "不是接口");

//        TargetBean targetBean = context.getBean("target", TargetBean.class);
//        targetBean.fun("123");
    }
}
