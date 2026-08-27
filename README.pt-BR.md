<div align="center">
  <h1 align="center">
    Java Logistics Management
  </h1>
</div>

<p align="center">
  <a href="https://www.java.com" rel="noreferrer" target="_blank">
    <img alt="Imagem do logo do Java 25" src="https://img.shields.io/badge/Java%2025-ED8B00?style=flat&logo=openjdk&logoColor=white">
  </a>

  <a href="https://www.postgresql.org" rel="noreferrer" target="_blank">
    <img alt="imagem do logotipo do PostgreSQL" src="https://img.shields.io/badge/PostgreSQL-316192?style=flat-&logo=postgresql&logoColor=white" />
  </a>

  <a href="https://spring.io/projects/spring-boot" rel="noreferrer" target="_blank">
    <img alt="imagem do logotipo do Spring Boot" src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=springboot&logoColor=white">
  </a>

  <a href="https://spring.io/projects/spring-data" rel="noreferrer" target="_blank">
    <img alt="imagem do logotipo do Spring Data" src="https://img.shields.io/badge/Spring%20Data-6DB33F?style=flat&logo=spring&logoColor=white">
  </a>    
</p>

<div align="center">
  <h4 align="center">ler em outro idioma</h4>
  <a href="README.md" hreflang="en">
    🇺🇸 inglês
  </a>
</div>

## 💡 Sobre

Serviço de gerenciamento logístico desenvolvido em Java para cadastrar e listar unidades de remessa. A aplicação disponibiliza uma API HTTP e persiste os dados das remessas no PostgreSQL.

## Funcionalidades

- **Criação de remessas:** Cadastra uma unidade de remessa com código de rastreamento, SKU, status e depósito.
- **Listagem de remessas:** Recupera todas as unidades de remessa cadastradas.
- **Persistência:** Mapeia o modelo de domínio para um banco PostgreSQL por meio do Spring Data JPA.
- **Banco para testes:** Utiliza um banco H2 em memória e isolado durante os testes.

## 🚀 Primeiros passos

### Pré-requisitos

- Java 25
- Docker e Docker Compose
- Git

### ⚙️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/gbdsantos/java-logistics-management.git
cd java-logistics-management
```

2. Inicie o ambiente PostgreSQL:

```bash
docker compose up -d
```

3. Execute a aplicação:

```bash
./gradlew bootRun
```

No Windows, use `gradlew.bat bootRun`.

A aplicação será executada em `http://localhost:8081`.

Para testar a API, use qualquer cliente REST, como **curl**, **Insomnia** ou **Postman**.

## 🛠️ Tecnologias

- **Linguagem:** Java 25
- **Framework:** Spring Boot 4.1
- **Persistência:** Spring Data JPA com PostgreSQL
- **Ferramentas:** Gradle, Docker Compose, Lombok
- **Testes:** JUnit 5, Spring Boot Test, H2

## 🏛️ Arquitetura

O projeto segue uma arquitetura em camadas:

- **Domínio:** Entidades de remessa, identificadores, status e contratos de repositório.
- **Infraestrutura HTTP:** Controladores REST e objetos de requisição.
- **Persistência:** Entidades JPA e adaptadores de repositório.
- **Configuração:** Configuração do Spring Boot e serviços do Docker Compose.

---

Feito com ❤️ por **Guilherme Bezerra** 👋 [Fale comigo!](https://www.linkedin.com/in/gbdsantos)
