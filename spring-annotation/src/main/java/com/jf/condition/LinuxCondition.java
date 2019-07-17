package com.jf.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author 潇潇暮雨
 * @create 2019-07-15   22:55
 */
public class LinuxCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String systemName = environment.getProperty("os.name");
        if (systemName.contains("Linux")) {
            return true;
        }
        return false;
    }
}
