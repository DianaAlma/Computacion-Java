/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6;

/**
 *
 * @author Diana
 */
public class Alumno {

        String nombre = "Diana Almazán";
        int calif [] = {85, 92, 100, 98, 100};
        
    public void imprimirAtributos (){
        
        System.out.println("Nombre del Alumno: " + nombre);
        for(int i=0;i<calif.length;i++)
        {
            System.out.println("Calificación Materia: "+calif[i]);
        }
    }
    
    public void obtenerPromedio()
    {
        int suma = 0;
        for (int i = 0; i < calif.length; i++){
        suma = suma + calif[i];
        } 
        int promedio = suma / calif.length;
            
          System.out.println("El promedio del alumno es: " + promedio);
    }
    
    public void obtenerCalificación (){
        int suma = 0;
        for (int i = 0; i < calif.length; i++){
        suma = suma + calif[i];
        } 
        int promedio = suma / calif.length;
            if (promedio <= 50){
                System.out.println("La calificación del alumno es: F");
           }
            if (promedio >= 51 && promedio <= 60){
                System.out.println("La calificación del alumno es: E");
           }
            if (promedio >= 61 && promedio <= 70){
                System.out.println("La calificación del alumno es: D");
           }
           if (promedio >= 71 && promedio <= 80){
                System.out.println("La calificación del alumno es: C");
           }
           if (promedio >= 81 && promedio <= 90){
                System.out.println("La calificación del alumno es: B");
           }
           if (promedio >= 91 && promedio <= 100){
                System.out.println("La calificación del alumno es: A");
           }
           else {
               System.out.println("Las calificaciones del alumno son invalidas");
           }
           
    }
   
}
