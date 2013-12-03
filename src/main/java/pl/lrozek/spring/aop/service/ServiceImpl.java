package pl.lrozek.spring.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import pl.lrozek.spring.aop.aspect.Auditable;

@Auditable("someValue")
@Component
public class ServiceImpl implements Service {

    @Override
    public void doWork() {
        logger.info( "service method invoked" );
    }

    private Logger logger = LoggerFactory.getLogger( getClass() );

}
