package lee;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by geyao on 2017/3/5.
 */
@Aspect
public class AfterThrowingTest {
    @AfterThrowing(throwing = "ex", value = "execution(* lee.*.*(..))")
    public void doSomething(Throwable ex){
        System.out.println("======AfterThrowing=====目标方法中抛出的异常 " + ex);
        System.out.println("======AfterThrowing=====异常打印完毕");
    }
}
