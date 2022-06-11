/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;

/**
 *
 * @author SALA I
 */
public class Ejecutor3 {

    //-----------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opc = 0;
        System.out.println("Ingrese 1 si desea ingresar un Estudiante a Distancia");
        System.out.println("Ingrese 2 si desea ingresar un Estudiante Presencial");
        System.out.print("Ingrese la opcion requerida: ");
        opc = leer.nextInt();
        System.out.println("");
        /*switch (opc) {
            case 1:
                ingresarDatos(opc);

                break;
            case 2:
                ingresarDatos(opc);
                break;
            case 3:
                System.out.println("----------------------------");
                System.out.println("Se ha ingresado un numero fuera de rango");
                break;
        }*/
        if(opc > 2 || opc < 1 ){
            System.out.println("----------------------------");
            System.out.println("Se ha ingresado un numero fuera de rango");
        }else{
            ingresarDatos(opc);
        }
    }

    //-----------------------------------------------------------------------------------------
    public static void ingresarDatos(int op) {
        String nombre = ingresarNombre();
        String apellido = ingresarApellidos();
        String Id = ingresarId();
        int edad = ingresarEdad();
        if (op == 1) {
            Ejecutor2 e2 = new Ejecutor2();
            e2.IngresarEstudianteDistancia(nombre, apellido, Id, edad);
            
        } else {
            
            EstudiantePresencial ed1 = new EstudiantePresencial();
            ed1.establecerNombresEstudiante(nombre);
            ed1.establecerApellidoEstudiante(apellido);
            ed1.establecerIdentificacionEstudiante(Id);
            ed1.establecerEdadEstudiante(edad);
            ed1.establecerNumeroCreditos(ingresarNumAsignatura());
            ed1.establecerCostoCredito(ingresarCostoAsignatura());
            ed1.calcularMatriculaPresencial();
            System.out.printf("%s\n", ed1);
        }

    }

    public static String ingresarNombre() {
        Scanner leer = new Scanner(System.in);
        String n = "";
        System.out.print("Ingrese los Nombres del estudiante: ");
        n = leer.nextLine();
        System.out.println("");
        return n;
    }

    public static String ingresarApellidos() {
        Scanner leer = new Scanner(System.in);
        String n = "";
        System.out.print("Ingrese los Apellidos del estudiante: ");
        n = leer.nextLine();
        System.out.println("");
        return n;
    }

    public static String ingresarId() {
        Scanner leer = new Scanner(System.in);
        String n = "";
        System.out.print("Ingrese la identificacion del estudiante: ");
        n = leer.nextLine();
        System.out.println("");
        return n;
    }

    public static int ingresarEdad() {
        Scanner leer = new Scanner(System.in);
        int n = 0;
        System.out.print("Ingrese la edad del estudiante: ");
        n = leer.nextInt();
        System.out.println("");
        return n;
    }

    public static int ingresarNumAsignatura() {
        Scanner leer = new Scanner(System.in);
        int n = 0;
        System.out.print("Ingrese el numero de creditos del estudiante: ");
        n = leer.nextInt();
        System.out.println("");
        return n;
    }

    public static double ingresarCostoAsignatura() {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        double n = 0;
        System.out.print("Ingrese el costo de los creditos del estudiante: ");
        n = leer.nextDouble();
        System.out.println("");
        return n;
    }
}
