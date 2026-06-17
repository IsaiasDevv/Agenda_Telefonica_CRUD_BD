# 📞 Agenda Telefônica 

<div align="center">

# 📱 Sistema de Agenda Telefônica

### Projeto Integrador II-A

Desenvolvido em Java + MySQL utilizando arquitetura em camadas e interface gráfica Java Swing.

![Java](https://img.shields.io/badge/Java-26-orange?style=for-the-badge&logo=openjdk)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql)
![Swing](https://img.shields.io/badge/Java-Swing-green?style=for-the-badge)
![Eclipse](https://img.shields.io/badge/Eclipse-2026-purple?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)

</div>

---

# 📖 Sobre o Projeto

Este projeto consiste em uma Agenda Telefônica Desktop desenvolvida em Java utilizando Java Swing para interface gráfica e MySQL para persistência dos dados.

O sistema permite realizar todas as operações CRUD:

- ✅ Cadastrar contatos
- ✅ Listar contatos
- ✅ Pesquisar contatos
- ✅ Atualizar contatos
- ✅ Excluir contatos

---

# 🎯 Objetivo

Aplicar na prática os conceitos de:

- Programação Orientada a Objetos
- JDBC
- Banco de Dados Relacional
- Interface Gráfica
- Arquitetura em Camadas
- Persistência de Dados

---

# 🚀 Tecnologias Utilizadas

| Tecnologia | Versão |
|------------|---------|
| Java | JDK 26 |
| Eclipse | 2026 |
| MySQL Server | 8.x |
| MySQL Workbench | 8.x |
| Java Swing | GUI |
| JDBC | Driver de conexão |

---

# 🏗 Arquitetura do Sistema

```text
┌───────────────┐
│    Usuário    │
└───────┬───────┘
        │
        ▼
┌───────────────┐
│ TelaAgenda    │
│    (View)     │
└───────┬───────┘
        │
        ▼
┌───────────────┐
│  ContatoDAO   │
│     (DAO)     │
└───────┬───────┘
        │
        ▼
┌───────────────┐
│   Conexao     │
│    JDBC       │
└───────┬───────┘
        │
        ▼
┌───────────────┐
│     MySQL     │
└───────────────┘
```

---

# 📂 Estrutura do Projeto

```text
AgendaTelefonica
│
├── src
│
├── connection
│   └── Conexao.java
│
├── dao
│   └── ContatoDAO.java
│
├── model
│   └── Contato.java
│
├── service
│   └── AgendaTelefonica.java
│
├── view
│   └── TelaAgenda.java
│
└── main
    ├── AgendaTeste.java
    ├── TesteConexao.java
    ├── TesteCadastro.java
    ├── TesteListagem.java
    ├── TesteBusca.java
    ├── TesteAtualizacao.java
    └── TesteRemocao.java
```

---

# 🗄 Banco de Dados

## Banco

```sql
agenda_telefonica
```

## Tabela

```sql
contatos
```

Estrutura:

```sql
CREATE TABLE contatos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL
);
```

---

# 🔄 Funcionalidades

## ➕ Cadastro

Permite inserir novos contatos no banco de dados.

## 📋 Listagem

Exibe todos os contatos cadastrados.

## 🔍 Pesquisa

Pesquisa em tempo real por nome.

## ✏️ Atualização

Atualiza os dados de um contato existente.

## ❌ Exclusão

Remove contatos do banco de dados.

---

# ⚙️ Configuração do Banco

Execute o arquivo:

```sql
agenda_telefonica.sql
```

O script cria automaticamente:

- Banco de Dados
- Tabela contatos
- Dados de exemplo

---

# 💻 Como Executar o Projeto

## 1️⃣ Instalar Dependências

Instale:

- Java JDK 26
- MySQL Server
- MySQL Workbench
- Eclipse IDE

---

## 2️⃣ Importar Banco de Dados

No MySQL Workbench:

```text
Server
↓
Data Import
↓
Import from Self-Contained File
↓
agenda_telefonica.sql
↓
Start Import
```

---

## 3️⃣ Configurar Conexão

Arquivo:

```java
Conexao.java
```

```java
private static final String URL =
"jdbc:mysql://localhost:3306/agenda_telefonica";

private static final String USUARIO =
"root";

private static final String SENHA =
"102030";
```

---

## 4️⃣ Importar Projeto

No Eclipse:

```text
File
↓
Import
↓
Existing Projects into Workspace
```

---

## 5️⃣ Executar

Classe principal:

```java
TelaAgenda.java
```

ou

```java
AgendaTeste.java
```

---

# 📊 Operações CRUD

| Operação | Status |
|-----------|---------|
| Create | ✅ |
| Read | ✅ |
| Update | ✅ |
| Delete | ✅ |

---

# 🧪 Testes Realizados

- ✅ Conexão com banco
- ✅ Cadastro
- ✅ Pesquisa
- ✅ Atualização
- ✅ Exclusão
- ✅ Validação de e-mail
- ✅ Validação de telefone

---

# 🔒 Requisitos para Funcionamento

Para o sistema funcionar é necessário:

- Java instalado
- MySQL Server em execução
- Banco importado
- Driver JDBC configurado

> ⚠️ O MySQL Workbench não precisa permanecer aberto. Apenas o serviço MySQL deve estar em execução.

---

# 📈 Melhorias Futuras

- 🔐 Sistema de Login
- 📄 Exportação PDF
- 📊 Exportação Excel
- ☁️ Backup Automático
- 🌐 Versão Web
- 📱 Aplicativo Mobile

---

# 👨‍💻 Autor

**Isaías Correia de Morais**

🎓 Análise e Desenvolvimento de Sistemas

🏫 PUC Goiás EAD

📚 Projeto Integrador II-A

---

<div align="center">

## ⭐ Obrigado por visitar este projeto ⭐

Se este projeto foi útil para você, deixe uma ⭐ no repositório.

</div>
