package oo.jogodavelha.models;

public class Jogada {

	Character simbolo;
	Coordenada coordenada;

	public Jogada(Character c, Coordenada coordenada) {
		setSimbolo(c);
		setCoordenada(coordenada);
	}

	public Character getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada novacoordenada) {
		if (this.coordenada == null) {
			this.coordenada = novacoordenada;
		}
	}
}
