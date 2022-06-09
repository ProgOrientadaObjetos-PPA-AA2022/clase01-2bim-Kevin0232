/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class Vehiculo {
    String tipo;
    String matricula;
    double valor;
    
    public Vehiculo(String t, String m, double v){
        tipo = t;
        matricula = m;
        valor = v;
    }
    
    public void establecerTipo(String m) {
        tipo = m;
    }
    public void establecerMatricula(String m) {
        matricula = m;
    }

    public void establecerValor(double m) {
        valor = m;
    }

    public String obtenerTipo() {
        return tipo;
    }
    public String obtenerMatricula() {
        return matricula;
    }

    public double obtenerValor() {
        return valor;
    }
    @Override
    public String toString() {
        String cadena = String.format("Tipo de Vehiculo: %s\nMatricula: %s\n"
                + "Costo del edificio: %.2f", tipo,matricula,valor);
        return cadena;
    }
    
}
