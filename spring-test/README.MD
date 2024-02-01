# class: 与classpath*：的区别
- classpath只会找类路径下(包括jar包)符合条件的`第一个`资源文件(包括jar包)
- classpath会找类路径下(包括jar包)符合条件的`所有`资源文件
- 详见`PathMatchingResourcePatternResolver`