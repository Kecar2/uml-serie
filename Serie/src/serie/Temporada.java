package serie;

public class Temporada {
	private int numero;
	
	public void capitulo (Serie numero) {
		numero.agregaCapitulo(numero);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
