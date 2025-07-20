# 🛡️ Portaria API - Backend

Projeto desenvolvido para controle de entrada e saída de veículos de uma portaria, com integração a um app Flutter.

## 🧱 Tecnologias utilizadas

- Java 17
- Spring Boot
- H2 Database (em memória)
- Spring Data JPA
- Lombok
- Maven

---

## 🚀 Como executar

1. Clone o repositório
2. Abra o projeto no IntelliJ ou VS Code
3. Execute `PortariaApplication.java`
4. Acesse o H2 console em: `http://localhost:8081/h2-console`
  - JDBC URL: `jdbc:h2:mem:testdb`
  - User: `sa`

---

## 🔌 Endpoints disponíveis

### 📤 POST /viagens/saida
Registra a saída de um veículo.

### 📥 POST /viagens/retorno
Registra o retorno de um veículo.

### 📋 GET /viagens/veiculos?status=NO_PATIO|EM_VIAGEM
Lista os veículos por status.

### 📚 GET /viagens/registros
Lista o histórico completo de viagens.

### 👤 GET /viagens/funcionarios
Lista todos os motoristas cadastrados.

---

## 📲 Integração com Flutter

O backend é consumido por um app Flutter (entregue separadamente), utilizando os endpoints acima.

- Exibe veículos no pátio
- Permite registrar saídas e retornos
- Permite cadastrar veículos e funcionários
- Dropdown dinâmico de motoristas no app

---

## ✅ Status da entrega

- [x] Backend completo e funcional
- [x] Banco em memória (H2) com console ativo
- [x] Endpoints testados com Postman
- [x] Integração com frontend funcionando
- [x] README atualizado (20/07/2025)

---

## 👨‍💻 Desenvolvido por

Igor Henrique Dias  
[LinkedIn](https://www.linkedin.com/in/igorhdias)
