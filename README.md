# Portaria API - Backend em Spring Boot

API REST desenvolvida como parte de um desafio técnico para controle de entrada e saída de veículos em uma empresa.

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Lombok

---

## Como Rodar o Projeto Localmente

1. Clone o repositório:

git clone https://github.com/igorhdias/portaria-api.git
cd portaria-api

2. Rode o projeto com Spring Boot:

./mvnw spring-boot:run

3. Acesse o H2 Console:

- URL: http://localhost:8081/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- Usuário: sa
- Senha: (vazio)

---

## Endpoints da API

### Registrar Saída
POST /viagens/saida
{
  "placaVeiculo": "BRA-2025",
  "idMotorista": 1,
  "destino": "Centro de Distribuição",
  "passageiros": "João, Maria"
}

### Registrar Retorno
POST /viagens/retorno
{
  "placaVeiculo": "BRA-2025"
}

### Listar Veículos por Status
GET /viagens/veiculos?status=NO_PATIO  
GET /viagens/veiculos?status=EM_VIAGEM

### Histórico de Viagens
GET /viagens/registros

---

## Cadastro de Veículo e Funcionário

### Criar Veículo
POST /veiculos
{
  "placa": "BRA-2025",
  "modelo": "Caminhão"
}

### Criar Funcionário
POST /funcionarios
{
  "nome": "João da Silva",
  "cnh": "12345678900"
}

---

## Autor

Igor Henrique Dias  
LinkedIn: https://linkedin.com/in/igorhdias
