
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{

 public static void main (String x[]) {
     //definicion/creacion del objeto
     //nombre_clase nombre_objeto;
     alumno alum1;
     
     //Inicializar objeto (darle un espacio en memoria)
     //opcionalmente darle valores iniciales
     alum1 = null; //es nada no tiene espacio en la memoria
     
     
     alum1 = new alumno(); //asignacion de espacio
     
     alum1.registrarAlumno(12345,"Tello" , "Angie" , 4);
     
     
     alum1.Mostrarcarnet();
     
     
     System.out.println("------------------------");
     
      curso curs1;
     
     //Inicializar objeto (darle un espacio en memoria)
     //opcionalmente darle valores iniciales
     curs1 = null; //es nada no tiene espacio en la memoria
     
     
     curs1 = new curso(); //asignacion de espacio
     
     curs1.registrarcurso("progra12"," programacion" , "12/1"  );
     
     
     curs1.Mostrarcurso();
     
     curs1.modificarfechainicio("14/1");
     
     curs1.Mostrarcurso();
     
     
     
     
     
 }
 
       
}
