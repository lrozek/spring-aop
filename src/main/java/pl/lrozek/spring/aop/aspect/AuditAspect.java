package pl.lrozek.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAspect {

    @Around("@within(auditable)")
    public Object advice( ProceedingJoinPoint joinPoint, Auditable auditable ) throws Throwable {
        logger.info( "intercepting {} with annotation value '{}'", joinPoint.getSignature().toShortString(), auditable.value() );
        return joinPoint.proceed();
    }

    private Logger logger = LoggerFactory.getLogger( getClass() );

}
