package oo.jogodavelha.models;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;

public class Jogo {

	private Scanner ler = new Scanner(System.in);

	public Tabuleiro tabuleiro = new Tabuleiro();
	
	Character ultimaJogada = ' ';
	public Map getBoard() {
		return tabuleiro.getTabuleiro();
	}

	public boolean check(Jogada umaJogada) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {

		int x = umaJogada.getCoordenada().getX();
		int y = umaJogada.getCoordenada().getY();
		
		if (x < 0 || x > 2 || y < 0 || y > 2) {
			throw new ExcecaoPorCoordenadaInvalida();
		}	
		
		tabuleiro.preencheMatriz();
		if (tabuleiro.getMatrizTabuleiro(x, y) == 'X' || tabuleiro.getMatrizTabuleiro(x, y) == 'O') {
			ExcecaoPorCoordenadaInvalida c = new ExcecaoPorCoordenadaInvalida();
			throw c;
		}
		
		if (umaJogada.getSimbolo() == ultimaJogada) {
			ExcecaoPorSimboloInvalido s = new ExcecaoPorSimboloInvalido();
			throw s;
	}
		
		
		
		if (tabuleiro.getTabuleiro().isEmpty()) {
			System.out.println("Comece a partida :)\n");
//			tabuleiro.printMatriz();
//			System.out.println("\n");
		}
		
		
		return true;
	}
//		teste jogada em coord preenchida
//		if(checkPosition(umaJogada.getCoordenada())) {
//			return true;
//		}else if(validaPosicao(umaJogada.getCoordenada().getX(), umaJogada.getCoordenada().getY())) {
//			return true;
//		}else {
//			return false;
//		}

	public static void init() {

	}

	public void printTabuleiro() {
		tabuleiro.printMatriz();
	}

	public void add(Jogada jogada) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
//		boolean test = this.check(jogada);
		try {

			if (check(jogada)) {
				tabuleiro.add(jogada);
				ultimaJogada = jogada.getSimbolo();
				tabuleiro.preencheMatriz();
			}
		} catch (ExcecaoPorCoordenadaInvalida | ExcecaoPorSimboloInvalido e) {
			throw e;
		}

	}

	public boolean hasWinner() throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
//		tabuleiro.completaMatriz();
		int teste = 0;
		if (tabuleiro.getMatrizTabuleiro(0, 0)==('X') && tabuleiro.getMatrizTabuleiro(0, 1)==('X')
				&& tabuleiro.getMatrizTabuleiro(0, 2)==('X')) {
			System.out.println("\nJogador X ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(0, 0)==('O') && tabuleiro.getMatrizTabuleiro(0, 1)==('O')
				&& tabuleiro.getMatrizTabuleiro(0, 2)==('O')) {
			System.out.println("\nJogador O ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(1, 0)==('X') && tabuleiro.getMatrizTabuleiro(1, 1)==('X')
				&& tabuleiro.getMatrizTabuleiro(1, 2)==('X')) {
			System.out.println("\nJogador X ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(1, 0)==('O') && tabuleiro.getMatrizTabuleiro(1, 1)==('O')
				&& tabuleiro.getMatrizTabuleiro(1, 2)==('O')) {
			System.out.println("\nJogador O ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(2, 0)==('X') && tabuleiro.getMatrizTabuleiro(2, 1)==('X')
				&& tabuleiro.getMatrizTabuleiro(2, 2)==('X')) {
			System.out.println("\nJogador X ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(2, 0)==('O') && tabuleiro.getMatrizTabuleiro(2, 1)==('O')
				&& tabuleiro.getMatrizTabuleiro(2, 2)==('O')) {
			System.out.println("\nJogador O ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(0, 0)==('X') && tabuleiro.getMatrizTabuleiro(1, 0)==('X')
				&& tabuleiro.getMatrizTabuleiro(2, 0)==('X')) {
			System.out.println("\nJogador X ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(0, 0)==('O') && tabuleiro.getMatrizTabuleiro(1, 0)==('O')
				&& tabuleiro.getMatrizTabuleiro(2, 0)==('O')) {
			System.out.println("\nJogador O ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(0, 1)==('X') && tabuleiro.getMatrizTabuleiro(1, 1)==('X')
				&& tabuleiro.getMatrizTabuleiro(2, 1)==('X')) {
			System.out.println("\nJogador X ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(0, 1)==('O') && tabuleiro.getMatrizTabuleiro(1, 1)==('O')
				&& tabuleiro.getMatrizTabuleiro(2, 1)==('O')) {
			System.out.println("\nJogador O ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(0, 2)==('X') && tabuleiro.getMatrizTabuleiro(1, 2)==('X')
				&& tabuleiro.getMatrizTabuleiro(2, 2)==('X')) {
			System.out.println("\nJogador X ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(0, 2)==('O') && tabuleiro.getMatrizTabuleiro(1, 2)==('O')
				&& tabuleiro.getMatrizTabuleiro(2, 2)==('O')) {
			System.out.println("\nJogador O ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(0, 0)==('X') && tabuleiro.getMatrizTabuleiro(1, 1)==('X')
				&& tabuleiro.getMatrizTabuleiro(2, 2)==('X')) {
			System.out.println("\nJogador X ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(0, 0)==('O') && tabuleiro.getMatrizTabuleiro(1, 1)==('O')
				&& tabuleiro.getMatrizTabuleiro(2, 2)==('O')) {
			System.out.println("\nJogador O ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(0, 2)==('X') && tabuleiro.getMatrizTabuleiro(1, 1)==('X')
				&& tabuleiro.getMatrizTabuleiro(2, 0)==('X')) {
			System.out.println("\nJogador X ganhou!");
			teste = 1;
		} else if (tabuleiro.getMatrizTabuleiro(0, 2)== ('O') && tabuleiro.getMatrizTabuleiro(1, 1)==('O')
				&& tabuleiro.getMatrizTabuleiro(2, 0)== ('O')) {
			System.out.println("\nJogador O ganhou!");
			teste = 1;
		}

		if (teste == 1) {
			return true;
		} else {
			return false;
		}
//		} else if (tabuleiro.tamnahoMap() == 9) {
//			System.out.println("\nDeu velha");
//			return true;
//		}

	}
}
