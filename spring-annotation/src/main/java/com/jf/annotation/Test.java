package com.jf.annotation;

/**
 * @author 潇潇暮雨
 * @create 2019-07-17   22:44
 */


@TestAnnotation(id = 3, msg = "helo message")
public class Test {
    public static void main(String[] args) {
        boolean annotationPresent = Test.class.isAnnotationPresent(TestAnnotation.class);
        if (annotationPresent) {
            TestAnnotation annotation = Test.class.getAnnotation(TestAnnotation.class);
            System.out.println("id = " + annotation.id());
            System.out.println("msg = " + annotation.msg());
        }
    }

}
