package pl.lrozek.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AuditAspect {

    public Object advice( ProceedingJoinPoint joinPoint, Auditable auditable ) throws Throwable {
        logger.info( "intercepting {} with annotation value '{}'", joinPoint.getSignature().toShortString(), auditable.value() );
        return joinPoint.proceed();
    }

    private Logger logger = LoggerFactory.getLogger( getClass() );

}
