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

	public ArrayList<Character> minhasJogadas = new ArrayList<Character>();

	public Map getBoard() {
		return tabuleiro.getTabuleiro();
	}

	public boolean check(Jogada umaJogada) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido  {
		boolean test = tabuleiro.checkPosition(umaJogada.coordenada);

		if (test)
			return false;
		return true;
	}

	

	public static void init() {
		
	}

	public void printTabuleiro() {
		tabuleiro.printMatriz();
	}

	public void add(Jogada jogada) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido{
		boolean test = this.check(jogada);
		
	
		try {
			if (test) {
				minhasJogadas.add(jogada.getSimbolo());
				this.tabuleiro.add(jogada);
				
			}
		} catch (ExcecaoPorSimboloInvalido | ExcecaoPorCoordenadaInvalida s) {
			throw s;
		}

	}
	
	public boolean hasWinner() {
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
