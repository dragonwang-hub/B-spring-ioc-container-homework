# B-spring-ioc-container-homework
Spring IoC Container Basics 课程课后作业。

主观题：
@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

答：
@Component 在类上使用，注解表明一个类会作为组件类，并告知Spring要为这个类创建bean，其通常是通过类路径扫描来自动侦测以及自动装配到Spring容器中。

@Bean 在方法上使用，注解告诉Spring这个方法将会返回一个对象，这个对象要注册为Spring应用上下文中的bean。通常方法中包含了最终产生bean实例的逻辑，并且实例名就是方法名。

区别：@Bean比@Component自定义性更强。当引用第三方库中的类时需要装配到Spring容器时，没有办法在其类上加@Component注解。只能通过@Bean来实现，因为并不能修改第三方库的源代码。

