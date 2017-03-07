package order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by geyao on 2017/3/6.
 */
@Aspect
public class PointCutTest {
    @Pointcut("execution( * order.*.*(..))")
    public void myPointCut(){}
}
