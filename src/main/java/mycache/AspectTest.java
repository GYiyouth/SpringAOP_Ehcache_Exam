package mycache;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by geyao on 2017/3/7.
 */
@Aspect
public class AspectTest {
//    @Before("within(mycache.*)")
    public void before(){
        System.out.println("before");
    }

//    @Around(value = "within(mycache.*)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around前");
        Object rt = joinPoint.proceed();
        System.out.println("around后");
        return rt;
    }
//    @AfterReturning(returning = "rvt", value = "within(mycache.*) && args(arg0, arg1)")
    public void afterReturning(Object rvt, String arg0, int arg1){
        System.out.println("afterReturning判断");
        System.out.println("第一个参数是" + arg0);
        System.out.println("第二个参数是" + arg1);
        System.out.println("返回值是" + rvt);
    }
}
