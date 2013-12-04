package pl.lrozek.spring.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import pl.lrozek.spring.aop.aspect.Auditable;
import pl.lrozek.spring.aop.domain.User;

@Auditable
@Component
public class AnotherServiceImpl implements AnotherService {

    @Override
    public void doWork( User user, Long param ) {
        logger.info( "{} service method invoked", getClass().getName() );
    }

    private Logger logger = LoggerFactory.getLogger( getClass() );

}
