package espoch.edu.ec.triangulo;


public class Triangulo {
    private boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        return true;
    }
     
    public String getTriangleType(String a, String b, String c) {
    	String type;
    	
        if ( !isInteger(a) || !isInteger(b) || !isInteger(c) )
    	   return "Los valores a ingresar deben ser numeros enteros";
        
        else if (Integer.valueOf(a) >= 100000000 || Integer.valueOf(b) >= 100000000 || Integer.valueOf(c) >= 100000000)
            return "Ingrese valores de 8 cifras";
        
    	else if ( (Integer.valueOf(a) + Integer.valueOf(b)) <= Integer.valueOf(c) || 
    			  (Integer.valueOf(a) + Integer.valueOf(c)) <= Integer.valueOf(b) || 
    			  (Integer.valueOf(b) + Integer.valueOf(c)) <= Integer.valueOf(a) ) 
    		return "Los valores ingresados no corresponden con los de un triangulo"; 
        
    	else if(Integer.valueOf(a) == Integer.valueOf(b) && Integer.valueOf(b) == Integer.valueOf(c))
    		type = "Triangulo equilatero";
        
    	else if (Integer.valueOf(a) == Integer.valueOf(b)  || Integer.valueOf(a) == Integer.valueOf(c) || 
    			 Integer.valueOf(c) == Integer.valueOf(b) )
    		type = "Triangulo isosceles";
        
    	else
    		type = "Triangulo escaleno";
    	
        return type;
    }
}

