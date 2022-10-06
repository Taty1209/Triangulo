package espoch.edu.ec;

import espoch.edu.ec.triangulo.Triangulo;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class TestTriangulo {
	
    @Test
    public void CP1() {
    	Triangulo t = new Triangulo();
    	String a = "12", b = "12", c = "12";
    	assertTrue( t.getTriangleType(a, b , c).equals("Triangulo equilatero"));
    }
	
    
    @Test
    public void CP2() {
    	Triangulo t = new Triangulo();
    	String a = "11", b = "11", c = "10";
    	assertTrue( t.getTriangleType(a, b, c).equals("Triangulo isosceles"));
    }
    
    @Test
     public void CP3() {
        Triangulo t = new Triangulo();
        String a = "15", b = "14", c = "13";
        assertTrue( t.getTriangleType(a, b, c).equals("Triangulo escaleno") );
     }

     @Test
     public void CP4() {
        Triangulo t = new Triangulo();
        String a = "6", b = "7", c = "6";
        assertTrue( t.getTriangleType(a, b, c).equals("Triangulo isosceles") );
     }

     @Test
     public void CP5() {
        Triangulo t = new Triangulo();
        String a = "7", b = "8", c = "8";
        assertTrue( t.getTriangleType(a, b, c).equals("Triangulo isosceles") );
     }

     @Test
     public void CP6() {
        Triangulo t = new Triangulo();
        String a = "100", b = "120", c = "100";
        assertTrue( t.getTriangleType(a, b, c).equals("Triangulo isosceles") );
     }

     @Test
     public void CP7() {
        Triangulo t = new Triangulo();
        String a = "a", b = "b", c = "c";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros") );
     }

     @Test
     public void CP8() {
        Triangulo t = new Triangulo();
        String a = "5", b = "5", c = "11";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores ingresados no corresponden con los de un triangulo") );
     }

     @Test
     public void CP9() {
        Triangulo t = new Triangulo();
        String a = "13", b = "27", c = "13";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores ingresados no corresponden con los de un triangulo") );
     }

     @Test
     public void CP10() {
        Triangulo t = new Triangulo();
        String a = "20", b = "9", c = "9";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores ingresados no corresponden con los de un triangulo") );
     }

     @Test
     public void CP11() {
        Triangulo t = new Triangulo();
        String a = "a", b = "3", c = "c";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros") );
     }

     @Test
     public void CP12() {
        Triangulo t = new Triangulo();
        String a = "a", b = "a", c = "a";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros") );
     }

     @Test
     public void CP13() {
        Triangulo t = new Triangulo();
        String a = "1", b = "3", c = "c";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros") );
     }

     @Test
     public void CP14() {
        Triangulo t = new Triangulo();
        String a = "a", b = "3", c = "1";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros") );
     }

     @Test
     public void CP15() {
        Triangulo t = new Triangulo();
        String a = "1", b = "b", c = "3";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros") );
     }

     @Test
     public void CP16() {
        Triangulo t = new Triangulo();
        String a = ".", b = "b", c = "3";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros") );
     }

     @Test
     public void CP17() {
        Triangulo t = new Triangulo();
        String a = ".", b = ".", c = "3";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros") );
     }

     @Test
     public void CP18() {
        Triangulo t = new Triangulo();
        String a = ".", b = ".", c = ".";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros") );
     }

     @Test
     public void CP19() {
        Triangulo t = new Triangulo();
        String a = "1", b = "3", c = ".";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros") );
     }

     @Test
     public void CP20() {
        Triangulo t = new Triangulo();
        String a = ".", b = "3", c = ".";
        assertTrue( t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros") );
     }

     @Test
     public void CP21() {
        Triangulo t = new Triangulo();
        String a = "7", b = ".", c = ".";
        assertTrue(t.getTriangleType(a, b, c).equals("Los valores a ingresar deben ser numeros enteros"));
     }
     
    @Test
     public void CP22() {
        Triangulo t = new Triangulo();
        String a = "500000000", b = "500000000", c = "800000000";
        assertTrue(t.getTriangleType(a, b, c).equals("Ingrese valores de 8 cifras"));
     }
     
    @Test
     public void CP23() {
        Triangulo t = new Triangulo();
        String a = "900000000", b = "900000000", c = "900000000";
        assertTrue(t.getTriangleType(a, b, c).equals("Ingrese valores de 8 cifras"));
     }
     
    @Test
     public void CP24() {
        Triangulo t = new Triangulo();
        String a = "-11", b = "-11", c = "-11";
        assertTrue(t.getTriangleType(a, b, c).equals("Los valores ingresados no corresponden con los de un triangulo"));
     }
     
    @Test
     public void CP25() {
        Triangulo t = new Triangulo();
        String a = "-18", b = "-17", c = "-16";
        assertTrue(t.getTriangleType(a, b, c).equals("Los valores ingresados no corresponden con los de un triangulo"));
     }
}

