/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadora;

import com.mycompany.calculadora1.Calculadora;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 *
 * @author alunopb
 */
public class TesteCalculadoraAdicao {

    public TesteCalculadoraAdicao() {
    }
    
    @Test
    public void testGetAdicao(){
        Calculadora calculadora = new Calculadora(4.0,2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getAdicao();
        assertEquals(retornoEsperado, retornoFeito, 0);

    }


    
   


}
