package lee;

import org.springframework.stereotype.Component;

/**
 * Created by geyao on 2017/3/5.
 */
@Component
public class World {
    private  int num = 1;

    public World(String name, int age) {
        super();
    }

    public World() {
    }

    public void foo(){
        System.out.println(this.getClass());
        try {
            System.out.println("即将return");
            return;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            throw new NullPointerException("World的foo方法抛出异常啦");
        }
    }
    public int getNum(){
        try {
            System.out.println(num + "1");
            return num ++;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(num);
            return ++num;
        }

    }
    public void setNum(int num){
        this.num = num;
    }
    public int addUser(String name, String pass){
        System.out.println(this.getClass());
        System.out.println(name + pass);
        return 20;
    }
}
