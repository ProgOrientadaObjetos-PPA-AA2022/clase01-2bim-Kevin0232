/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;
/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args){
        EstudiantePresencial e1 = new EstudiantePresencial();
        e1.establecerNombresEstudiante("Kevin Joel");
        e1.establecerApellidoEstudiante("Bustamante Moncayo");
        e1.establecerIdentificacionEstudiante("1105446924");
        e1.establecerEdadEstudiante(18);
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(15);
        e1.calcularMatriculaPresencial();
        
        System.out.printf("Nombres: %S\n"
                + "Apellidos: %s\n"
                + "Identificacion: %s\n"
                + "Edad: %d\n"
                + "Numero de Creditos: %d\n"
                + "costo de Creditos: %.2f\n"
                + "Costo Matricula: %.1f\n"
                ,e1.obtenerNombresEstudiante(),
                e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(),
                e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroCreditos(),
                e1.obtenerCostoCredito(),
                e1.obtenerMatriculaPresencial());
    }
}
