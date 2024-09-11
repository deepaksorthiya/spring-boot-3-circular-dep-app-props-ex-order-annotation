# Getting Started

## Requirements:

```
Spring Boot : 3.3.3
Java : 17
Maven 3.9 +
```

## Features Testing
1. Spring Boot Circular dependency issue and fix
2. Spring properties order execution testing
3. Spring @Order annotation testing
## spring properties order

1. Command Line and Environment
2. Root application.properties
3. config/application.properties
4. classpath application.properties
5. classpath application.yml

## output
```
I am from root app.properties classpath - spring-boot-3-circular-dependencies-problem-and-fixes
I am BeanC
Application started with command-line arguments: []
NonOptionArgs: []
OptionNames: []
[com.example.orderannotation.Excellent@5f462e3b, com.example.orderannotation.Good@3d7fa3ae, com.example.orderannotation.Average@4d847d32]
```

```bash
mvn spring-boot:run -D"spring-boot.run.arguments=--my.secret=Test"
mvn spring-boot:run -D"spring-boot.run.jvmArguments=-Dmy.secret=overridden"
mvn spring-boot:run -"Dspring-boot.run.profiles=foo,bar"
```
### Reference Documentation
For further reference, please consider the following sections:

* [Circular Dependency](https://www.javaguides.net/2019/01/handle-circular-dependencies-in-spring.html)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.3/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.3/maven-plugin/build-image.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

