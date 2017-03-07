/**
 * Created by geyao on 2017/3/5.
 */
public aspect AuthAspect {
    /**
     *
     */
    before(): execution(* lee.*.*(..)){
        System.out.println("模拟进行权限检查");
    }
}
