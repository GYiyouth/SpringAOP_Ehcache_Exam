package lee;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by geyao on 2017/3/6.
 */
@Aspect
public class AfterTest {
    @After("execution(* lee.*.*(..))")
    public void foo(){
        System.out.println("After切面");
    }
}

/**
 *
 模拟执行权限检查
 class lee.World
 即将return
 目标方法中抛出的异常 java.lang.NullPointerException: World的foo方法抛出异常啦
 异常打印完毕
 After切面
 catch!!!

 模拟执行权限检查

 检测int型返回值的方法

 这是一个以 m 结尾的方法
 11
 2
 After切面
 获取目标方法返回值3
 返回值的类型是 class java.lang.Integer

 */
