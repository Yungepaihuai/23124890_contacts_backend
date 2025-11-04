# Address book management system-backend
  23124890_contacts_backend

## Project introduction
  Based on Spring Boot, the back-end of the address book system is 
  separated from the front-end and provides a complete RESTful API.

## Technology stack
  Java 8 
  Spring Boot 2.6.13 
  Spring Data JPA 
  H2 Database 
  Maven

## Functional performance
  Add contacts
  Edit contact
  Delete contact
  View contact list
  H2 database console

## Project structure
  23124890_contacts_backend/
  ├── .idea/
  ├── data/
  ├── src/
  │   ├── main/
  │   │   ├── java/
  │   │   │   └── com/
  │   │   │       └── _23124890/
  │   │   │          ├──  Application.java
  │   │   │          ├── entity/
  │   │   │          │   ├── Contact.java 
  │   │   │          │   └── User.java
  │   │   │          ├── repository/
  │   │   │          │   └── ContactRepository.java
  │   │   │          └── controller/
  │   │   │              ├── ContactController.java
  │   │   │              └── BasicController.java
  │   │   └── resources/
  │   │      ├── application.properties
  │   │      ├── data.sql
  │   └── test/
  │      └── java/
  │         └── com/
  │            └── _23124890/
  ├── img.png
  ├── HELP.md
  ├──.gitignore
  ├── README.md
  ├──codestyle.md
  ├──pom.xml

## Operating instructions

### environmental requirement
  JDK 8+
  Maven 3.6+

### Local operation
  https://github.com/你的用户名/23124890_contacts_backend.git`
  http://localhost:8080/

### API interface
| Method | path | describe |
| GET | `/api/contacts` | Get all contacts |
| GET | `/api/contacts/{id}` | Get contacts according to ID |
| POST | `/api/contacts` | Add contacts |
| PUT | `/api/contacts/{id}` | Modify contact |
| DELETE | `/api/contacts/{id}` | Delete contact |

### Database access
  H2 console：http://localhost:8080/h2-console
  JDBC URL: jdbc:h2:mem:testdb
  User name: sa
  Code: (空)

## Deployment instructions
  The project uses embedded Tomcat, 
  which can be directly packaged and run as JAR:
  bash
  mvn clean package
  java -jar target/contacts-backend-1.0.0.jar
