package pl.lrozek.spring.aop.aspect;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.lrozek.spring.aop.service.AuditService;
import pl.lrozek.spring.aop.service.Service;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/application-context.xml")
public class AuditAspectITest {

    @Test
    public void itShouldApplyAspectAroundInvokedMethod() throws Exception {
        // given 

        // when
        service.doWork();

        // then
        verify( auditService ).audit();

    }

    @Autowired
    private AuditService auditService;

    @Autowired
    private Service service;

}
