package com.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author 潇潇暮雨
 * @create 2019-08-24   11:09
 */
@Component
public class UserService {

    @EventListener(classes = {ApplicationEvent.class})
    public void listen(ApplicationEvent event) {
        System.out.println("UserService 中的listen监听到的事件 ----" + event);
    }
}
