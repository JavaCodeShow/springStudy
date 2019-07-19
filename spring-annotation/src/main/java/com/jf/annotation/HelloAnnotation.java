package com.jf.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 潇潇暮雨
 * @create 2019-07-17   23:05
 */


class Gun {
    String name = null;

    Gun(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                '}';
    }
}

@Conf
class Fun {

    @Be
    Gun gun1() {
        return new Gun("Gun1");
    }

    @Be
    Gun gun2() {
        return new Gun("Gun2");
    }

    Gun gun3() {
        return new Gun("Gun3");
    }

}


public class HelloAnnotation {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Map<String, Object> map = new HashMap<String, Object>();

        boolean annotationPresent = Fun.class.isAnnotationPresent(Conf.class);
        System.out.println("annotationPresent = " + annotationPresent);
        if (annotationPresent) {
            Method[] methods = Fun.class.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Be.class)) {
                    method.setAccessible(true);
                    Object fun = method.invoke(new Fun(), null);
                    map.put(method.getName(), fun);
                }
            }
        }
        System.out.println(map);
    }
}
