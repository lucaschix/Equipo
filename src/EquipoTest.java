import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class EquipoTest {

    private Equipo equipo;

    @BeforeEach
    void setUp() {
        equipo = new Equipo(new ArrayList<>(), "Real Madrid", 1902, null);
    }

    @Test
    void testCrearJugador() {
        equipo.crearJugador("Carlos", 25, "Masculino", "Delantero", "Real Madrid", 9);

        assertEquals(1, equipo.getJugadores().size(), "Debe haber 1 jugador en el equipo");
        assertEquals("Carlos", equipo.getJugadores().get(0).getNombre(), "El nombre del jugador debe ser Carlos");
        assertEquals(9, equipo.getJugadores().get(0).getNumeroCamiseta(), "El número de camiseta debe ser 9");
    }

    @Test
    void testEliminarJugadorExistente() {
        equipo.crearJugador("Carlos", 25, "Masculino", "Delantero", "Real Madrid", 9);
        equipo.crearJugador("Luis", 28, "Masculino", "Centrocampista", "Real Madrid", 8);

        equipo.eliminarJugador("Luis", 8, "Real Madrid");

        assertEquals(1, equipo.getJugadores().size(), "Debe quedar 1 jugador después de eliminar a Luis");
        assertEquals("Carlos", equipo.getJugadores().get(0).getNombre(), "El jugador restante debe ser Carlos");
    }

    @Test
    void testEliminarJugadorInexistente() {
        equipo.crearJugador("Carlos", 25, "Masculino", "Delantero", "Real Madrid", 9);

        equipo.eliminarJugador("Luis", 8, "Real Madrid");

        assertEquals(1, equipo.getJugadores().size(), "El número de jugadores debe permanecer igual al no encontrar el jugador");
        assertEquals("Carlos", equipo.getJugadores().get(0).getNombre(), "El jugador en el equipo debe seguir siendo Carlos");
    }

    @Test
    void testCambiarDatosJugadorExistente() {
        equipo.crearJugador("Carlos", 25, "Masculino", "Delantero", "Real Madrid", 9);

        equipo.cambiarDatosJugador("Carlos", 9, "Real Madrid", "Carlos Alberto", 26, "Delantero", "Real Madrid", 10);

        assertEquals("Carlos Alberto", equipo.getJugadores().get(0).getNombre(), "El nombre debe ser Carlos Alberto");
        assertEquals(26, equipo.getJugadores().get(0).getEdad(), "La edad debe ser 26");
        assertEquals(10, equipo.getJugadores().get(0).getNumeroCamiseta(), "El número de camiseta debe ser 10");
    }

    @Test
    void testCambiarDatosJugadorInexistente() {
        equipo.crearJugador("Carlos", 25, "Masculino", "Delantero", "Real Madrid", 9);

        equipo.cambiarDatosJugador("Luis", 8, "Real Madrid", "Luis Alberto", 30, "Centrocampista", "Real Madrid", 11);

        assertEquals("Carlos", equipo.getJugadores().get(0).getNombre(), "El nombre debe seguir siendo Carlos");
        assertEquals(9, equipo.getJugadores().get(0).getNumeroCamiseta(), "El número de camiseta debe seguir siendo 9");
    }

    @Test
    void testMostrarJugadoresPorEquipoExistente() {
        equipo.crearJugador("Carlos", 25, "Masculino", "Delantero", "Real Madrid", 9);
        equipo.crearJugador("Luis", 28, "Masculino", "Centrocampista", "Real Madrid", 8);

        // Captura de salida en consola para verificación (opcional)
        assertDoesNotThrow(() -> equipo.mostrarJugadoresPorEquipo("Real Madrid"), "La búsqueda no debe lanzar excepciones");
    }

    @Test
    void testMostrarJugadoresPorEquipoInexistente() {
        equipo.crearJugador("Carlos", 25, "Masculino", "Delantero", "Real Madrid", 9);

        // Captura de salida en consola para verificación (opcional)
        assertDoesNotThrow(() -> equipo.mostrarJugadoresPorEquipo("Barcelona"), "La búsqueda en un equipo vacío no debe lanzar excepciones");
    }
}
