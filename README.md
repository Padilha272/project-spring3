# Project

Este projeto é uma aplicação Spring Boot com JPA (Java Persistence API) e demonstra diversos conceitos e práticas relacionadas ao desenvolvimento de aplicações web em Java.

## Objetivo do Projeto

O projeto consiste um sistema de pedidos com as seguintes características:

- Domain Model: Define as entidades principais do sistema, como User, Order, Product e Category.
- Database Configuration: Utiliza o banco de dados H2 para desenvolvimento e teste, com instruções para configuração do PostgreSQL em produção.
- JPA Repositories: Utiliza JPA para realizar operações de CRUD (create, read, update, delete) no banco de dados.
- Many-to-Many Associations: Demonstração de relacionamento muitos-para-muitos entre entidades com um exemplo de relação entre Order e Product.
- One-to-One Association: Exemplo de relacionamento um-para-um entre Order e Payment.
- Exception Handling: Tratamento de exceções personalizadas com exemplos de como lidar com erros e retornar respostas apropriadas para o cliente.

## Tecnologias Utilizadas

### Back end

- Java
- Spring Boot
- JPA / Hibernate
- Maven


## Como Executar o Projeto

### Back end

Pré-requisitos: Java 17

```bash
# Clonar repositório
git clone https://github.com/Padilha272/project-spring3

# Entrar na pasta do projeto back end
cd backend

# Executar o projeto
./mvnw spring-boot:run

