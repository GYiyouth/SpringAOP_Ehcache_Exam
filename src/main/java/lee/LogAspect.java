package lee;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by geyao on 2017/3/5.
 */
@Aspect
public class LogAspect {
    @Before("execution(* lee.*.*(..))")
    public void authority(){
        System.out.println("模拟执行权限检查");
    }

    @Before("execution(int lee.*.*(..))")
    public void authority2(){
        System.out.println("检测int型返回值的方法");
    }
    @Before("execution(* lee.*.*(String , String))")
    public void authority3(){
        System.out.println("检测到输入参数为 String, String 类型的方法");
    }

    @Before("execution(* lee.*.*m(..))")
    public void authority4(){
        System.out.println("这是一个以 m 结尾的方法");
    }
}
