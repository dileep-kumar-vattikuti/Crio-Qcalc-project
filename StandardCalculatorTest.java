package com.crio.qcalc;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }




    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(2.5,1.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(4.0, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        standardCalculator.subtract(2,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    @DisplayName("Test multiplication of two numbers")
    void testMultiplyOperation(){
        standardCalculator.multiply(2,3);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(6,actualResult);

    }
    @Test
    @DisplayName("Test Division of Two Integers")
    void testDivisionOperation(){
        standardCalculator.divide(25,5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(5.0,actualResult);

    }

    
@Test

@DisplayName("Test Multiplication of Two Doubles")

void testMultiplicationOperationForDoubles(){
        standardCalculator.multiply(1.0,1.0);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(1.0, actualResult);

}


@Test

@DisplayName("Test Division of Two Doubles")

void testDivisionOperationForDoubles(){

        standardCalculator.divide(30.0,10.0);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(3.0, actualResult);

}


@Test

@DisplayName("Test Addition of Two Doubles")

void testAdditionOperationForDoubles(){

        standardCalculator.add(1.5,1.5);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(3.0, actualResult);

}


@Test

@DisplayName("Test Subtraction of Two Doubles")

void testSubtractionOperationForDoubles(){

        standardCalculator.subtract(10.0,20.0);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(-10.0, actualResult);

}

@Test

@DisplayName("Test Addition Overflow of Two Doubles")

void testAdditionOverflowForDoubles(){

    //Assert

    Assertions.assertThrows(ArithmeticException.class,new Executable(){

        @Override

        public void execute() throws Throwable{

            standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);

        }

    });

}


@Test

@DisplayName("Test Subtraction Overflow of Two Doubles")

void testSubtractionOverflowForDoubles(){

    //Assert

    Assertions.assertThrows(ArithmeticException.class,new Executable(){

    @Override

    public void execute() throws Throwable{

            standardCalculator.subtract(-Double.MAX_VALUE,Double.MAX_VALUE);

        }

    });
}
    

    @Test

    @DisplayName("Test Division Divide By Zero Scenario")
 
    void testDivisionDivideByZero(){
 
        //Assert
 
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
 
            @Override
 
            public void execute() throws Throwable{
 
                standardCalculator.divide(10,0);
 
            }
 
        });
 
    }
 
 

}

