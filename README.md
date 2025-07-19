# 📚 LMS Java Project

A Spring Boot-based Learning Management System (LMS) built in Java, providing a modular and maintainable backend structure for managing books, authors, categories, and publishers.

---

## 🚀 Features

- 👤 Manage Authors, Books, Categories, and Publishers
- 📚 RESTful API with clear separation of concerns
- 🧩 Spring Data JPA for repository access
- ⚙️ Service-oriented architecture
- 🗂️ MVC design pattern

---

## 🛠️ Tech Stack

- **Language**: Java  
- **Framework**: Spring Boot  
- **Database**: (Add your DB here — MySQL, H2, etc.)  
- **Build Tool**: Maven / Gradle (Mention the one you're using)  
- **IDE**: IntelliJ IDEA / Eclipse  

---

## 📂 Project Structure

<pre>
src/
├── main/
│   ├── java/
│   │   └── com.example.lms/
│   │       ├── controller/
│   │       │   ├── AuthorController.java
│   │       │   ├── BookController.java
│   │       │   ├── CategoryController.java
│   │       │   └── PublisherController.java
│   │       ├── entity/
│   │       │   ├── Authors.java
│   │       │   ├── Book.java
│   │       │   ├── Category.java
│   │       │   └── Publisher.java
│   │       ├── repo/
│   │       │   ├── AuthorRepo.java
│   │       │   ├── BookRepo.java
│   │       │   ├── CategoryRepo.java
│   │       │   └── PublisherRepo.java
│   │       ├── service/
│   │       │   ├── AuthorService.java
│   │       │   ├── BookService.java
│   │       │   ├── CategoryService.java
│   │       │   └── PublisherService.java
│   │       └── LmsApplication.java
│   ├── resources/
│   │   ├── static/
│   │   ├── templates/
│   │   └── application.properties
├── test/
└── target/
</pre>

---

## ▶️ Running the Application

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/LMS-Java-Project.git

2. **Use IntelliJ IDEA, Eclipse, or any preferred Java IDE to open the project.**

3. **Configure the Database**  
Update src/main/resources/application.properties with your local DB credentials:
<pre>
spring.application.name=lms
spring.h2.console.enabled=true

spring.datasource.url=jdbc:h2:mem:lms
spring.jpa.hibernate.ddl-auto=update

spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
</pre>

4. **Run the Application**  
Run the 'LmsApplication.java' file as a Spring Boot application.
