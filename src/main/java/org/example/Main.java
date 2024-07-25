package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado=new Scanner(System.in);

        //DECLARACION DE VARIABLES

        String nombreUsuario;
        String modeloAutomovil;
        double distanciaViajeKM;
        double consumoCombustiblePor100Km;
        double precioLitroCombustible=15000;
        double totalCombustible;
        double precioTotal;


        //ENTRADAS DE VARIABLES


        System.out.print("Bienvenido: Digite su nombre: ");
        nombreUsuario=leerTeclado.nextLine();

        System.out.print(nombreUsuario+" Ingrese el modelo del automovil: ");
        modeloAutomovil=leerTeclado.nextLine();

        System.out.print("Que distancia recorriste en kilometros (KM): ");
        distanciaViajeKM=leerTeclado.nextDouble();

        System.out.print("Ingrese el consumo del combustible por cada 100 Km: ");
        consumoCombustiblePor100Km=leerTeclado.nextDouble();

        //CALCULOS

        totalCombustible= (distanciaViajeKM/100)*consumoCombustiblePor100Km;
        precioTotal=totalCombustible*precioLitroCombustible;

        //IMPRIMIR CONSOLA

        System.out.println(nombreUsuario+" su consumo total de combustible es "+totalCombustible);
        System.out.println("El costo total a pagar es "+precioTotal);







    }
}