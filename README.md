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
