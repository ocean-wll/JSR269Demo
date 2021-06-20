# JSR269Demo

实现类似于lombok，mapStruct之类的框架在编译期自动生成get、set方法

插入式注解处理API（JSR269）是用于处理注解（元数据，JSR175）的一套API。其API位于javax.annotation.processing和javax.lang.model包下。

插入式注解处理API可以让你在编译期访问注解元数据，处理和自定义你的编译输出，像反射一样访问类、字段、方法和注解等元素，创建新的源文件等等。可用于减少编写配置文件的劳动量，提高代码可读性等等。本文中我们将尝试着创建一个注解处理器用于标识一个服务提供者（Service
Provider），并同时讲解插入式注解处理API的相关内容。

# 强调编译期处理器需要对应的class文件才能处理

ps: 之前一直在一个项目中验证失败的原因是java在编译时，会先去资源目录下读取META-INF文件夹, 当发现META-INF/services/javax.annotation.processing.Processor 文件时,
会去找该文件(内容)里指定的处理器(注: 这个处理器此时应当是一个已经编译了的class文件),以 这个处理器来辅助执行此次的编译。 简单的说，就是: 要编译这个项目，可以! 但是你得先提供对应处理器的class文件才行。 但是呢,
这个处理器,正是我们此次需要编译的java文件之一;也就是说它还没有被编译呢,还只是java文件,而不是class文件。

参考：https://blog.csdn.net/justry_deng/article/details/106176181 和 https://blog.csdn.
net/sunquan291/article/details/102635274 实现