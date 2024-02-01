
# 核心说明
- AbstractAnnotationConfigDispatcherServletInitializer
  - DispatcherServlet
  - ContextLoaderListener
  

- ContextLoaderListener作用
  - 在Web应用程序启动时，ContextLoaderListener负责创建ApplicationContext对象，
  并将其存储在ServletContext中。这样，其他组件（如控制器、过滤器等）就可以通过ServletContext获取
  ApplicationContext，从而访问Spring的功能。
  - ContextLoaderListener还负责初始化和销毁ApplicationContext。它在Web应用程序启动时调用
  ApplicationContext的refresh()方法进行初始化，在Web应用程序关闭时调用ApplicationContext的close()
  方法进行销毁。
  - ContextLoaderListener还可以加载Spring的配置文件，并根据配置文件的位置(contextConfigLocation)来创建ApplicationContext。
  通过配置文件，可以定义Spring容器的配置信息，如Bean的定义、依赖关系、AOP等。

  - 总之，ContextLoaderListener起到了连接Web容器和Spring容器的桥梁作用，负责启动和管理Spring容器，使得Web应用程序可以使用Spring的功能。

