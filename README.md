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
