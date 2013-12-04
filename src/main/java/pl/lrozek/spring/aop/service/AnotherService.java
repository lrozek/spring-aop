package pl.lrozek.spring.aop.service;

import pl.lrozek.spring.aop.domain.User;

public interface AnotherService {

    void doWork( User user, Long param );

}
