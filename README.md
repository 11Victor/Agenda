<h1 align="center">
	<img src="https://cdn-icons.flaticon.com/png/512/2147/premium/2147758.png?token=exp=1637269122~hmac=eca330546af96a08caa6d27df9338cfd"  alt="Logo"  width="240"><br><br>
    Agenda de Compromissos
</h1>

<div align="center">
<a href="https://agendaelaw.herokuapp.com/" target="_blank">
        <img width="250" src="https://img.shields.io/website-API Heroku-down-blue-red/http/monip.org.svg">
</a>
</div><br>

<div>
    <p align="center">
    <a href="https://www.linkedin.com/in/victor-valencio-854012209/" target="_blank">
        <img src="https://img.shields.io/static/v1?label=Author&message=Victor Valencio&color=00ba6d&style=for-the-badge&logo=LinkedIn" alt="Author: Victor">
    </a>
    <a href="#">
		<img  src="https://img.shields.io/static/v1?label=Language&message=Java&color=red&style=for-the-badge&logo=Java"  alt="Language: Java">
	</a>
    </p>
</div>

## Table of Contents

<p align="center">
 <a href="#about">About</a> •
 <a href="#features">Features</a> •
 <a href="#technologies">Technologies</a> • 
 <a href="#installation">Installation</a> • 
 <a href="#getting-started">Get Started</a>
 
</p>

## 📌About

<div>
    <p align="center">
    Agenda online para que os nossos Juízes tenham acesso aos seus compromissos de forma rápida e simples. Na aplicação deverá ser possível cadastrar um compromisso, alterar um compromisso, remover um compromisso e também que seja listado todos os compromissos de um Juíz em uma determinada data.
    </p>
</div>

## 🚀Features

- Criar, Editar e Apagar compromissos na Agenda.
- Consultar todos compromissos.
- Consultar compromissos pelo ID.
- Consultar compromissos pelo Nome.
- Consultar compromissos entre duas datas.
- Consultar compromissos em uma data específica.
- Consultar todos compromissos futuros.
- Consultar todos compromissos passados.

## 🌐Technologies

- Java 8
- JPA
- Maven
- Spring Boot
- Swagger
- Heroku
- MySQL
- Postman
## 📕Installation

### Acesse a Api no Link abaixo:
<a href="https://agendaelaw.herokuapp.com/" target="_blank">
        <img width="250" src="https://img.shields.io/website-API Heroku-down-blue-red/http/monip.org.svg">
</a>

### Ou siga a seguinte instalação:

### 1. Clone this repository
```
git clone https://github.com/Yuri-stack/BlogPessoalGen.git
```
---
### 2. Descompacte o arquivo ZIP
---

### 3.Acesse a pasta descompactada pelo prompt de comando
```
cd <caminho da pasta>
```
---

### 4. Initializing the BackEnd
```
mvnw spring-boot:run
```

## 🎮Getting Started

Agora, abra o browser(Google, etc) e entre no seguinte link: http://localhost:8080

<br>

## ✔Novo Compromisso -> http://localhost:8080/agenda
### 1. Click em agenda-controller
---

### 2. Click em POST
---

### 3. Click em Try it out
---

### 4. Cole no campo o texto JSON
```
{
    "descricao" : "Heroku",
    "nome" : "Heroku",
    "participantes" : "Heroku",
    "local" : "Heroku",
    "data" : "1999-09-20",
    "hora" : "13:07:59"
}
```
### 5. Click em Execute
---
<br>

## ✔Editar Compromisso -> http://localhost:8080/agenda
### 1. Click em agenda-controller
---

### 2. Click em PUT
---

### 3. Click em Try it out
---

### 4. Cole no campo o texto JSON
```
{
    "id": 1,
    "descricao" : "Heroku",
    "nome" : "Heroku",
    "participantes" : "Heroku",
    "local" : "Heroku",
    "data" : "1999-09-20",
    "hora" : "13:07:59"
}
```
### 5. Click em Execute
---
<br>

## ✔Deletar Compromisso -> http://localhost:8080/agenda/1
### 1. Click em agenda-controller
---

### 2. Click em DELETE
---

### 3. Click em Try it out
---

### 4. Cole no campo o ID do compromisso
```
1
```
### 5. Click em Execute
---
<br>

## ✔Consultar todos Compromissos -> http://localhost:8080/agenda
### 1. Click em agenda-controller
---

### 2. Click em GET /agenda -> getAll
---

### 3. Click em Try it out
---

### 4. Click em Execute
---
<br>

## ✔Consultar Compromisso por ID -> http://localhost:8080/agenda/1
### 1. Click em agenda-controller
---

### 2. Click em GET /agenda/{id} -> getById
---

### 3. Click em Try it out
---

### 4. Cole no campo o ID do compromisso
```
1
```
### 5. Click em Execute
---
<br>

## ✔Consultar Compromisso entre duas datas ou em um dia -> http://localhost:8080/agenda/data?startDate=1999-09-20&endDate=1999-09-20
### 1. Click em agenda-controller
---

### 2. Click em GET /agenda/data -> getEntreDatas
---

### 3. Click em Try it out
---

### 4. Cole no campo "startDate" a primeira data e em "endDate" a segunda data, caso for consultar o compromisso de um único dia colocar a mesma data nos dois campos
```
1999-09-20
```
### 5. Click em Execute
---
<br>

## ✔Consultar Compromissos Futuros-> http://localhost:8080/agenda/futuro/1999-09-20
### 1. Click em agenda-controller
---

### 2. Click em GET /agenda/futuro/{data} -> getByDataFutura
---

### 3. Click em Try it out
---

### 4. Cole no campo a data
```
1999-09-18
```
### 5. Click em Execute
---
<br>

## ✔Consultar Compromissos Passados -> http://localhost:8080/agenda/passado/1999-09-25
### 1. Click em agenda-controller
---

### 2. Click em GET /agenda/passado/{data} -> getByDataPassado
---

### 3. Click em Try it out
---

### 4. Cole no campo a data
```
1999-09-25
```
### 5. Click em Execute
---
<br>

## ✔Consultar Compromissos pelo Nome -> http://localhost:8080/agenda/nome/heroku
### 1. Click em agenda-controller
---

### 2. Click em GET /agenda/nome/{nome} -> getByNome
---

### 3. Click em Try it out
---

### 4. Cole no campo o nome do compromisso
```
Heroku
```
### 5. Click em Execute
---


