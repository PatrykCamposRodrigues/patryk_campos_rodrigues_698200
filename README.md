# patryk_campos_rodrigues_698200
# Projeto Back-End – Processo Seletivo SEPLAG/MT

## Identificação
- **Repositório:** patryk_campos_rodrigues_698200
- **Edital:** nº 001/2026 – SEPLAG/MT
- **Etapa:** Projeto Profissional – Back-End

## Candidato
- **Nome:** Patryk Campos Rodrigues
- **Inscrição:** 698200
- **Formação:** Sistemas de Informação
- **Pós-graduação:** Governança de TI

---

## Objetivo
Este projeto tem como objetivo disponibilizar uma API REST para o gerenciamento
de artistas e seus álbuns musicais, atendendo aos requisitos técnicos definidos
no Anexo II-A do edital.

A solução foi desenvolvida com foco em organização, segurança, clareza de código
e facilidade de manutenção, simulando um ambiente real de uso institucional.

---

## Arquitetura
A aplicação utiliza arquitetura em camadas, separando claramente as responsabilidades:

- **Controller:** recebe as requisições HTTP
- **Service:** contém as regras de negócio
- **Repository:** realiza o acesso ao banco de dados
- **Security:** controla autenticação e autorização
- **Infra:** configurações gerais e integrações

Essa abordagem facilita a leitura, testes e evolução do sistema.

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- API REST
- Banco de Dados Relacional
- Docker e Docker Compose
- MinIO (armazenamento de arquivos)
- HTML, CSS e JavaScript (visualização conceitual)

---

## Segurança
- Autenticação via JWT
- Tokens com tempo de expiração
- Renovação de token
- CORS configurado
- Controle de requisições por usuário

---

## Funcionalidades
- Cadastro e consulta de artistas
- Cadastro e consulta de álbuns
- Relacionamento entre artistas e álbuns
- Paginação e ordenação
- Upload de capas de álbuns
- Armazenamento de imagens no MinIO
- URLs temporárias para acesso às imagens
- Notificação em tempo real via WebSocket
- Health Check da aplicação

---

## Visualização do Domínio

Para facilitar o entendimento do modelo de dados e da proposta do sistema,
foi incluído um arquivo `index.html` na raiz do repositório.

Esse arquivo apresenta uma visualização conceitual do domínio
(Artista → Álbum → Faixa), inspirada em plataformas de catálogo musical,
servindo exclusivamente como apoio visual à avaliação.

A implementação completa das regras de negócio, persistência de dados
e endpoints REST encontra-se no back-end desenvolvido em Java com Spring Boot.

---

## Execução do Projeto

### Pré-requisitos
- Docker
- Docker Compose

### Subir a aplicação
```bash
docker-compose up -d
