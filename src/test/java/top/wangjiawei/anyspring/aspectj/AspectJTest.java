package top.wangjiawei.anyspring.aspectj;

import org.junit.Test;
import top.wangjiawei.anyspring.base.TestBase;

/**
 * @author wangjiawei
 * description:
 * date 2018/6/10 19:00
 */
public class AspectJTest extends TestBase {

    public AspectJTest() {
        super("classpath:spring-annotation.xml");
    }

    @Test
    public void testAspectJ() {
        UserService userService = getBean(UserService.class);
        String reVal = userService.sayAround("小猪", 12);
        System.out.println(reVal);
//        userService.say("ss");
    }

}
