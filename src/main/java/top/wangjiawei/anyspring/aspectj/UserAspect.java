package top.wangjiawei.anyspring.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wangjiawei
 * description:
 * date 2018/6/10 19:25
 */
@Component
@Aspect
public class UserAspect {

    @Pointcut("execution(* top.wangjiawei.anyspring.aspectj.UserService.say(..))")
    private void log() { }

    @Before("log() && args(dd)")
    public void logSum(String dd) {
        System.out.println("log2..." + dd);
    }

    @AfterReturning(
            pointcut = "execution(* top.wangjiawei.anyspring.aspectj.UserService.sayReturn(..))",
            returning = "o")
    public void logReturn(Object o) {
        System.out.println("log " + o);
    }

    @Around(value = "execution(* top.wangjiawei.anyspring.aspectj.UserService.sayAround(..) ) && args(n, a)")
    public Object logAround(ProceedingJoinPoint pjp, String n, int a) throws Throwable {
        System.out.println("log before" + n + a);
        Object o = pjp.proceed();
        System.out.println(o);
        System.out.println("log after" + n + a);
        return o;
    }

}
