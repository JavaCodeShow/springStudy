package com.jf.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 潇潇暮雨
 * @create 2019-07-22   22:06
 */
public class MyImportSelector implements ImportSelector {
    /**
     * @param importingClassMetadata 当前标注@Import注解的类的所有注解信息。
     * @return 就是导入到容器中的组件全类名
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        String[] arr = {
                "com.jf.bean.Red"
        };

        return arr;
    }
}
