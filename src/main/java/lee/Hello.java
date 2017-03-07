package lee;

import org.springframework.stereotype.Component;

/**
 * Created by geyao on 2017/3/5.
 */
@Component
public class Hello implements HelloInterface {
    public void foo(){
        System.out.println(this.getClass());
    }
    public int addUser(String name, String pass){
        System.out.println(this.getClass());
        System.out.println(name + pass);
        return 20;
    }
}
