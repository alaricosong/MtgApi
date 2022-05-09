# MtgApi

Magic the Gathering API

API criada para gravar coleção de cartas em um banco de dados utilizando java com spring boot com deploy realizado no heroku para tornar a api acessível para todos.

Para ver a coleção já existente, basta acessar o seguinte endereço e a coleção será exibida em formato JSON por ordem de inserção no banco de dados:<br>
https://mtgapizappts.herokuapp.com/mtgapi/cards/

Caso queira ver a lista em ordem alfabetica basta acessar o endereço:<br>
https://mtgapizappts.herokuapp.com/mtgapi/cards/ordemAlfabetica

Há também a possibilidade de ver a lista em ordem de preço crescente ou decrescente pelos links:<br>
https://mtgapizappts.herokuapp.com/mtgapi/cards/ordemPrecoCrescente<br>
https://mtgapizappts.herokuapp.com/mtgapi/cards/ordemPrecoDecrescente

Para realizar a inserção de uma nova carta, basta utilizar algum software que seja possível enviar requisições no formato POST com o seguinte JSON a ser enviado para o endpoint da API. Segue exemplo de utilização com software POSTMAN:
![image](https://user-images.githubusercontent.com/7890458/167462520-d8e70c81-39c2-4540-a69e-7debf06b605b.png)


API criada por Alarico Song
