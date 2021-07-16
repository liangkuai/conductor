package org.lock.conductor.autoconfigure;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author liukai
 * @date 2021/7/16
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({JobAutoConfiguration.class})
public @interface EnableJob {
}
