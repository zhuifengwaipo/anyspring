package top.wangjiawei.anyspring.xml;

/**
 * @author wangjiawei
 * description:
 * date 2018/5/31 22:54
 */
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void say() {
        service.say();
    }

}
