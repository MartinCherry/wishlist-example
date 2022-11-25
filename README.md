# Wishlist Example

To run application run command - mvn spring-boot:run

Application is running on http://localhost:8080

Wish:

Add wish -> /wishes {POST}

Get all wishes -> /wishes {GET}

Get one wish -> /wishes/{id} {GET}

Delete one wish -> /wishes/{id} {DELETE}

Users:

Send JSON file to /users {POST}

Application will return user names in String format.

---
Application is configured to run on H2 database.
You can connect to database console from http://localhost:8080/h2-console

<img width="557" alt="Screenshot 2022-11-25 at 10 19 08" src="https://user-images.githubusercontent.com/109744061/203936031-5cd1f4a0-1384-4f03-9572-0f9148708193.png">

---

To connect to PostgreSQL you need to edit settings in application.properties file

spring.datasource.url= “Change to your PostgreSQL database URL”

spring.datasource.driverClassName= “org.postgresql.Driver”

spring.datasource.username= “Your PostgreSQL Database Username”

spring.datasource.password= “Your PostgreSQL Database Password”

If connected to PostgreSQL then app will create database table on startup and drop table when closed.
