import java.util.ArrayList;

public class Equipo {

	private ArrayList<Jugador> jugadores;  // Cambio de List a ArrayList
	private String nombreEquipo;
	private int añoFundacion;
	private Jugador capitan;

	// Constructor
	public Equipo(ArrayList<Jugador> jugadores, String nombreEquipo, int añoFundacion, Jugador capitan) {
		this.jugadores = jugadores != null ? jugadores : new ArrayList<>();  // Inicialización de la lista
		this.nombreEquipo = nombreEquipo;
		this.añoFundacion = añoFundacion;
		this.capitan = capitan;
	}

	// Getters y Setters
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores != null ? jugadores : new ArrayList<>();
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public int getAñoFundacion() {
		return añoFundacion;
	}

	public void setAñoFundacion(int añoFundacion) {
		this.añoFundacion = añoFundacion;
	}

	public Jugador getCapitan() {
		return capitan;
	}

	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	// Método toString
	@Override
	public String toString() {
		return "Equipo{" +
				"jugadores=" + jugadores +
				", nombreEquipo='" + nombreEquipo + '\'' +
				", añoFundacion=" + añoFundacion +
				", capitan=" + capitan +
				'}';
	}

	// Método para crear un jugador
	public void crearJugador(String nombre, int edad, String sexo, String posicionEnCancha, String equipo, int numeroCamiseta) {
		Jugador newJugador = new Jugador(nombre, edad, sexo, posicionEnCancha, equipo, numeroCamiseta);
		jugadores.add(newJugador);
		System.out.println("Jugador creado y agregado exitosamente: " + newJugador);
	}

	// Método para eliminar un jugador
	public void eliminarJugador(String nombre, int numCamiseta, String equipo) {
		boolean jugadorEncontrado = false;
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equals(nombre) && jugador.getNumeroCamiseta() == numCamiseta && jugador.getEquipo().equals(equipo)) {
				jugadores.remove(jugador);
				System.out.println("Jugador eliminado exitosamente: " + jugador);
				jugadorEncontrado = true;
				break;
			}
		}
		if (!jugadorEncontrado) {
			System.out.println("Jugador no encontrado, no es posible eliminar");
		}
	}

	// Método para cambiar datos de un jugador
	public void cambiarDatosJugador(String nombre, int numCamiseta, String equipo, String newNombre, int newEdad, String newPosicionEnCancha, String newEquipo, int newNumeroCamiseta) {
		boolean jugadorEncontrado = false;
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equals(nombre) && jugador.getNumeroCamiseta() == numCamiseta && jugador.getEquipo().equals(equipo)) {
				jugador.setNombre(newNombre);
				jugador.setEdad(newEdad);
				jugador.setEquipo(newEquipo);
				jugador.setNumeroCamiseta(newNumeroCamiseta);
				jugador.setPosicionEnCancha(newPosicionEnCancha);
				System.out.println("Datos del jugador actualizados exitosamente: " + jugador);
				jugadorEncontrado = true;
				break;
			}
		}
		if (!jugadorEncontrado) {
			System.out.println("Jugador no encontrado, no es posible editar sus datos");
		}
	}

	// Método para mostrar jugadores por equipo
	public void mostrarJugadoresPorEquipo(String equipo) {
		boolean jugadoresEncontrados = false;
		for (Jugador jugador : jugadores) {
			if (jugador.getEquipo().equals(equipo)) {
				System.out.println(jugador);
				jugadoresEncontrados = true;
			}
		}
		if (!jugadoresEncontrados) {
			System.out.println("No hay jugadores en el equipo: " + equipo);
		}
	}
}
