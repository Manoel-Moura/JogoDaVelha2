package oo.jogodavelha;

import java.util.Map.Entry;
import java.util.Scanner;

import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;
import oo.jogodavelha.models.Coordenada;
import oo.jogodavelha.models.Jogada;
import oo.jogodavelha.models.Jogo;
import oo.jogodavelha.models.Partida;
import oo.jogodavelha.models.Tabuleiro;

public class Main {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido{
		boolean sair = false;
		int cond;

		while (!sair) {
			Partida.menuPartida();
			cond = teclado.nextInt();

			switch (cond) {
			case 0: {
				sair = true;
				break;
			}
			case 1: {
				Partida p = new Partida();
				break;
			}
			default:
				System.err.println("[ERRO] Entrada invalida.");
			}
		}

	}

}
