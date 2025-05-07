# Spring Boot Starter

A minimal Spring Boot starter project to help you quickly bootstrap RESTful APIs with Spring Boot.

## Features

- Spring Boot 3.x
- Simple REST controller example
- Ready-to-run with minimal configuration
- MIT License

## Getting Started

### Prerequisites

- Java 21 or higher
- Gradle 7+ (or use the included Gradle Wrapper)

### Running the Application

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/spring-boot-starter.git
   cd spring-boot-starter
   ```

2. **Build and run with Gradle:**
   ```bash
   ./gradlew bootRun
   ```

3. **Access the API:**
   - [http://localhost:8080/api/hello](http://localhost:8080/api/hello)
   - [http://localhost:8080/api/greet/YourName](http://localhost:8080/api/greet/YourName)

## Example Endpoints

- `GET /api/hello`  
  Returns:  
  ```
  Hello, World!
  ```

- `GET /api/greet/{name}`  
  Example: `/api/greet/Alice`  
  Returns:  
  ```
  Hello, Alice!
  ```



