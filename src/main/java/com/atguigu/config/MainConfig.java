package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @description: 配置类==配置文件
 * @author: gxl
 * @createDate: 2021/8/23 21:37
 */
@Configuration //告诉Spring这是一个配置类
@ComponentScans(
        value = {
                @ComponentScan(value = "com.atguigu",includeFilters = {
//                        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
//                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}),
                        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
                },useDefaultFilters = false)
        }
)
// @ComponentScan value：指定要扫描的包
// excludeFilters = Filter[]：指定扫描时按照什么规则排除哪些组件
// includeFilters = Filter[]：指定扫描时只需要包含哪些组件
// FilterType.ANNOTATION：按照注解
// FilterType.ASSIGNABLE_TYPE：按照给定的类型
// FilterType.ASPECTJ：使用ASPECTJ表达式
// FilterType.REGEX：使用正则表达式
// FilterType.CUSTOM：自定义规则
public class MainConfig {

    //给容器中注册一个Bean；类型为返回值类型，id默认是用方法名作为id
    @Bean("person")
    public Person person01(){
        return new Person("lisi",20);
    }
}
