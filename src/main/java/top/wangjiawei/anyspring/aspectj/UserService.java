package top.wangjiawei.anyspring.aspectj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author wangjiawei
 * description:
 * date 2018/6/10 18:55
 */
@Service
public class UserService {

    @Value("小明")
    private String username;

    public void say(String name) {
        System.out.println("my name is " + username);
    }

    public void cry() {
        System.out.println("cry");
    }

    public String sayReturn() {
        return username;
    }

    public String sayAround(String name, int age) {
        return "新同学的名字是" + name + ", 年龄" + age;
    }

}
