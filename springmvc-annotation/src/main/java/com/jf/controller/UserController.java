package com.jf.controller;

import com.jf.exception.GlobalException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 潇潇暮雨
 * @create 2019-08-26   22:30
 */
@Controller
public class UserController {

    @RequestMapping("/hello")
    @ResponseBody
    @ExceptionHandler(value = {GlobalException.class})
    public String hello(HttpServletResponse response) throws GlobalException, IOException {
        response.getWriter().write("开始");
        try {
            int i = 1 / 0;
        } catch (ArithmeticException a) {
            throw new GlobalException(response);
        }
        return "hello";
    }

    @GetMapping("/async")
    @ResponseBody
    public Callable<String> asyncHello() {
        System.out.println(Thread.currentThread().getName() + " -------------主线程开始");
        // 这里会进入异步处理，等待处理完成就会返回结果
        Callable callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getName() + " -------------副线程开始");
                TimeUnit.SECONDS.sleep(5);
                System.out.println(Thread.currentThread().getName() + " -------------副线程结束");
                return "我等的花儿都谢了";
            }
        };
        // 主线程继续执行
        System.out.println(Thread.currentThread().getName() + " -------------主线程继续");
        return callable;
    }

    @GetMapping("/quotes")
    @ResponseBody
    public DeferredResult<String> quotes() {
        DeferredResult<String> deferredResult = new DeferredResult<String>();
        // Save the deferredResult somewhere..
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                deferredResult.setResult("123");
            }
        });
        return deferredResult;
    }

// From some other thread...
//         deferredResult.setResult(data);
}
