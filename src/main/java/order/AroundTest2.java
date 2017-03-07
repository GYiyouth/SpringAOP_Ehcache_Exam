package order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

/**
 * Created by geyao on 2017/3/6.
 */
@Aspect
@Order(value = 2)
public class AroundTest2 {
    @Around("execution(* order.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] rvt = joinPoint.getArgs();
        System.out.println("Around22222222");
        Object res = joinPoint.proceed(rvt);
        System.out.println("Around22222222");
        return res;
    }
}
