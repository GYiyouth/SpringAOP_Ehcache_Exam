package order;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

/**
 * Created by geyao on 2017/3/6.
 */
@Aspect
@Order(value = 3)
public class AfterTest3 {
    @After("execution(* order.*.*(..))")
    public void foo(){
        System.out.println("After3333333");
    }
}
