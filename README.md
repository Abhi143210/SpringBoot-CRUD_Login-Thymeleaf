# Student Management System - Spring Boot with Thymeleaf



Welcome to the Student Management System project! This application is built using Spring Boot and Thymeleaf, designed to manage student information in an educational institution.

## Table of Contents

1. Introduction
2. Features
3. Technologies
4. Getting Started
5. Usage
6. Screenshots
7. Contributing
8. Contact

## Introduction

The Student Management System is a web-based application that allows administrators, teachers, and staff to manage student data efficiently. It offers features such as adding, updating, and deleting student records, tracking academic performance, and generating various reports related to student information.

## Features

- **Student Management**: Add, view, update, and delete student records.
- **Courses and Grades**: Record and manage student courses and grades.
- **Attendance Tracking**: Keep track of student attendance.
- **Academic Performance**: Analyze and visualize student academic performance.
- **Reports**: Generate and export reports for students and courses.
- **User Authentication**: Secure access with user login and role-based permissions.

## Technologies

The project is built using the following technologies:

- **Spring Boot**: Provides the foundation to build the application with ease.
- **Thymeleaf**: A modern server-side Java template engine for dynamic HTML rendering.
- **Spring Data JPA**: Simplifies database access with the ORM (Object-Relational Mapping) approach.
- **MySQL (or your preferred database)**: To store student information and other data.
- **Bootstrap (optional)**: For responsive and visually appealing user interface elements.
- **Maven (or Gradle)**: For project management and build automation.

## Getting Started

To get started with the Student Management System, follow these steps:

1. **Prerequisites**: Make sure you have Java 8 (or higher) and MySQL (or any preferred database) installed on your machine.
2. **Clone the repository**: Clone this repository to your local machine using `git clone https://github.com/yourusername/StudentManagementSystem.git`.
3. **Database setup**: Create a new MySQL database and execute the SQL script provided in `database/setup.sql`.
4. **Configuration**: Update the database configuration in `src/main/resources/application.properties` with your database credentials.
5. **Build and Run**: Use Maven (or Gradle) to build the project and run it using the Spring Boot application.

## Usage

Once the application is up and running, open your web browser and navigate to the URL where the application is deployed (usually `http://localhost:8080`).

You'll be presented with the login page. Use the provided credentials (or register as a new user) to log in. Depending on your role (admin, teacher, staff), you'll have access to different features of the application.

## Screenshots
### This is the Login Page where we should add username and password
![Screenshot 1](https://github.com/Abhi143210/SpringBoot-CRUD_Login-Thymeleaf/blob/main/pngs/login.png)
### After login we can see the list of students in that we update or delete student details
![Screenshot 2](https://github.com/Abhi143210/SpringBoot-CRUD_Login-Thymeleaf/blob/main/pngs/list.png)
### In the Update page we can update student details
![Screenshot 3](https://github.com/Abhi143210/SpringBoot-CRUD_Login-Thymeleaf/blob/main/pngs/update.png)

## Contributing

Contributions to this project are welcome! If you find a bug or want to add a new feature, please feel free to open an issue or submit a pull request.



## Contact

If you have any questions or suggestions, please feel free to contact me at hosangadiabhishek@email.com.

---

