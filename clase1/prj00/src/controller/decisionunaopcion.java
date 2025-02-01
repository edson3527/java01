
package controller;

/**
 *
 * @author Alumno
 */
public class decisionunaopcion {
    public static void main(String[] args ){
        //determinar si un año es bisiesto
        // el año dser multiplo de 4 pero no de 100 pero si de 400 
        
        int año = 2000;
        
         boolean r = (año%4 == 0 && año % 100 != 0 || año % 400 == 0 ) ;
         
         if(r == true) {
             System.out.println(año + " es bisiesto");
         }
            
        
        
    }
}
