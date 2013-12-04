package pl.lrozek.spring.aop.service;

import static org.mockito.Mockito.mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuditServiceProvider {

    @Bean
    public AuditService mockAuditService() {
        return mock( AuditService.class );
    }

}
