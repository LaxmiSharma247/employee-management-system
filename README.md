# Employee Management System

A full-stack CRUD web application for managing employee records. The backend is a RESTful API built with **Java 21 and Spring Boot 3** and backed by **MySQL**. The frontend is a **React** single-page app that consumes the API.

> **Note:** I built this project while following the video course [Spring Boot React JS Full-Stack Project | Employee Management System](https://www.youtube.com/watch?v=KuM6OtuaYRs) to practice modern Java (Java 21 / Spring Boot 3) and connect it with a React frontend. Credit for the original project design goes to the course instructor.

---

## Features

- View a list of all employees
- Add a new employee
- View and update an existing employee
- Delete an employee
- Client-side routing between the list, add, and update pages
- Responsive layout using Bootstrap
- CORS configured so the React app can call the Spring Boot API

---

## Tech Stack

| Layer | Technologies |
|---|---|
| Backend | Java 21, Spring Boot 3, Spring Web, Spring Data JPA (Hibernate), Lombok, Maven |
| Database | MySQL |
| Frontend | React (Vite), React Router, Axios, React Hooks (`useState`, `useEffect`), Bootstrap |

---

## Architecture

```
React (Vite)  ──HTTP/JSON──▶  Spring Boot REST API  ──JPA/Hibernate──▶  MySQL
 (port 5173)                      (port 8080)                            (port 3306)
```

The backend follows a layered structure: **Controller → Service → Repository → Entity**.

---

## REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/employees` | Get all employees |
| GET | `/api/employees/{id}` | Get an employee by ID |
| POST | `/api/employees` | Create a new employee |
| PUT | `/api/employees/{id}` | Update an employee |
| DELETE | `/api/employees/{id}` | Delete an employee |

**Sample request body (POST / PUT):**

```json
{
  "firstName": "Jane",
  "lastName": "Doe",
  "email": "jane.doe@example.com"
}
```

---

## Getting Started

### Prerequisites

- JDK 21
- Maven 3.9+
- MySQL 8+
- Node.js 18+ and npm

### 1. Set up the database

```sql
CREATE DATABASE employee_management;
```

### 2. Run the backend

```bash
cd backend
```

Update `src/main/resources/application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
```

Start the API:

```bash
mvn spring-boot:run
```

The API runs at `http://localhost:8080`.

### 3. Run the frontend

```bash
cd frontend
npm install
npm run dev
```

The app runs at `http://localhost:5173`.

---

## Project Structure

```
employee-management-system/
├── backend/        # Spring Boot REST API
│   └── src/main/java/...   (controller, service, repository, model)
└── frontend/       # React app (Vite)
    └── src/        (components, services, routes)
```

---

## What I Learned

- Building REST APIs with Spring Boot 3 and Spring Data JPA on Java 21
- Mapping entities to MySQL with Hibernate and exposing CRUD endpoints
- Structuring a layered backend (controller, service, repository)
- Connecting a React frontend to a Spring Boot API with Axios
- Managing component state and side effects with React Hooks
- Handling CORS between a separate frontend and backend

---

## Planned Improvements

- [ ] Input validation and a global exception handler with proper error responses
- [ ] Unit and integration tests (JUnit 5, Mockito)
- [ ] Pagination, sorting, and search
- [ ] Authentication and authorization with Spring Security and JWT
- [ ] API documentation with Swagger / OpenAPI
- [ ] Docker and Docker Compose setup
- [ ] CI pipeline with GitHub Actions

---

## Author

**Laxmi Sharma** | [LinkedIn](https://linkedin.com/in/laxmisd) | [Portfolio](https://laxmisharma247.github.io)
