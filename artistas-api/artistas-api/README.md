# Artistas API — Processo Seletivo (Patryk Campos Rodrigues — 698200)

Projeto desenvolvido como parte de processo seletivo na área de TI, com o objetivo de demonstrar domínio prático em desenvolvimento backend utilizando Java, Spring Boot, arquitetura em camadas e API REST.

O sistema implementa o gerenciamento de Artistas, Álbuns e Faixas musicais, incluindo relacionamento entre as entidades e persistência em banco de dados relacional.

O projeto foi desenvolvido, executado e testado integralmente via console, sem uso de interface gráfica, conforme boas práticas de backend.

Objetivo do Projeto

Implementar uma API REST capaz de:
- Cadastrar e listar Artistas
- Cadastrar e listar Álbuns vinculados a Artistas
- Cadastrar e listar Faixas vinculadas a Álbuns

Relacionamentos implementados:
- Um Artista pode possuir vários Álbuns
- Um Álbum pode possuir várias Faixas

Arquitetura do Projeto

O projeto segue o padrão de arquitetura em camadas, separando responsabilidades e facilitando manutenção, testes e evolução.

Estrutura de diretórios:

src/main/java/br/gov/mt/artistasapi
├── controller
├── model
├── repository
├── service
└── ArtistasApiApplication.java

Descrição das camadas:
- controller: camada responsável pelos endpoints REST
- service: regras de negócio e validações
- repository: persistência de dados com Spring Data JPA
- model: entidades JPA e mapeamento relacional

Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database (em memória)
- Maven

Execução do Projeto

Pré-requisitos:
- Java 17 ou superior instalado
- Maven instalado
- Porta 8080 disponível

Para executar o projeto, acesse a pasta raiz e execute:

mvn clean spring-boot:run

A aplicação será iniciada em:

http://localhost:8080

Banco de Dados

O projeto utiliza banco de dados H2 em memória.

Observação importante:
Sempre que a aplicação for reiniciada, os dados serão apagados.

Console do H2:
http://localhost:8080/h2-console

Configurações do H2:
- JDBC URL: jdbc:h2:mem:artistasdb
- User Name: sa
- Password: (vazio)

Endpoints Disponíveis

Artistas:
- POST /artistas
- GET /artistas

Álbuns:
- POST /albuns
- GET /albuns

Faixas:
- POST /faixas
- GET /faixas

Testes via Console (CMD / Terminal)

Todos os testes abaixo foram executados via prompt de comando (CMD no Windows), utilizando curl.

Criar Artista:

curl -X POST http://localhost:8080/artistas -H "Content-Type: application/json" -d "{\"nome\":\"Legião Urbana\"}"

Listar Artistas:

curl http://localhost:8080/artistas

Criar Álbum (assumindo artista com id=1):

curl -X POST http://localhost:8080/albuns -H "Content-Type: application/json" -d "{\"titulo\":\"Dois\",\"anoLancamento\":1986,\"artistaId\":1}"

Listar Álbuns:

curl http://localhost:8080/albuns

Criar Faixa (assumindo álbum com id=1):

curl -X POST http://localhost:8080/faixas -H "Content-Type: application/json" -d "{\"titulo\":\"Eduardo e Mônica\",\"numeroFaixa\":1,\"duracaoSegundos\":260,\"albumId\":1}"

Criar segunda Faixa:

curl -X POST http://localhost:8080/faixas -H "Content-Type: application/json" -d "{\"titulo\":\"Tempo Perdido\",\"numeroFaixa\":2,\"duracaoSegundos\":300,\"albumId\":1}"

Listar Faixas:

curl http://localhost:8080/faixas

Checklist de Funcionamento

- Aplicação executa com mvn clean spring-boot:run
- API responde corretamente na porta 8080
- Endpoints REST funcionam conforme esperado
- Banco H2 inicializa automaticamente
- Relacionamentos entre Artista, Álbum e Faixa funcionam corretamente
- Testes realizados via console com curl

Autor

Patryk Campos Rodrigues  
Inscrição: 698200
