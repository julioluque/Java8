package ar.jluque.telmexhub.lambda;

public class Telefono {
	private int telefono;
	private String nombre;

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Telefono [telefono=" + telefono + ", nombre=" + nombre + "]";
	}

}
