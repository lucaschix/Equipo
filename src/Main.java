import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Creación de un ArrayList para los jugadores
        ArrayList<Jugador> jugadores = new ArrayList<>();

        // Creación del equipo
        Equipo equipo = new Equipo(jugadores, "Real Madrid", 1902, null);

        // Crear jugadores usando el método de la clase Equipo
        equipo.crearJugador("Carlos", 25, "Masculino", "Delantero", "Real Madrid", 9);
        equipo.crearJugador("Luis", 28, "Masculino", "Centrocampista", "Real Madrid", 8);
        equipo.crearJugador("Fernando", 23, "Masculino", "Defensa", "Barcelona", 4);

        // Establecer el capitán
        equipo.setCapitan(equipo.getJugadores().get(0)); // Establecer el primer jugador como capitán

        // Mostrar equipo y jugadores iniciales
        System.out.println("Estado inicial del equipo:");
        System.out.println(equipo);

        // Crear un nuevo jugador utilizando el método de la clase Equipo
        System.out.println("\nAñadiendo un nuevo jugador...");
        equipo.crearJugador("Sergio", 30, "Masculino", "Portero", "Real Madrid", 1);
        System.out.println("Estado después de añadir el nuevo jugador:");
        System.out.println(equipo);

        // Eliminar un jugador
        System.out.println("\nEliminando un jugador...");
        equipo.eliminarJugador("Luis", 8, "Real Madrid");
        System.out.println("Estado después de eliminar el jugador:");
        System.out.println(equipo);

        // Cambiar los datos de un jugador
        System.out.println("\nCambiando los datos de un jugador...");
        equipo.cambiarDatosJugador("Carlos", 9, "Real Madrid", "Carlos Alberto", 26, "Delantero", "Real Madrid", 10);
        System.out.println("Estado después de cambiar los datos del jugador:");
        System.out.println(equipo);

        // Mostrar jugadores de un equipo específico
        System.out.println("\nMostrando jugadores de Real Madrid:");
        equipo.mostrarJugadoresPorEquipo("Real Madrid");
    }
}
