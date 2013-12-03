package pl.lrozek.spring.aop.aspect;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface Auditable {

    String value() default "";

}
