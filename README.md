[![Java Maven Build Test](https://github.com/deepaksorthiya/spring-boot-3-circular-dep-app-props-ex-order-annotation/actions/workflows/maven-build.yml/badge.svg?branch=main)](https://github.com/deepaksorthiya/spring-boot-3-circular-dep-app-props-ex-order-annotation/actions/workflows/maven-build.yml)

# Getting Started

## Requirements:

```
Git: 2.51.0
Spring Boot : 3.5.5
Java : 24
Maven 3.9 +
```

### Clone this repository:

```bash
git clone https://github.com/deepaksorthiya/spring-boot-3-circular-dep-app-props-ex-order-annotation.git
cd spring-boot-3-circular-dep-app-props-ex-order-annotation
```

### Build Project:

```bash
./mvnw clean package
```

### Command line test

```bash
export MY_SECRET=ENVSECRET
mvn spring-boot:run -D"spring-boot.run.arguments=--my.secret=Test"
mvn spring-boot:run -D"spring-boot.run.jvmArguments=-Dmy.secret=overridden"
mvn spring-boot:run -"Dspring-boot.run.profiles=foo,bar"
#multiple args
mvn spring-boot:run -D'spring-boot.run.arguments="--server.port=9090 --spring.main.banner-mode=off"'
mvn spring-boot:run -D'spring-boot.run.jvmArguments="-Dserver.port=9090 -Dspring.main.banner-mode=off"'
java -jar -D"my.secret=secret" .\target\spring-boot-3-circular-dep-app-props-ex-order-annotation-0.0.1-SNAPSHOT.jar
```

## Features Testing

1. Spring Boot Circular dependency issue and fix
2. Spring properties order execution testing
3. Spring @Order annotation testing

## spring properties order

1. Command Line Java System Properties
2. Environment Variables
3. Root application.properties
4. config/application.properties
5. classpath application.properties
6. classpath application.yml

## output

```
DEFAULT_SECRET
I am BeanC
Application started with command-line arguments: []
NonOptionArgs: []
OptionNames: []
[com.example.orderannotation.Excellent@5467eea4, com.example.orderannotation.Good@160396db, com.example.orderannotation.Average@76911385]
{KEY1=value1, KEY2=value3, KEY3=value5}
{KEY1=[value1, value2]}
DatabaseProperties[host=localhost, port=3306, username=root, password=root]
```

### Reference Documentation

For further reference, please consider the following sections:

* [YOUTUBE -JOSH Long](https://www.youtube.com/watch?v=PsNNGuLi0ns)
* [Circular Dependency](https://www.javaguides.net/2019/01/handle-circular-dependencies-in-spring.html)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/maven-plugin/build-image.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the
parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

