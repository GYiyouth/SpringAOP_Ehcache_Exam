package mycache;

import lee.World;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by geyao on 2017/3/7.
 */
//@Service("userService")
@Component

public class UserServiceImpl implements UserService{
    @Cacheable(value = "users")
    public World getWorld1(String name, int age){
//        System.out.println(this.getClass() + "第一个方法");
        return new World(name, age);
    }
    public World getWorld2(String name, int age){
//        System.out.println(this.getClass() + "第二个方法");
        return new World(name, age);
    }
}
