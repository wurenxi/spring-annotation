package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description:自定义逻辑返回需要导入的组件
 * @author: gxl
 * @createDate: 2021/8/24 17:35
 */
public class MyImportSelector implements ImportSelector {

    //返回值，就是要导入到容器中的组件全类名
    //AnnotationMetadata：当前标注@Import注解的类的所有注解信息
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //方法不能返回null值，否则报空指针异常
        return new String[]{"com.atguigu.bean.Blue","com.atguigu.bean.Yellow"};
    }

}
