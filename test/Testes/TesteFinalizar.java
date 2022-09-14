/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Testes;

import formularios.frmFinal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 47127512021.1
 */
public class TesteFinalizar {

    public TesteFinalizar() {
    }

    @Test
    public void testeTotalEnt0Des0() { //entrega 0 e desconto 0
        frmFinal fF = new frmFinal();
        double output = fF.testeFinal(0,0);
        assertEquals(100, output);
    }
    @Test
    public void testeTotalEnt10Des0() { //entrega 10 e desconto 0
        frmFinal fF = new frmFinal();
        double output = fF.testeFinal(10,0);
        assertEquals(110, output);
    }
    @Test
    public void testeTotalEnt0Des10() { //entrega 0 e desconto 10
        frmFinal fF = new frmFinal();
        double output = fF.testeFinal(0,10);
        assertEquals(90, output);
    }
    @Test
    public void testeTotalEnt10Des10() { //entrega 20 e desconto 10
        frmFinal fF = new frmFinal();
        double output = fF.testeFinal(10,10);
        assertEquals(110, output);
    }
    @Test
    public void testeTotalEntMinusDes0() { //entrega -10 e desconto 0
        frmFinal fF = new frmFinal();
        double output = fF.testeFinal(-10,0);
        assertEquals(90, output);
    }
    @Test
    public void testeTotalEnt0DesMinus() { //entrega 0 e desconto -10
        frmFinal fF = new frmFinal();
        double output = fF.testeFinal(0,-10);
        assertEquals(110, output);
    }
    @Test
    public void testeTotalEntMinusDesMinus() { //entrega -20 e desconto -10
        frmFinal fF = new frmFinal();
        double output = fF.testeFinal(-10,-10);
        assertEquals(90, output);
    }
}
