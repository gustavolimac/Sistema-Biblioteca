# 📚 Sistema de Biblioteca

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" alt="Java">
  <img src="https://img.shields.io/badge/POO-Programação%20Orientada%20a%20Objetos-blue?style=for-the-badge" alt="POO">
  <img src="https://img.shields.io/badge/Git-GitHub-black?style=for-the-badge&logo=git" alt="Git">
  <img src="https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge" alt="Status">
</p>

<p align="center">
  Projeto desenvolvido em Java para praticar e consolidar conceitos fundamentais de <strong>Programação Orientada a Objetos</strong>.
</p>

---

## 📌 Sobre o projeto

O **Sistema de Biblioteca** é um projeto educacional desenvolvido durante meus estudos de Java.

A aplicação simula o funcionamento básico de uma biblioteca, permitindo trabalhar com **usuários, bibliotecários, livros e empréstimos**.

O principal objetivo foi colocar em prática conceitos de **POO, herança, abstração, polimorfismo, interfaces, enums e associação entre classes**.

---

## 🎯 Objetivos

* Praticar Programação Orientada a Objetos.
* Trabalhar com relacionamento entre diferentes classes.
* Aplicar herança e classes abstratas.
* Utilizar polimorfismo na prática.
* Trabalhar com interfaces e enums.
* Praticar arrays de objetos.
* Desenvolver lógica de busca e controle de informações.

---

## 🛠️ Tecnologias utilizadas

* ☕ **Java**
* 💻 **IntelliJ IDEA**
* 🔧 **Git**
* 🐙 **GitHub**

---

## 🧠 Conceitos praticados

| Conceito          | Aplicação                                      |
| ----------------- | ---------------------------------------------- |
| Classes e objetos | Estrutura das entidades do sistema             |
| Encapsulamento    | Atributos `private` + getters/setters          |
| Construtores      | Inicialização dos objetos                      |
| Herança           | `Usuario` e `Bibliotecario` herdam de `Pessoa` |
| Classe abstrata   | `Pessoa`                                       |
| Métodos abstratos | `exibirDados()`                                |
| Polimorfismo      | Referências do tipo `Pessoa`                   |
| `instanceof`      | Identificação do tipo do objeto                |
| Interface         | `Emprestavel`                                  |
| Enum              | `TipoLivro` e `StatusEmprestimo`               |
| Associação        | `Emprestimo` relaciona usuário e livro         |
| Arrays de objetos | Armazenamento de livros e pessoas              |
| Foreach           | Percorrer arrays                               |
| Busca             | Pesquisa de livro por código                   |

---

## 🏗️ Estrutura do projeto

```text
src/
│
├── Main.java
│
├── Pessoa.java
├── Usuario.java
├── Bibliotecario.java
│
├── Livro.java
├── Biblioteca.java
├── Emprestimo.java
│
├── Emprestavel.java
│
├── TipoLivro.java
└── StatusEmprestimo.java
```

### Principais classes

**`Pessoa`**
Classe abstrata que representa uma pessoa dentro do sistema.

**`Usuario`**
Representa uma pessoa cadastrada como usuário da biblioteca.

**`Bibliotecario`**
Representa um funcionário responsável pela biblioteca.

**`Livro`**
Representa os livros e controla sua disponibilidade para empréstimo.

**`Emprestimo`**
Relaciona um usuário a um livro e controla o status do empréstimo.

**`Biblioteca`**
Responsável por armazenar e listar livros e pessoas, além de realizar buscas.

**`Emprestavel`**
Interface que define as operações de empréstimo e devolução.

**`TipoLivro`**
Enum utilizado para representar os tipos de livros.

**`StatusEmprestimo`**
Enum utilizado para representar o estado de um empréstimo.

---

## ⚙️ Funcionalidades

### 👤 Pessoas

* Cadastro de usuários.
* Cadastro de bibliotecários.
* Listagem de pessoas.
* Identificação do tipo de pessoa através de `instanceof`.

### 📚 Livros

* Cadastro de livros.
* Listagem de livros.
* Controle de disponibilidade.
* Empréstimo de livros.
* Devolução de livros.
* Busca por código.

### 🔄 Empréstimos

* Criação de empréstimos.
* Controle do status.
* Finalização do empréstimo.
* Atualização da disponibilidade do livro.

---

## 🚀 Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/gustavolimac/NOME-DO-REPOSITORIO.git
```

### 2. Abra o projeto

Abra o projeto utilizando uma IDE compatível com Java, como o **IntelliJ IDEA**.

### 3. Execute o programa

Localize a classe:

```text
Main.java
```

e execute o método:

```java
public static void main(String[] args)
```

---

## 💻 Exemplo de execução

```text
========== BIBLIOTECA ==========

===== PESSOAS =====

Nome: Gustavo
Idade: 20
Matrícula: 001
Tipo: Usuário

Esta pessoa é um usuário.


Nome: Caio
Idade: 20
Matrícula: 002
Tipo: Usuário

Esta pessoa é um usuário.


Nome: GB
Idade: 23
Código: 003
Tipo: Bibliotecário

Esta pessoa é um bibliotecário.
```

### Empréstimo

```text
===== EMPRÉSTIMOS =====

Livro emprestado com sucesso!

Livro já está emprestado.
```

### Devolução

```text
===== FINALIZANDO EMPRÉSTIMO =====

Livro devolvido com sucesso!
```

### Busca por código

```text
===== BUSCAR LIVRO POR CÓDIGO =====

Não existe um livro com esse código
```

---

## 📚 Exemplos de livros cadastrados

| Código | Livro              | Tipo     |
| ------ | ------------------ | -------- |
| 001    | Dom Casmurro       | Romance  |
| 002    | O Hobbit           | Fantasia |
| 003    | 1984               | Romance  |
| 004    | O Pequeno Príncipe | Romance  |
| 005    | A Metamorfose      | Romance  |

---

## 📈 Próximos passos

Como parte da evolução do projeto, futuramente podem ser adicionados:

* [ ] Entrada de dados pelo usuário com `Scanner`
* [ ] Tratamento de exceções
* [ ] `ArrayList`
* [ ] Sistema de cadastro completo
* [ ] Remoção e atualização de registros
* [ ] Persistência de dados
* [ ] Banco de dados
* [ ] Interface gráfica ou aplicação web

---

## 📌 Observação

Este projeto possui **finalidade educacional** e foi desenvolvido para consolidar os fundamentos de Java e Programação Orientada a Objetos.

A implementação atual mantém o foco nos conceitos estudados até o momento, sem utilização de **Collections, Streams, frameworks ou tratamento de exceções**.

---

## 👨‍💻 Autor

**Gustavo Carneiro Lima**

🎓 Estudante de Engenharia de Software
💻 Foco em **Desenvolvimento Backend Java**

---

<p align="center">
  Desenvolvido durante meus estudos de Java ☕
</p>
