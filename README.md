# Jogo da Velha OO

Este repositório contém os testes para guiar a construção de um Jogo da Velha simples. O rempositório é um template de trabalho disciplina de Programação II. O trabalho contém uma questão.

## Objetivo
Ao concluir esta atividade, o aluno de ter implementado um Jogo da Velha funcional, que funcione e passe em todos os testes funcionais adicionados na pasta ```test```.

## Trabalho
Abaixo são descritas as classes pré-existentes, os casos de teste implementados e as classes que devem ser criadas para o efetivo funcionamento do jogo.
### Classes Pré-existentes

Nome da classe | Descrição
--------- | ------
[Main.java]() | Esta classe contém um método ```main(String[] args)```, que deve ser utilizado como poto de início do jogo.

### Classes de Teste

Nome da classe | Descrição
--------- | ------
[RegrasDeConfiguracaoDeJogoTest.java]() | Esta classe contém um caso de teste relacionado a inicialização do jogo. 
[RegrasDeJogadaTest.java]() | Esta classe contém casos de teste para algumas das regras de do jogo relacionadas às jogadas. 
[RegrasDeVitoriaTest.java]() | Esta classe contém casos de teste para algumas das regras de do jogo relacionadas vitória de um dos jogadores. Para complementar, você pode incluir testes de empate.

### Classes à construir

Nome da classe | Descrição
--------- | ------
[Jogo.java]() | Esta classe deverá conter as regras do jogo. 
[Coordenada.java]() | Esta classe representará a posição no tabuleiro e servirá de referência para execução das jogadas. 
[Jogada.java]() | Esta classe representará um única joga de um símbolo (```Character```) em uma posição (```Coordenada```) do ```Tabuleiro```.
[Tabuleiro.java]() | Esta classe conterá o mapa de jogadas de uma partida.

## Exceções à construir
Nome da classe | Descrição
--------- | ------
[ExcecaoPorCoordenadaInvalida.java]() | Esta classe representará um erro que aconteceu devido uma ```Coordenada``` inválida. Uma ```Coordenada``` pode ser inválida para uma ```Jogada``` (i) por já ter sido marcada ou (ii) estar fora dos limites do ```Tabuleiro```.
[ExcecaoPorSimboloInvalido.java]() | Esta classe representará um erro que aconteceu devido um símbolo (```Character```) incorreto. Um símbolo pode ser inválido (i) por ser um valor diferente de _X_ (x maiúsculo) ou _O_ (ó maiúsculo), (ii) por razão da última jogada já ter sido feita com o símbolo em análise, ou (iii) por ser diferente de _O_ na primeira jogada.

