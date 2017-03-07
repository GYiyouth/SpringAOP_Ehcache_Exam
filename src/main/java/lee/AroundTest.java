package lee;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by geyao on 2017/3/6.
 */
@Aspect
public class AroundTest {
    @Around("execution(* lee.*.*(..))")
    public Object test(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("=======Around开始=======");
        Object[] args = joinPoint.getArgs();
        System.out.println("=======Around=======ProceedingJoinPoint是 " + joinPoint.toString());
        System.out.println("=======Around=======目标方法的传入参数是 " + args);
        Object rvt = joinPoint.proceed(args);
        System.out.println("=======Around结束=======");
        return rvt;
    }
}
