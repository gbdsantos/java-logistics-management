<div align="center">
  <h1 align="center">
    Java Logistics Management
  </h1>
</div>

<p align="center">
  <a href="https://www.java.com" rel="noreferrer" target="_blank">
    <img alt="Java 25 logo image" src="https://img.shields.io/badge/Java%2025-ED8B00?style=flat&logo=openjdk&logoColor=white">
  </a>

  <a href="https://www.postgresql.org" rel="noreferrer" target="_blank">
	  <img alt="PostgreSQL badge image" src="https://img.shields.io/badge/PostgreSQL-316192?style=flat-&logo=postgresql&logoColor=white"  />
  </a>

  <a href="https://spring.io/projects/spring-boot" rel="noreferrer" target="_blank">
    <img alt="Spring Boot logo" src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=springboot&logoColor=white">
  </a>

  <a href="https://spring.io/projects/spring-data" rel="noreferrer" target="_blank">
    <img alt="Spring Data logo" src="https://img.shields.io/badge/Spring%20Data-6DB33F?style=flat&logo=spring&logoColor=white">
  </a>
</p>

<div align="center">
  <h4 align="center">read in the language</h4>
  <a href="README.pt-BR.md" hreflang="pt-br">
    🇧🇷 portuguese
  </a>
</div>

## 💡 About

Java-based logistics management service for registering and listing shipment units. The application exposes an HTTP API and persists shipment data in PostgreSQL.

## Features

- **Shipment creation:** Register a shipment unit with its tracking code, SKU, status, and warehouse.
- **Shipment listing:** Retrieve all registered shipment units.
- **Persistence:** Map the domain model to a PostgreSQL database through Spring Data JPA.
- **Test database:** Use an isolated in-memory H2 database during tests.

## 🚀 Getting Started

### Prerequisites

- Java 25
- Docker and Docker Compose
- Git

### ⚙️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/gbdsantos/java-logistics-management.git
cd java-logistics-management
```

2. Start the PostgreSQL environment:

```bash
docker compose up -d
```

3. Run the application:

```bash
./gradlew bootRun
```

On Windows, use `gradlew.bat bootRun`.

The application runs on `http://localhost:8081`.

To test the API, use any REST client such as **curl**, **Insomnia**, or **Postman**.

## 🛠️ Tech Stack

- **Language:** Java 25
- **Framework:** Spring Boot 4.1
- **Persistence:** Spring Data JPA with PostgreSQL
- **Tooling:** Gradle, Docker Compose, Lombok
- **Testing:** JUnit 5, Spring Boot Test, H2

## 🏛️ Architecture

The project follows a layered architecture:

- **Domain:** Shipment entities, identifiers, statuses, and repository contracts.
- **Infrastructure HTTP:** REST controllers and request objects.
- **Infrastructure persistence:** JPA entities and repository adapters.
- **Configuration:** Spring Boot configuration and Docker Compose services.

---
Made with ❤️ by Guilherme Bezerra 👋 [Get in touch!](https://www.linkedin.com/in/gbdsantos)