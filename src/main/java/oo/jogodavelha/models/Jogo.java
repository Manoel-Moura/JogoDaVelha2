package oo.jogodavelha.models;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;

public class Jogo extends Tabuleiro{

	private Scanner ler = new Scanner(System.in);

	public Tabuleiro tabuleiro = new Tabuleiro();


	public Map getBoard() {
		return tabuleiro.getTabuleiro();
	}

	public boolean check(Jogada umaJogada) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido  {
		
		//teste jogada em coord preenchida
		if(checkPosition(umaJogada.getCoordenada())) {
			return true;
		}else if(validaPosicao(umaJogada.getCoordenada().getX(), umaJogada.getCoordenada().getY())) {
			return true;
		}else {
			return false;
		}
	}

	

	public static void init() {
		
	}

	public void printTabuleiro() {
		tabuleiro.printMatriz();
	}

	public void add(Jogada jogada) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido{
//		boolean test = this.check(jogada);
		
			if (check(jogada)) {
				tabuleiro.add(jogada);	
			}else {
				ExcecaoPorCoordenadaInvalida c = new ExcecaoPorCoordenadaInvalida();
				ExcecaoPorSimboloInvalido s = new ExcecaoPorSimboloInvalido();
				throw c;
			}
		

	}
	
	public boolean hasWinner(){
//		tabuleiro.completaMatriz();
		if (tabuleiro.getMatrizTabuleiro(0, 0).equals('X') && tabuleiro.getMatrizTabuleiro(0, 1).equals('X')
				&& tabuleiro.getMatrizTabuleiro(0, 2).equals('X')) {
			System.out.println("\nJogador X ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(0, 0).equals('O') && tabuleiro.getMatrizTabuleiro(0, 1).equals('O')
				&& tabuleiro.getMatrizTabuleiro(0, 2).equals('O')) {
			System.out.println("\nJogador O ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(1, 0).equals('X') && tabuleiro.getMatrizTabuleiro(1, 1).equals('X')
				&& tabuleiro.getMatrizTabuleiro(1, 2).equals('X')) {
			System.out.println("\nJogador X ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(1, 0).equals('O') && tabuleiro.getMatrizTabuleiro(1, 1).equals('O')
				&& tabuleiro.getMatrizTabuleiro(1, 2).equals('O')) {
			System.out.println("\nJogador O ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(2, 0).equals('X') && tabuleiro.getMatrizTabuleiro(2, 1).equals('X')
				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('X')) {
			System.out.println("\nJogador X ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(2, 0).equals('O') && tabuleiro.getMatrizTabuleiro(2, 1).equals('O')
				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('O')) {
			System.out.println("\nJogador O ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(0, 0).equals('X') && tabuleiro.getMatrizTabuleiro(1, 0).equals('X')
				&& tabuleiro.getMatrizTabuleiro(2, 0).equals('X')) {
			System.out.println("\nJogador X ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(0, 0).equals('O') && tabuleiro.getMatrizTabuleiro(1, 0).equals('O')
				&& tabuleiro.getMatrizTabuleiro(2, 0).equals('O')) {
			System.out.println("\nJogador O ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(0, 1).equals('X') && tabuleiro.getMatrizTabuleiro(1, 1).equals('X')
				&& tabuleiro.getMatrizTabuleiro(2, 1).equals('X')) {
			System.out.println("\nJogador X ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(0, 1).equals('O') && tabuleiro.getMatrizTabuleiro(1, 1).equals('O')
				&& tabuleiro.getMatrizTabuleiro(2, 1).equals('O')) {
			System.out.println("\nJogador O ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(0, 2).equals('X') && tabuleiro.getMatrizTabuleiro(1, 2).equals('X')
				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('X')) {
			System.out.println("\nJogador X ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(0, 2).equals('O') && tabuleiro.getMatrizTabuleiro(1, 2).equals('O')
				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('O')) {
			System.out.println("\nJogador O ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(0, 0).equals('X') && tabuleiro.getMatrizTabuleiro(1, 1).equals('X')
				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('X')) {
			System.out.println("\nJogador X ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(0, 0).equals('O') && tabuleiro.getMatrizTabuleiro(1, 1).equals('O')
				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('O')) {
			System.out.println("\nJogador O ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(0, 2).equals('X') && tabuleiro.getMatrizTabuleiro(1, 1).equals('X')
				&& tabuleiro.getMatrizTabuleiro(2, 0).equals('X')) {
			System.out.println("\nJogador X ganhou!");
			return true;
		} else if (tabuleiro.getMatrizTabuleiro(0, 2).equals('O') && tabuleiro.getMatrizTabuleiro(1, 1).equals('O')
				&& tabuleiro.getMatrizTabuleiro(2, 0).equals('O')) {
			System.out.println("\nJogador O ganhou!");
			return true;
		} else if (tabuleiro.tamnahoMap() == 9) {
			System.out.println("\nDeu velha");
			return true;
		}
		return false;
	}
}
