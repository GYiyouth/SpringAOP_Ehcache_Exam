package lee;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by geyao on 2017/3/5.
 */
@Aspect
public class AfterReturningTest {
    @AfterReturning(returning = "rvt",
        pointcut = "execution(* lee.*.*(..))"  )
    public void log(Object rvt){
        System.out.println("======AfterReturning=====获取目标方法返回值" + rvt);
        if (rvt!= null)
            System.out.println("========AfterReturning=======返回值的类型是 " + rvt.getClass());
    }
}
/**
 *
 =======Around开始=======
 =======Around=======ProceedingJoinPoint是 execution(void lee.World.foo())
 =======Around=======目标方法的传入参数是 [Ljava.lang.Object;@71e9ddb4
 模拟执行权限检查
 class lee.World
 即将return
 ======AfterThrowing=====目标方法中抛出的异常 java.lang.NullPointerException: World的foo方法抛出异常啦
 ======AfterThrowing=====异常打印完毕
 After切面
 catch!!!

 =======Around开始=======
 =======Around=======ProceedingJoinPoint是 execution(int lee.World.getNum())
 =======Around=======目标方法的传入参数是 [Ljava.lang.Object;@1757cd72
 模拟执行权限检查
 检测int型返回值的方法
 这是一个以 m 结尾的方法
 11
 2
 =======Around结束=======
 After切面
 ======AfterReturning=====获取目标方法返回值3
 ========AfterReturning=======返回值的类型是 class java.lang.Integer
 */