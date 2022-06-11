/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import java.util.Locale;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    //-----------------------------------------------------------------------------------------
    public void IngresarEstudianteDistancia(String n, String a, String i, int e){
        EstudianteDistancia e1 = new EstudianteDistancia();
        e1.establecerNombresEstudiante(n);
        e1.establecerApellidoEstudiante(a);
        e1.establecerIdentificacionEstudiante(i);
        e1.establecerEdadEstudiante(e);
        e1.establecerNumeroAsginaturas(ingresarNumAsignatura());
        e1.establecerCostoAsignatura(ingresarCostoAsignatura());
        e1.calcularMatriculaDistancia();
        /*
        System.out.printf("Nombres: %S\n"
                + "Apellidos: %s\n"
                + "Identificacion: %s\n"
                + "Edad: %d\n"
                + "Numero de Asignaturas: %d\n"
                + "costo Asignatura: %.2f\n"
                + "Costo Matricula: %.1f\n"
                ,e1.obtenerNombresEstudiante(),
                e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(),
                e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroAsignaturas(),
                e1.obtenerCostoAsignatura(),
                e1.obtenerMatriculaDistancia());
        */
        System.out.printf("%s\n",e1);
    }
    public static void main(String[] args){
        EstudianteDistancia e1 = new EstudianteDistancia();
        e1.establecerNombresEstudiante(ingresarNombre());
        e1.establecerApellidoEstudiante(ingresarApellidos());
        e1.establecerIdentificacionEstudiante(ingresarId());
        e1.establecerEdadEstudiante(ingresarEdad());
        e1.establecerNumeroAsginaturas(ingresarNumAsignatura());
        e1.establecerCostoAsignatura(ingresarCostoAsignatura());
        e1.calcularMatriculaDistancia();
        /*
        System.out.printf("Nombres: %S\n"
                + "Apellidos: %s\n"
                + "Identificacion: %s\n"
                + "Edad: %d\n"
                + "Numero de Asignaturas: %d\n"
                + "costo Asignatura: %.2f\n"
                + "Costo Matricula: %.1f\n"
                ,e1.obtenerNombresEstudiante(),
                e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(),
                e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroAsignaturas(),
                e1.obtenerCostoAsignatura(),
                e1.obtenerMatriculaDistancia());
        */
        System.out.printf("%s\n",e1);
    }
        
    //-----------------------------------------------------------------------------------------
    public static String ingresarNombre(){
        Scanner leer = new Scanner(System.in);
        String n = "";
        System.out.print("Ingrese los Nombres del estudiante: ");
        n = leer.nextLine();
        System.out.println("");
        return n;
    }
    public static String ingresarApellidos(){
        Scanner leer = new Scanner(System.in);
        String n = "";
        System.out.print("Ingrese los Apellidos del estudiante: ");
        n = leer.nextLine();
        System.out.println("");
        return n;
    }
    public static String ingresarId(){
        Scanner leer = new Scanner(System.in);
        String n = "";
        System.out.print("Ingrese la identificacion del estudiante: ");
        n = leer.nextLine();
        System.out.println("");
        return n;
    }
    public static int ingresarEdad(){
        Scanner leer = new Scanner(System.in);
        int n = 0;
        System.out.print("Ingrese la edad del estudiante: ");
        n = leer.nextInt();
        System.out.println("");
        return n;
    }
    public static int ingresarNumAsignatura(){
        Scanner leer = new Scanner(System.in);
        int n = 0;
        System.out.print("Ingrese el numero de asignaturas del estudiante: ");
        n = leer.nextInt();
        System.out.println("");
        return n;
    }
    public static double ingresarCostoAsignatura(){
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        double n = 0;
        System.out.print("Ingrese el costo de las asignaturas del estudiante: ");
        n = leer.nextDouble();
        System.out.println("");
        return n;
    }
}
