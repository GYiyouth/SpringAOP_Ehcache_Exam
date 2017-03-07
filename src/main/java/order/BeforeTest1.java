package order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

/**
 * Created by geyao on 2017/3/6.
 */
@Aspect
@Order(value = 1)
public class BeforeTest1 {
    @Before("execution(* order..*.*(..))")
    public void fun1(){
        System.out.println("Before1111的1111111");
    }
    @Before("bean(hello)")
    public void fun2(){
        System.out.println("Before1111的2222222");
    }
}
