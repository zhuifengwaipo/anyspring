package top.wangjiawei.anyspring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author wangjiawei
 * description:
 * date 2018/6/6 22:53
 */
public class LogAspect {

    public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(this.getClass().getName() + " log: before");
        Object retVal = pjp.proceed();
        System.out.println(this.getClass().getName() + " log: after");
        return retVal;
    }

    public void log() {
        System.out.println("log...");
    }

}
