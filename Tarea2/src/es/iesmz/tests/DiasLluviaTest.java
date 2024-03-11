package es.iesmz.tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiasLluviaTest {

    /// TODO! No puedo hacer los test ya que en el intelliJ que tengo en mi casa no me sale el boton de play a la izquierda para ejecutarlo, he puesto 3 test pero estan hechos sin poder ejecutarlos, no hago mas ya que no se si estan fallando o no.
    private DiasLluvia diaLluvia;

    @Test
    public void testRegistrarDiaCorrecto(){
        assertTrue(diaLluvia.registroDia(23, 12, true));
    }

    @Test
    public void testRegistrarDiaIncorrecto(){
        assertNotEquals(diaLluvia.registroDia(32, 0, false), false);
    }

    @Test
    public void testPrimerDiaDeLluvia(){
        diaLluvia.registroDia(3,1,true);

        assertEquals(1, diaLluvia.primerDiaLluvia());
    }
}