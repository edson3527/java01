
/**
 * Write a description of class curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class curso
{
    private String codigo;
    private String nombre_curso;
    private String fecha;
    private String Nuevafecha;
    
   
    public void registrarcurso(String cod , String nomb , String fec ){
        
        codigo = cod;
        nombre_curso = nomb;
        fecha = fec;
        
    }
    public void modificarfechainicio(String Nuevafecha){
       
       fecha = Nuevafecha ;
       
   }
    public String modificarfechacurso(String Nuevafecha){
        return fecha;
    }
    
     public void Mostrarcurso () {
       System.out.println("codigo del curso: " +codigo);
       System.out.println("nombre del curso: " +nombre_curso);
       System.out.println("fecha del curso : " +fecha) ;
   }
   
   
   
}
