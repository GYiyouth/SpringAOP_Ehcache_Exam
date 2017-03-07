package order;

import org.springframework.stereotype.Component;

/**
 * Created by geyao on 2017/3/6.
 */
@Component
public class TargetBean {
    public String fun(String s){
        System.out.println(this.getClass());
        return s;
    }

    public void foo(){
        System.out.println(555);
    }

    public int add(String one, String two){
        return 20;
    }
}
