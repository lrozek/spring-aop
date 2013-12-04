package pl.lrozek.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.lrozek.spring.aop.service.AuditService;

@Component
public class AuditAspect {

    @Autowired
    public AuditAspect( AuditService auditService ) {
        this.auditService = auditService;
    }

    public Object advice( ProceedingJoinPoint joinPoint, Auditable auditable ) throws Throwable {
        logger.info( "intercepting {} with annotation value '{}'", joinPoint.getSignature().toShortString(), auditable.value() );
        auditService.audit();
        return joinPoint.proceed();
    }

    private AuditService auditService;

    private Logger logger = LoggerFactory.getLogger( getClass() );

}
