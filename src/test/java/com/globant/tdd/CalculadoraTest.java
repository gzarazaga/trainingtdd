package com.globant.tdd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gonzalo on 26/10/2016.
 */
public class CalculadoraTest {

    @Test
    public void sumaTest() {
        //Arrange
        Calculadora calcu = new Calculadora();

        //Act
        int resultado = calcu.suma("");

        //Assert
        Assert.assertEquals(0, resultado);
    }
}
