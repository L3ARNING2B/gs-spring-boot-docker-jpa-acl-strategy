![Maven Status](https://travis-ci.org/shiftyp/redurx.svg?branch=master)

# SPRING BOOT DOCKER + ACL STRATEGY 

### Description
Spring Application using MySQL Mariadb with Spring Boot Dockerized via Spring Data JPA and Hibernate. *(Auto-initialized database*)

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

- Database is auto-initialised with `DatabaseLoader.java`


### Source

#### Spring related reference guide:
- Spring data JPA:
http://docs.spring.io/spring-data/jpa/docs/current/reference/pdf/spring-data-jpa-reference.pdf

- Database initialization:
http://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html

- Data access:
http://docs.spring.io/spring-boot/docs/current/reference/html/howto-data-access.html


#### Original Tutorial:
- spring data jpa and hibernate tutorial:
http://blog.netgloo.com/2014/10/27/using-mysql-in-spring-boot-via-spring-data-jpa-and-hibernate/

- security acl tutorial:
http://krams915.blogspot.com/2011/01/spring-security-3-full-acl-tutorial.html

- spring security acl strategy:
https://github.com/lordlothar99/strategy-spring-security-acl