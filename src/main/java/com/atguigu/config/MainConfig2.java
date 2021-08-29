package com.atguigu.config;

import com.atguigu.bean.Color;
import com.atguigu.bean.ColorFactoryBean;
import com.atguigu.bean.Person;
import com.atguigu.bean.Red;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.MyImportBeanDefinitionRegistrar;
import com.atguigu.condition.MyImportSelector;
import com.atguigu.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/23 22:30
 */
//类中组件统一设置。满足当前条件，这个类中配置的所有bean注册才能生效
@Conditional({WindowsCondition.class})
@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
//导入组件，id默认是组件的全类名
public class MainConfig2 {

    //默认是单例
    /**
     * ConfigurableBeanFactory#SCOPE_PROTOTYPE  prototype
     * ConfigurableBeanFactory#SCOPE_SINGLETON singleton
     * #SCOPE_REQUEST   request
     * #SCOPE_SESSION   session
     *
     * prototype：多实例；ioc容器启动并不会去调用方法创建对象放在容器中
     *          每次获取时才调用方法创建对象
     * singleton：单实例（默认值）；ioc容器启动会调用方法创建对象放到ioc容器中
     *          以后每次获取就是直接从容器中（map.get()）拿
     * request：同一次请求创建一个实例
     * session：同一个session创建一个实例
     *
     * 懒加载：
     *  单实例bean：默认在容器启动时创建对象
     *  懒加载：容器启动不创建对象。第一次使用（获取）Bean创建对象，并初始化
     *
     * @Scope：调整作用域
     */
//    @Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加Person...");
        return new Person("zhangsan",25);
    }

    /**
     * @Conditional({Condition})：按照一定的条件进行判断，满足条件给容器中注册bean
     *
     * 如果系统是windows，给容器中注册("bill"）
     * 如果是linux系统，给容器中注册("linus")
     */
    @Bean("bill")
    public Person person01(){
        return new Person("Bill Gates",62);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02(){
        return new Person("Linus",48);
    }

    /**
     * 给容器中注册组件：
     * 1）包扫描+组件标注注解（@Controller/@Service/@Repository/@Component）[自己写的类]
     * 2) @Bean[导入第三方里的组件]
     * 3）@Import[快速给容器中导入一个组件]
     *      3.1 @Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名
     *      3.2 ImportSelector：返回需要导入的组件的全类名数组
     *      3.3 ImportBeanDefinitionRegistrar：手动注册bean到容器中
     * 4）使用Spring提供的FactoryBean（工厂Bean）
     *      4.1 默认获取到的是工厂Bean调用getObject创建的对象
     *      4.2 要获取工厂Bean本身，需要给id前面加一个&
     *          &colorFactoryBean
     */
    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
