package com.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author 潇潇暮雨
 * @create 2019-08-27   23:06
 */

@WebServlet(value = "/async", asyncSupported = true)
public class AsyncServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("主线程开始");
        AsyncContext asyncContext = req.startAsync();

        // 这里的业务逻辑会进行异步处理
        asyncContext.start(new Runnable() {
            @Override
            public void run() {
                System.out.println("副线程开始");
                System.out.println("睡眠开始");
                try {
                    TimeUnit.SECONDS.sleep(10);
                    asyncContext.complete();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("副线程结束");
            }
        });
        System.out.println("主线程结束");
    }
}
