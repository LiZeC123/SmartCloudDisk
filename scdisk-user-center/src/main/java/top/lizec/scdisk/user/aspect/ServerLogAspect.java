package top.lizec.scdisk.user.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class ServerLogAspect {
    private final Logger logger = LoggerFactory.getLogger(getClass());


    private final ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(* top.lizec.scdisk.user.service..*.*(..))")
    public void serverLog() {
    }

    @Before("serverLog()")
    public void doBefore(JoinPoint joinPoint) {
        startTime.set(System.currentTimeMillis());
        String methodName = joinPoint.getSignature().getDeclaringTypeName();
        logger.info(String.format("Do Method %s with Args %s", methodName, Arrays.toString(joinPoint.getArgs())));
    }

    @AfterReturning(returning = "ret", pointcut = "serverLog()")
    public void doAfterReturning(Object ret) {
        // 处理完请求，返回内容
        logger.info(String.format("Return Result %s With %d ms", ret, System.currentTimeMillis() - startTime.get()));
    }
}
