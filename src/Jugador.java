public class Jugador {

	private String nombre;
	private int edad;
	private String sexo;
	private String posicionEnCancha;
	private String equipo;
	private int numeroCamiseta;

	// Constructor
	public Jugador(String nombre, int edad, String sexo, String posicionEnCancha, String equipo, int numeroCamiseta) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.posicionEnCancha = posicionEnCancha;
		this.equipo = equipo;
		this.numeroCamiseta = numeroCamiseta;
	}

	// Getters y Setters
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPosicionEnCancha() {
		return posicionEnCancha;
	}

	public void setPosicionEnCancha(String posicionEnCancha) {
		this.posicionEnCancha = posicionEnCancha;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	// Método toString
	@Override
	public String toString() {
		return "Jugador{" +
				"nombre='" + nombre + '\'' +
				", edad=" + edad +
				", sexo='" + sexo + '\'' +
				", posicionEnCancha='" + posicionEnCancha + '\'' +
				", equipo='" + equipo + '\'' +
				", numeroCamiseta=" + numeroCamiseta +
				'}';
	}
}
