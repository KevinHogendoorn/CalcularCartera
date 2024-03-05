package es.iesmz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {
    @Test
    public void testCalcularSalarioBruto1(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 2000.0f, 8.0f);
        float resultadoEsperado = 1360.0f;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioNeto1(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(2000);
        float resultadoEsperado = 1640;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioNeto2(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(1500);
        float resultadoEsperado = 1230;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Deprecated
    public static void assertEquals(double ex, double actual){

    }

    @Test
    public void calcularSalarioNeto3(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioNeto((float) 1499.99);
        float resultadoEsperado = (float) 1259.9916;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioNeto4(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(1250);
        float resultadoEsperado = 1050;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioNeto5(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(1000);
        float resultadoEsperado = 840;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioNeto6(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioNeto((float) 999.99);
        float resultadoEsperado = (float) 999.99;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioNeto7(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(500);
        float resultadoEsperado = 500;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioNeto8(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(0);
        float resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioNeto9(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(-1);
        float resultadoEsperado = -1;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioBruto1(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 2000, 8);
        float resultadoEsperado = 1360;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioBruto2(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 1500, 3);
        float resultadoEsperado = 1260;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioBruto3(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, (float) 1499.99, 0);
        float resultadoEsperado = 1100;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioBruto4(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encarregat, 1250, 8);
        float resultadoEsperado = 1360;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioBruto5(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encarregat, 1000, 0);
        float resultadoEsperado = 1600;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioBruto6(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encarregat, (float) 999.99, 3);
        float resultadoEsperado = 1560;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioBruto7(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encarregat, 500, 0);
        float resultadoEsperado = 1500;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioBruto8(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encarregat, 0, 8);
        float resultadoEsperado = 1660;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioBruto9(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, -1, 8);
        float resultadoEsperado = -1;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioBruto10(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 1500, 1);
        float resultadoEsperado = -1;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void calcularSalarioBruto11(){
        System.out.println("veure @BeforeEach");
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(null, 1500, 8);
        float resultadoEsperado = -1;
        assertEquals(resultadoEsperado, resultadoReal);
    }
}