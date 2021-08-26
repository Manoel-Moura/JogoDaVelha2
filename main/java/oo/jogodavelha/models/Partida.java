package oo.jogodavelha.models;

import java.util.Scanner;

import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;

public class Partida {
	 Scanner teclado = new Scanner(System.in);
	public Jogo g = new Jogo();
	public Character simbolo;
	public int cX, cY,xAnt = 3,yAnt;
	Character jogadaAnterior;
	

	public static void menuPartida() {
		System.out.println("\n   Menu ");
		System.out.println("(1)\tNova Partida");
		System.out.println("(0)\tSair");
	}



	public void umaJogada() throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {

		System.out.print("\nDigite um simblolo [X,O]: ");
		simbolo = teclado.next().charAt(0);
		
		//Se simbolo for invalido chama a funcao de novo
		if(simbolo != 'X' &&  simbolo != 'O' || simbolo == jogadaAnterior) {
			System.err.println("\n[ERRO] Simbolo invalido.");
			umaJogada();
		}

		System.out.print("Coordenada [X Y]: ");
		cX = teclado.nextInt();
		cY = teclado.nextInt();
		
		//Se posicao for invalida chama a funcao de novo
		if(cX < 0 || cX > 2 || cY < 0 || cY > 2 || (cX == xAnt && cY == yAnt)) {
			System.err.println("\n[ERRO] Posição invalida.");
			umaJogada();
		}
		
		System.out.println("");
		g.add(new Jogada(simbolo, new Coordenada(cX, cY)));
		g.printTabuleiro();
		jogadaAnterior = simbolo;
		xAnt = cX;
		yAnt = cY;
		
	}

	public Partida() throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		boolean vencedor = false;
		while (!vencedor) {
			umaJogada();
			vencedor = g.hasWinner();
		}
	}

}
