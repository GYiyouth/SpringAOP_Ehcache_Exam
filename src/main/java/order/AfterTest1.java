package order;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

/**
 * Created by geyao on 2017/3/6.
 */
@Aspect
@Order(value = 1)
public class AfterTest1 {
    @After("order.PointCutTest.myPointCut()")
    public void foo(){
        System.out.println("After1111111");
    }
}
