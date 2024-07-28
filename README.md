# Spring Framework Projects

This is a Spring multi-module project where each module is an independent Spring project example. Details about each module are given below.

# Modules

## WebApp

This is a sample book management web application project using the Spring Framework. It demonstrates the core functionalities of a typical web application, including handling web requests, interacting with a database, and rendering views.

It contains JPA entities and repositories for these objects: `Author`, `Book`, and `Publisher`. Sample data is added to all repositories using the `BootstrapData.java` file.

Features: 

- **Spring MVC**: Handling web requests and responses
- **Spring Data**: Interaction with the database using JPA and Hibernate
- **Thymeleaf**: Rendering html templates with data
- **H2 Database**: In-memory database for development and testing

Controllers:

- **/authors**: provides a list of all authors
- **/books**: provides a list of all books
