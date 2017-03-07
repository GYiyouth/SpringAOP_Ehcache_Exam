package order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Created by geyao on 2017/3/6.
 */
@Aspect
public class BeforeTest2 implements Ordered{
    @Override
    public int getOrder() {
        return 1;
    }

    @Before("execution(* order.*.*(..))")
    public void fun1(){
        System.out.println("Before2222的1111111");
    }
    @Before("execution(* order.*.*(..))")
    public void fun2(){
        System.out.println("Before2222的2222222");
    }
}
