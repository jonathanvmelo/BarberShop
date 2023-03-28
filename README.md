# BarberShop System

1. Definindo o projeto  ;  
2. Definindo os modelos (entidades)
3. Requisitos do projeto
4. Regras de negócio
5. Definição das tecnologias ultilizadas
6. Sprints do projetos


----------------------------------------------------

## 1 - Definindo o projeto

Título: BarberShop 

Descrição: Aplicação para o gerenciamento financeiro e de agendamento de serviços prestados em barbearias.

Objetivo: Resolver a questão de organização de agendamento de serviços atrelados ao cliente levando em consideração data, hora, tipo de serviço, valor do serviço.

------------------------------------------------

## 2 - Entidades:   

* Pessoa: (Classe mãe - abstract)
  - Id
  - Nome
  - Gênero 
  - Data de nascimento
  - CPF
  - Email
  - Telefone celular
  
* Cliente:( Classe filha - extends Pessoa)
  - Endereço
  - Cep
  
* Usuário:( Classe filha - extends Pessoa)
  - Senha
  - Nível de acesso(Cargo)
  
* Agenda:
  - Id
  - Cliente
  - Serviço
  - Valor
  - Data
  - Hora
  - Observação  
   
* Serviço:
  - Id
  - Descrição
  - Valor


-----------------------------------------------

## 3 - Requisitos (Funcionalidades):
 
* Permitir criar o cadastro do cliente;
* Permitir alterar o cadastro do cliente;
<br> 

* Permitir criar o agendamento;
* Permitir alterar o agendamento;
* Permitir deletar o agendamento;
<br> 

* Permitir criar um novo usuário;
* Permitir criar uma senha para o login do usuário;
* Permitir alterar o cargo do usuário;
* Permitir deletar o cadastro do usuário;
 
-----------------------------------------------

## 4 - Regras de negócio:

* Haverá o conceito de usuário;
* O sistema contará com uma tela de login;
* Caso a usuário e a senha digitados correspondam ao cadastrado anteriormente a tela de login será fechada e a tela de menu principal abrirá
* na tela menu pricipal será possível cadastrar e agendar um novo cliente, assim como alterar dados como tipo de serviço e valor.
* Todo agendamento deve pertencer a um cliente;
* Cada serviço prestado irá gerar uma receita que será acumulativa e disponível para consulta

---------------------------------------------------

## 5 - Tecnologias ultilizadas:

* Linguagem: Java;

* Interface gráfica: Java Swing;

* Banco de dados: Postgre; 

* IDE: Netbeans

---------------------------------------

## 6 - Sprint planning

1. Criação do banco de dados 
2. Criação das classes de modelo 
3. Criação da conexão com o banco de dados 
4. Criação das classes de controle( DAO -Acesso aos dados do banco)
5. Criação da interface gráfica  <br> 
  5.1. Criação da tela principal (Login)<br> 
  5.2. Criação da tela de Cadastro de Menu principal<br> 
  5.3. Criação da tela de Cadastro de Login<br> 
  5.4. Criação da tela de Cadastro de Cliente, Serviços, Usuários
6. Implementação dos eventos<br> 
  6.1. Validações 
7. Ajustes finais
8. Teste da aplicação
 
