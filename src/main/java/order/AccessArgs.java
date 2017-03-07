package order;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by geyao on 2017/3/6.
 */
@Aspect
public class AccessArgs {
    @AfterReturning(returning = "obj", value = "execution(* order.*.*(..)) && args(arg0, arg1,..))")
    public void access(Object obj, String arg0, String arg1){
        System.out.println("目标方法第一个参数为 " + arg0);
        System.out.println("目标方法第二个参数为 " + arg1);
        System.out.println("目标方法返回值为" + obj);
    }
}
