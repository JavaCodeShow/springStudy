package com.jf.config;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author 潇潇暮雨
 * @create 2019-07-14   15:41
 */
public class MyTypeFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取扫描的类的元数据信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        // 获取当前类的名字。
        String className = classMetadata.getClassName();
        System.out.println(className);
        if (className.contains("ser")) {
            return true;
        }
        return false;
    }
}
