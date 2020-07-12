package ar.jluque.telmexhub.lambda;

public class Persona {

	private int id;
	private String nombre;
	private int edad;
	private Sex sexo;
	private int telefono;
	private String email;
	private int codigoPostal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Sex getSexo() {
		return sexo;
	}

	public void setSexo(Sex sexo) {
		this.sexo = sexo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", telefono="
				+ telefono + ", email=" + email + ", codigoPostal=" + codigoPostal + "]";
	}


}
