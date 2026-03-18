# Student Management System (Spring Boot + Supabase)

This project demonstrates the integration of a **Spring Boot** backend with **Supabase**, leveraging the power of a managed PostgreSQL database and built-in authentication services.

## ✨ Features
- **Student CRUD:** Full lifecycle management (Create, Read, Update, Delete) for student records.
- **BaaS Integration:** Uses Supabase for scalable database hosting and instant API capabilities.
- **Data Persistence:** Relational mapping of student profiles, grades, and enrollment status.
- **Secure Backend:** Spring Boot handles complex business logic and server-side validation.

## 🛠️ Tech Stack
- **Backend:** Java 17+, Spring Boot 3.x
- **BaaS Provider:** Supabase (PostgreSQL)
- **Connectivity:** JDBC / Spring Data JPA
- **Build Tool:** Maven

## ⚙️ Configuration
Update your `application.properties` with your Supabase connection string:
```properties
spring.datasource.url=jdbc:postgresql://db.[YOUR-PROJECT-ID].supabase.co:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=[YOUR-PASSWORD]
