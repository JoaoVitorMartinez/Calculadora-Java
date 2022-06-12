/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5Suite.java to edit this template
 */
package teste;


import calculadora.*;
import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class) // No SuiteClasses Vai todos os testes unitários para serem realizados em conjunto.
@SuiteClasses({TesteCalculadora.class})

public class NewTestSuite {
    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(NewTestSuite.class);
    }


    
}
