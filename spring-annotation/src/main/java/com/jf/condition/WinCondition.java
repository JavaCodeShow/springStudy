package com.jf.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author 潇潇暮雨
 * @create 2019-07-14   22:35
 */
public class WinCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String systemName = environment.getProperty("os.name");
        if (systemName.contains("Windows")) {
            System.out.println(systemName);
            return true;
        }
        return false;
    }
}
