
/**
 * Write a description of class alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alumno
{  private int cod_alum;
    private String nombres;
   private String apellidos;
   private String DNI;
   private String especialidad;
   private String fec_nacimiento;
   private String fec_inscripcion;
   private int año_estudios;
    
    
    
    public void registrarAlumno(int cod,String ape, String nom, int año_est){
        cod_alum = cod;
        apellidos = ape;
        nombres = nom;
        año_estudios = año_est;
        
    } 
    
    
    public int obtenerAñoEstudios(){
     return año_estudios;
        
    }
   public void Mostrarcarnet () {
       System.out.println("codigo: " +cod_alum);
       System.out.println("nombre: " +nombres);
       System.out.println("apellido: " +apellidos) ;
       System.out.println("años de estudio : " +año_estudios);
   }
}