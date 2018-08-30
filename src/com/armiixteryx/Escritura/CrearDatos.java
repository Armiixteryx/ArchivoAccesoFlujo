package com.armiixteryx.Escritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearDatos {
    public static void main(String[] args) throws IOException {

    }

    public static void primeraEscritura() throws IOException {
        final int MAX = 10;
        int valor;

        String archivo = "prueba.dat";
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter salidaArchivo = new PrintWriter(bw);

        for (int i = 0; i < MAX; i++) {
            valor = (int) (Math.random() * 100);
            salidaArchivo.print(valor + " ");
        }

        salidaArchivo.println();
        salidaArchivo.close();

        System.out.println("El archivo de salida ha sido creado: " + archivo);
    }
}
