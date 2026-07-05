# Medical Image Analysis Backend

Spring Boot 3 REST API for the Medical Image Analysis Platform.

## Technology Stack

- Java 21
- Spring Boot 3.2.0
- Spring Security with JWT
- Spring Data JPA
- MySQL 8.0
- Redis
- Maven

## Prerequisites

- Java 21
- Maven 3.9+
- MySQL 8.0
- Redis 7.0

## Installation

1. Clone the repository
```bash
git clone <repository-url>
cd ai-medical-image-analysis-platform/backend
```

2. Configure database
```bash
# Update application.yml with your database credentials
```

3. Build the project
```bash
mvn clean install
```

4. Run the application
```bash
mvn spring-boot:run
```

## API Documentation

Access Swagger UI at: http://localhost:8080/api/v1/swagger-ui.html

## Project Structure

```
src/main/java/com/medical/ai/
├── config/           # Configuration classes
├── controller/       # REST controllers
├── service/          # Business logic
├── repository/       # Data access layer
├── entity/           # JPA entities
├── dto/              # Data Transfer Objects
├── mapper/           # MapStruct mappers
├── exception/        # Custom exceptions
└── util/             # Utility classes
```

## Running Tests

```bash
mvn test
```

## Docker Build

```bash
docker build -t medical-ai/backend .
```
