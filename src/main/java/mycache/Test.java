package mycache;

import lee.World;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geyao on 2017/3/7.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
//        System.out.println();
//        World w1 = userService.getWorld1("孙悟空", 500);
//        System.out.println();
//        World w2 = userService.getWorld2("孙悟空", 400);
//        System.out.println();
//        World w11= userService.getWorld1("孙悟空", 420);
//        System.out.println();
//        System.out.println(w1 == w11);
//        System.out.println(w1 == w2);
//        System.out.println(w2 == w11);
//        System.out.println();
//        World w3 = userService.getWorld2("猪八戒", 410);
//        System.out.println(w2 == w3  || w1 == w3);
        long time1 = System.currentTimeMillis();
        for (int i =0; i < 10000 ; i++){
            userService.getWorld1("孙悟空", 400);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("缓存方法执行1000次需要 " + (time2 - time1));
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i ++){
            userService.getWorld2("孙悟空", 400);
        }
        long time4 = System.currentTimeMillis();
        System.out.println("非缓存方法执行1000次需要 " + (time4 - time3));
    }
}
