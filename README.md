## Projeto Marvel API

Este projeto demonstra o funcionamento de api rest referente a cadastro de usuário e comic, sendo que o acesso da api da Marvel que está disponível em: [Marvel Developer Portal](https://developer.marvel.com/), está sendo integrada com o Spring Cloud OpenFeign. 

#### Stack
- Java JDK 11;
- Spring Boot 2.5.2;
- Maven 3.8.1
- Banco de Dados H2

#### Rotas:

* `/v1/public/comics/{comicId}`
* `/api/cadastro/usuario`
* `/api/buscar/{idUsuario}`

#### Como executar

* 1º Clone este projeto em sua máquina e importe-o na sua IDE de preferência. 
* 2º Para realização dos testes utilize o Postman.
* 3º Segue abaixo algumas comicId que poderão ser utilizadas no teste:
* 1158
* 1003
* 1332
* 1308
* 6181
* 56802
* 17486
* 22582
* 93166
* 52646
* 4º Primeiro deve realizar o cadastro da comic, em seguida realizar o cadastro do usuário.
* [{
*	"nome": "NOME",
*	"cpf": "CPF",
*	"dataNascimento": "yyyy-MM-dd",
*	"email" :"EMAIL",
*	"livro": [{
*		"comicId": "comicId"
*	}]
* }]