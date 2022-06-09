/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(20000);
        //System.out.println(edf1);

        Edificio edf2 = new Edificio("Edificio Norte");
        edf2.establecerCostos(30000);

        Edificio edf3 = new Edificio("Edificio Sur");
        edf3.establecerCostos(10000);

        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCostos(5000);

        Edificio[] listaEdificios = {edf1, edf2, edf3, edf4};
        double c = listaEdificios[2].obtenerCosto();
        //System.out.println(c);

        Vehiculo v1 = new Vehiculo("Auto","LBB0011", 10000);
        Vehiculo v2 = new Vehiculo("Camioneta","LCB0011", 20000);
        Vehiculo v3 = new Vehiculo("Auto","LBD0012", 6000);
        Vehiculo v4 = new Vehiculo("Camioneta","LCC0011", 10000);
        Vehiculo v5 = new Vehiculo("Camioneta","LDC0011", 25000);
        
        Vehiculo[] ve = {v1,v2,v3,v4,v5};
        

        // Crear un objeto de tipo Empresa:
        Empresa miempresa = new Empresa();
        //  Nombre: Empresa de Hojas
        miempresa.establecerNombre("Empresa de Hojas");
        //  Lista de edificio: edf1, edf2, edf3, edf4
        miempresa.establecerEdificios(listaEdificios);
        miempresa.establecerVehiculo(ve);
        // Imprimir el costo de los bienes inmuebles de la empresa
        miempresa.establecerCostoBienesInmuebles();
        miempresa.establecerCostoVehiculos();
        miempresa.establecerCostoTotalBienes();
        //System.out.printf("%.2f",emp.obtenerCostoBienesInmuebles());

        System.out.printf("%s\n", miempresa);

        //System.out.println(emp);
    }
}
