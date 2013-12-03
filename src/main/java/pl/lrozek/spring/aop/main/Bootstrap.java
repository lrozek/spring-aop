package pl.lrozek.spring.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import pl.lrozek.spring.aop.service.Service;

public class Bootstrap {

    public static void main( String[] args ) {
        ApplicationContext applicationContext = new GenericXmlApplicationContext( "application-context.xml" );
        Service service = applicationContext.getBean( Service.class );
        service.doWork();
    }
}
