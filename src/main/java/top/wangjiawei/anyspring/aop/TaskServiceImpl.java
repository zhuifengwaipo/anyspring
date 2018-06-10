package top.wangjiawei.anyspring.aop;

/**
 * @author wangjiawei
 * description:
 * date 2018/6/6 22:48
 */
public class TaskServiceImpl implements TaskService {

    @Override
    public void say() {
        System.out.println(this.getClass().getName() + " say: sss");
    }
}
