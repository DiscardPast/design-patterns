# 代理模式
概念：对类的功能实现增强
## 静态代理
概念：就是对当前单一类的功能进行增强

实现方式：
- 继承
    - 使用继承实现对原有类的增强
- 聚集
    - 使用接口实现对原有类的多重增强
## 动态代理
概念：对泛类，也就是未知类的功能进行增强
### [jdk动态代理实现](https://github.com/DiscardPast/design-patterns/tree/master/src/com/discardpast/proxy/trendproxy/jdk)
原理：通过类加载器(ClassLoader和Java反射实现对泛类方法的重写，以实现功能增强或改变)
### [cglib动态代理实现](https://github.com/DiscardPast/design-patterns/tree/master/src/com/discardpast/proxy/trendproxy/cglib)
原理：
### 常见应用
Java应用：jdk动态代理

框架应用：Spring Aop原理