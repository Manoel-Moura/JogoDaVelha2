package oo.jogodavelha.models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;

public class Tabuleiro {

	public Map<Coordenada, Character> tabuleiro;
	Character matrizTabuleiro[][] = new Character[3][3];
	Character jogadaAnterior;

	public int tamnahoMap() {
		return tabuleiro.size();
	}

	protected Character getMatrizTabuleiro(int x, int y) {
		return matrizTabuleiro[x][y];
	}

	public Map getTabuleiro() {
		return tabuleiro;
	}

	private Coordenada getPosicao() {
		return null;

	}
	
	//
	public boolean checkPosition(Coordenada coordenada) {

		for (Coordenada coord : tabuleiro.keySet()) {
			if (coord.equals(coordenada)) {
				return false; 
			}
		}
		return true;
	}

	public void preencheMatriz() {
		completaMatriz();
		for (Coordenada chave : tabuleiro.keySet()) {
			matrizTabuleiro[chave.getX()][chave.getY()] = tabuleiro.get(chave);
		}
	}

	public void completaMatriz() {
		// preencheMatriz();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrizTabuleiro[i][j] == null) {
					matrizTabuleiro[i][j] = '*';
				}

			}
		}
	}
	
	//verifica que n foi marcada
	public boolean validaPosicao(int x, int y) {
		if (matrizTabuleiro[x][y] == null || matrizTabuleiro[x][y] == '*') {
			return true;
		}
		return false;
	}

	public void printMatriz() {
		preencheMatriz();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrizTabuleiro[i][j] == null) {
					System.out.print("  | ");
				} else {
					System.out.print(matrizTabuleiro[i][j] + " | ");

				}

			}
			System.out.println(" ");
		}
	}

	public Tabuleiro() {
		tabuleiro = new HashMap<Coordenada, Character>();
	}

	public void add(Jogada umaJogada) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {
		int x = umaJogada.coordenada.getX();
		int y = umaJogada.coordenada.getY();
		Character simbolo = umaJogada.getSimbolo();

		if (simbolo != 'X' && simbolo != 'O' || simbolo == jogadaAnterior) {
			throw new ExcecaoPorSimboloInvalido();
		}
		
		//valida posicao retorna false se a posicao for inválida
//		if(!validaPosicao(x, y)) {
//			throw new ExcecaoPorCoordenadaInvalida();
//		}
		if(!checkPosition(umaJogada.getCoordenada())) {
			throw new ExcecaoPorCoordenadaInvalida();
		}
		if (x < 0 || x > 2 || y < 0 || y > 2) {
			throw new ExcecaoPorCoordenadaInvalida();
		}
		tabuleiro.put(umaJogada.coordenada, umaJogada.simbolo);
		jogadaAnterior = simbolo;
	}

}