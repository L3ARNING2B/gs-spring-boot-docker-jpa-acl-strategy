# Spring Boot Docker (SpringDataJpa - Hibernate - MariadbSql)
Auto-initialized database

## Using MySQL Mariadb in Spring Boot Dockerized via Spring Data JPA and Hibernate

See here for more informations:
http://blog.netgloo.com/2014/10/27/using-mysql-in-spring-boot-via-spring-data-jpa-and-hibernate/

### Build and run

#### Configurations

Open the `application.yml` file and set your own configurations.

#### Prerequisites

- Java 8
- Maven > 3.0

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From InteliJ (Spring Tool Suite)

Open (Import) as *Existing New Project* with Maven *auto-import* and run it as usual *Spring Boot App*.


### Usage

- Run the application and go on http://localhost:8080/

- Database is auto-initialised with *DatabaseLoader.java*
