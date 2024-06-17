
#Project Prototype - English


A project prototype based on program logic with database integration, made by stundents of Start course (class 2024.2), group 1.

# Project Documentation: Login, Registration, and Password Recovery in Java

## Project Structure
This project is developed in Java using Maven for dependency management. The project structure is organized into five packages within the `src` directory as described below:

### Packages
1. **DAO**
   - `LoginController.java`: Manages user login and password recovery.
   - `UsuarioDAO.java`: Queries the database for user information required for login page verification.

2. **conexaosql**
   - `conexao.java`: Establishes the database connection.

3. **entity**
   - `Usuario.java`: Getters and setters for user information. Records user input which is later used by `UsuarioDAO` to perform necessary actions.

4. **main**
   - `CreateDB.java`: Connects to and creates the database using sessions from the `java.sql` package.

5. **test**
   - `Test`: Manages the test environment using Maven's `testng` dependency.

### Main File
- `App.java`: Located in the main `src` path, this file is used to execute the code. It imports the aforementioned packages and utilizes their classes.

## File Descriptions
### DAO
- `LoginController.java`
  - **Function**: Manages user login and password recovery.
  - **Location**: `src/DAO/LoginController.java`

- `UsuarioDAO.java`
  - **Function**: Queries database for user verification on login page.
  - **Location**: `src/DAO/UsuarioDAO.java`

### conexaosql
- `conexao.java`
  - **Function**: Establishes database connection.
  - **Location**: `src/conexaosql/conexao.java`

### entity
- `Usuario.java`
  - **Function**: Getters and setters for user information.
  - **Location**: `src/entity/Usuario.java`

### main
- `CreateDB.java`
  - **Function**: Connects to and creates the database.
  - **Location**: `src/main/CreateDB.java`

### test
- `Test`
  - **Function**: Test environment management with Maven's `testng`.
  - **Location**: `src/test/Test`

### App.java
- `App.java`
  - **Function**: Imports previous packages and uses their classes to execute code.
  - **Location**: `src/App.java`

## Conclusion
This documentation provides an overview of the Java project structure for login, registration, and password recovery, detailing the main packages and files along with their respective functions.


=======
# Project-Prototype
Primeiro protótipo do projeto, baseado em lógica de programção com integração em banco de dados, feito pelos alunos do Start 2024.2, grupo 1.

Estrutura do Projeto
O projeto foi desenvolvido em Java utilizando o Maven como ferramenta de 
gerenciamento de dependências. A estrutura do projeto é organizada em cinco pacotes 
dentro da pasta src (main path), conforme descrito abaixo:

Pacote

1. DAO
 - LoginController.java: Controla a parte de login e recuperação de senha do usuário.
 - UsuarioDAO.java: Consulta as informações no banco de dados, necessário para 
checar informações do usuário na página de login.
2. conexaosql
 - conexao.java: Faz a conexão com o banco de dados.
3. entity
 - Usuario.java: Getter and setter das informações do usuário. Registra informações 
inseridas pelo usuário, que são posteriormente importadas pelo UsuarioDAO para 
efetuar as ações necessárias.
4. main
 - CreateDB.java: Conecta e cria o banco de dados por meio das sessões do pacote java.sql.
5. test
 - Test: Gerenciamento do ambiente de teste utilizando a dependência testng do Maven.

Arquivo Principal
- App.java: Localizado no caminho principal src, este arquivo é utilizado para executar 
o código. Ele importa os pacotes mencionados anteriormente e utiliza suas classes.
Descrição dos Arquivos

DAO
- LoginController.java
 - Função: Controla a parte de login e recuperação de senha do usuário.
 - Localização: src/DAO/LoginController.java
- UsuarioDAO.java
 - Função: Consulta as informações no banco de dados, necessário para checar 
informações do usuário na página de login.
 - Localização: src/DAO/UsuarioDAO.java

Conexaosql
- conexao.java
 - Função: Faz a conexão com o banco de dados.
 - Localização: src/conexaosql/conexao.java

   
Entity
- Usuario.java
 - Função: Getter and setter das informações do usuário.
 - Localização: src/entity/Usuario.java

   
Main
- CreateDB.java
 - Função: Conecta e cria o banco de dados por meio das sessões do pacote java.sql.
 - Localização: src/main/CreateDB.java

Test
- Test
 - Função: Gerenciamento do ambiente de teste utilizando a dependência testng do 
Maven.
 - Localização: src/test/test
App.java
- App.java
 - Função: Importa os pacotes anteriores e utiliza suas classes para executar o 
código.
 - Localização: src/App.java

   
Conclusão
Esta documentação apresenta uma visão geral da estrutura do projeto de login, 
cadastro e recuperação de senha em Java, detalhando os pacotes e arquivos 
principais, bem como suas respectivas funções