package top.wangjiawei.anyspring.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.wangjiawei.anyspring.aop.TaskService;
import top.wangjiawei.anyspring.base.TestBase;
import top.wangjiawei.anyspring.singleton.GroupService;
import top.wangjiawei.anyspring.singleton.UserService;

/**
 * @author wangjiawei
 * description:
 * date 2018/5/31 23:23
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class XmlTest extends TestBase {

    public XmlTest() {
        super(null);
    }

    @Test
    public void testBean() {
        Controller controller = getBean(Controller.class);
        controller.say();
    }

    @Test
    public void testAop() {
        TaskService taskService = getBean(TaskService.class);
        taskService.say();
    }

    @Test
    public void testSingleton() {
        GroupService groupService = getBean(GroupService.class);
        groupService.getUserDAO().setUsername("xixi");
        groupService.say();
        UserService userService = getBean(UserService.class);
        userService.say();
    }
}
