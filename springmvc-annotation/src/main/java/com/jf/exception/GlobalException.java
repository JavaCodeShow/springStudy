package com.jf.exception;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 潇潇暮雨
 * @create 2019-08-28   22:41
 */
@Component
public class GlobalException extends Exception {
    public GlobalException(HttpServletResponse response) throws IOException {
        response.getWriter().write("您的网络坏掉了");
    }
}
