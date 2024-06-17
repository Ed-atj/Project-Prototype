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
