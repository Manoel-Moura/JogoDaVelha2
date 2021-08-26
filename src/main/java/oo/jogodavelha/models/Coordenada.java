package oo.jogodavelha.models;

public class Coordenada {

	int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Coordenada(int Nx, int Ny) {
		setX(Nx);
		setY(Ny);
	}

	public boolean equals(Coordenada obj) {
		if (obj.getX() == this.getX() && obj.getY() == this.getY()) {
			return true;
		}
		return false;
	}
}
