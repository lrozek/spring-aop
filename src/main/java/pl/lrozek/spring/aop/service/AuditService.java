package pl.lrozek.spring.aop.service;

import pl.lrozek.spring.aop.domain.User;

public interface AuditService {

    void audit( User user );

}
