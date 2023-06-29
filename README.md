# Projeto Java com Spring Boot, Spring Data JPA e Validação de Dados

Este é um projeto básico em Java utilizando as seguintes tecnologias:

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Validation
- Banco de Dados PostgreSQL

O objetivo deste projeto é fornecer uma estrutura inicial que utiliza o Spring Boot para criar uma aplicação Java com persistência de dados usando o Spring Data JPA, além de realizar validação de dados com o Spring Validation. O banco de dados utilizado é o PostgreSQL.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- Java 17: https://www.oracle.com/java/technologies/downloads/
- Maven: https://maven.apache.org/download.cgi
- PostgreSQL: https://www.postgresql.org/download/

## Configuração do Banco de Dados

1. Crie um banco de dados no PostgreSQL para a aplicação.
2. Abra o arquivo `application.properties` em `src/main/resources` e configure as seguintes propriedades:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

Certifique-se de substituir `nome_do_banco`, `seu_usuario` e `sua_senha` pelas informações corretas do seu ambiente.

## Executando a Aplicação

1. Abra um terminal na pasta raiz do projeto.
2. Execute o seguinte comando para compilar o projeto:

```bash
mvn clean install
```

3. Após a conclusão da compilação, execute o seguinte comando para iniciar a aplicação:

```bash
mvn spring-boot:run
```

A aplicação será iniciada e estará disponível na URL `http://localhost:8080`.

## Endpoints Disponíveis

A aplicação possui os seguintes endpoints:

- `GET /contatos`: Retorna a lista de contatos cadastrados.
- `GET /contatos/{id}`: Retorna um contato específico com base no ID.
- `POST /contatos`: Cria um novo contato com base nos dados fornecidos.
- `PUT /contatos/{id}`: Atualiza os dados de um contato existente com base no ID.
- `DELETE /contatos/{id}`: Remove um contato específico com base no ID.

Certifique-se de fornecer os dados corretos nos payloads das requisições POST e PUT, seguindo as regras de validação definidas.

## Contribuindo

Sinta-se à vontade para contribuir com melhorias neste projeto. Se você encontrar algum problema ou tiver alguma sugestão, abra uma issue neste repositório.

