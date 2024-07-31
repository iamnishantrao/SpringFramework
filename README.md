# Spring Framework Projects

This is a Spring multi-module project where each module is an independent Spring project example. Details about each 
module are given below.

# Modules

## Web App

This is a sample book management web application project using the Spring Framework. It demonstrates the core 
functionalities of a typical web application, including handling web requests, interacting with a database, and 
rendering views.

It contains JPA entities and repositories for these objects: `Author`, `Book`, and `Publisher`. Sample data is added to 
all repositories using the `BootstrapData.java` file.

Features: 

- **Spring MVC**: Handling web requests and responses
- **Spring Data**: Interaction with the database using JPA and Hibernate
- **Thymeleaf**: Rendering html templates with data
- **H2 Database**: In-memory database for development and testing

Controllers:

- **/authors**: provides a list of all authors
- **/books**: provides a list of all books

## Dependency Injection

This module demonstrates the implementation of Dependency Injection (DI) using the Spring Framework. DI is a design
pattern used to implement IoC (Inversion of Control), allowing for better modularity, testability, and maintainability
of code.

The module shows examples of how we can use Spring Application Context to get beans, different techniques for DI,
Qualifiers, and Spring Profiles.

Dependency Injection in Spring can be implemented in three different ways:

- **Property/Field Based DI**: inject the dependency directly to a field or property
- **Getter Based DI**: inject the dependency using a getter method
- **Constructor Based DI**: inject the dependency using the constructor

#### @AutoWired Annotation

To use Spring to inject dependencies where needed, we use the `@AutoWired` annotation. The module shows examples of
all three techniques in different controllers. Three JUnit test cases depict how Spring would perform
the dependency injection for all three techniques.

#### @Qualifier Annotation

The `@Qualifier` annotation in Spring is used to resolve the ambiguity that arises when multiple beans of the same type
are present in the Spring context. By using `@Qualifier`, you can specify which bean should be injected when more than
one candidate is available. This is particularly useful in scenarios where you have multiple implementations of an
interface and need to select a specific one.

#### Spring Profiles

`Spring Profiles` allow segregating parts of your application configuration and making it only available in
certain environments. This is particularly useful for managing environment-specific configurations such as development,
testing, and production settings. By using Spring Profiles, you can define beans and configuration properties that are
active only when a specific profile is selected, allowing for cleaner and more manageable code.

## Spring Configuration

This modules demonstrates different ways using for configuring Spring applications using Annotations, Java Configuration, 
and XML configuration. In we can annotate our classes for making them into Spring Beans. Spring allows us to specify 
where to search for these classes, by default it will scan all classes present at the directory level of the main class.

Spring beans can have different scopes that determine their lifecycle and the way they are shared within the 
application. By default, a Spring bean is a singleton, but other scopes can be used to meet different requirements. 
To define the scope of a bean, you use the `@Scope` annotation in Java-based configuration or the `scope` attribute in 
XML configuration.

#### @ComponentScan Annotation

The `@ComponentScan` annotation in Spring is used to specify the base packages to scan for Spring components ensuring 
that all necessary beans are detected and registered in the Spring application context. These components can include 
`@Component`, `@Service`, `@Repository`, `@Controller`, and any custom stereotype annotations.

#### Java Based Configuration

Java-based configuration in Spring provides a type-safe, flexible, and powerful way to configure Spring beans. Instead 
of using XML files, you can use plain Java classes to define beans and their dependencies. Java-based configuration in 
Spring leverages the `@Configuration` and `@Bean` annotations to define beans and their dependencies. 

- `@Bean` annotation is used to on a method to instantiate and configure a bean. The method name corresponds to the bean 
name directly.
- Dependencies for a bean are specified using method parameters (which should already be declared as a @Bean), and Spring
will automatically resolve the dependencies and inject them into the bean.

#### XML Based Configuration

XML-based configuration was the original method for configuring Spring applications and remains a powerful and flexible 
option. This approach allows you to define beans, dependencies, and various other configuration details using XML files.

- `@ImportResource` annotation is used to import XML files containing configuration in the file containing 
`@Configuration` annotation.
- `<bean> element`: To define a bean in XML, you use the `<bean>` element with attributes to specify the class and 
optionally the bean name.
- `<constructor-arg> or <property> elements`: are used to inject dependencies in a bean.

