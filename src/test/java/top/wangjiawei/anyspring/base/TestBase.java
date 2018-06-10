package top.wangjiawei.anyspring.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @author wangjiawei
 * description:
 * date 2018/5/31 23:14
 */
public class TestBase {

    private ClassPathXmlApplicationContext context;
    private String springXmlPath;

    public TestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before() {
        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "classpath:spring-context.xml";
        }
        context = new ClassPathXmlApplicationContext(springXmlPath);
        context.start();
    }

    @After
    public void after() {
        context.close();
    }

    protected <T> T getBean(Class<T> clazz) {
        return context.getBean(clazz);
    }
}
