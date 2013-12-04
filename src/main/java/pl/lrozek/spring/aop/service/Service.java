package pl.lrozek.spring.aop.service;

import pl.lrozek.spring.aop.domain.Account;
import pl.lrozek.spring.aop.domain.User;

public interface Service {

    void doWork( Account account, User user );

}
