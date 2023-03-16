
# IMDB Top 250

ImdbTop250 é uma aplicação que consome a API do IMDb e retorna uma lista com os 250 filmes mais bem avaliados pela comunidade do IMDb.




## Stack utilizada

* Java 8
* Maven
* Gson
* java.net




## Requisitos


* Java 8 ou superior
* Maven



## Como executar a aplicação

1. Clone o repositório para o seu computador:
```bash
  git clone https://github.com/MoisesssDev/Imdb-Top250
```
2. Navegue até o diretório do projeto:
```bash
cd imdb-top-250
```
3. Execute o aplicativo usando o Maven:
```bash
mvn exec:java
```
4. Aguarde a execução da aplicação. Quando ela terminar, você verá no console a lista dos 250 filmes mais bem avaliados pelo IMDb.



## Como a aplicação funciona

A aplicação consome a API do IMDb para obter a lista dos 250 filmes mais bem avaliados pela comunidade do IMDb. A resposta da API é um objeto JSON que contém informações sobre cada filme, como título, diretor, elenco e classificação.

Para consumir a API, a aplicação utiliza a biblioteca java.net para fazer uma requisição GET para a URL da API. Em seguida, utiliza a biblioteca Gson para desserializar o objeto JSON e transformá-lo em uma lista de objetos Java.

Por fim, a aplicação imprime no console as informações de cada filme da lista, como título, ano de lançamento, diretor, elenco e classificação



## Contribuindo

Contribuições são sempre bem-vindas!

Se você quiser contribuir para o desenvolvimento desta aplicação, siga os passos abaixo:

1. Faça um fork deste repositório para a sua conta no GitHub.

2. Clone o repositório para a sua máquina.

3. Faça as alterações que desejar.

4. Execute os testes para garantir que a aplicação ainda esteja funcionando corretamente.

5. Faça um commit das suas alterações com uma mensagem clara e concisa.

6. Envie um pull request para o repositório original.


## Licença

Este projeto está licenciado sob a licença MIT - consulte o arquivo [LICENSE](https://choosealicense.com/licenses/mit/) para obter detalhes.

