# Spring JDBC CRUD Application

A console-based CRUD (Create, Read, Update, Delete) application built using the Spring Framework and JdbcTemplate with MySQL database integration.

---

## 🚀 Project Overview

This project demonstrates:

- Spring Core (Annotation-based configuration)
- Spring JDBC
- JdbcTemplate usage
- DAO Pattern implementation
- MySQL Database connectivity
- Maven project structure

The application allows users to perform CRUD operations on a `Student` table via a console menu interface.

---

## 🛠 Technologies Used

- Java 8+
- Spring Framework
- Spring JDBC
- MySQL
- Maven
- JUnit (default template)

---

## 📂 Project Structure

```
com.omsolanki.springjdbc
│
├── App.java
│
├── config
│     ├── JavaConfig.java
│     └── config.xml (optional XML configuration)
│
├── dao
│     ├── StudentDao.java
│     ├── StudentDaoImp.java
│     └── RowMapperImp.java
│
└── entities
      └── Student.java
```

---

## ⚙ Database Configuration

Update database details inside `JavaConfig.java`:

```java
ds.setUrl("jdbc:mysql://localhost:3307/springjdbc");
ds.setUsername("root");
ds.setPassword("your_password");
```

### Sample Table Structure

```sql
CREATE TABLE student (
    stid INT PRIMARY KEY,
    stnm VARCHAR(50),
    city VARCHAR(50)
);
```

---

## ▶ How to Run

1. Clone the repository:
   ```
   git clone https://github.com/your-username/springjdbc.git
   ```

2. Import as Maven project in IntelliJ / Eclipse.

3. Configure MySQL database.

4. Run:
   ```
   App.java
   ```

---

## 📌 Features

- Insert Student
- Update Student
- Delete Student
- Select Single Student
- Select All Students
- Input validation
- Exception handling
- Annotation-based configuration
- Autowiring support

---

## 🏗 Architecture

The project follows a layered architecture:

```
App (Main)
   ↓
DAO Layer
   ↓
JdbcTemplate
   ↓
MySQL Database
```

---

## 📖 Learning Purpose

This project was built to practice:

- Spring JDBC integration
- Java-based configuration (JavaConfig)
- DAO design pattern
- Maven project structure
- Git version control workflow

---

## 👨‍💻 Author

**Om Solanki**  
Java & Spring Developer  

---

## 📌 Version

v1.0 – Console-based Spring JDBC CRUD application