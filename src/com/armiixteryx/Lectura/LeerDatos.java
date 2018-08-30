package com.armiixteryx.Lectura;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LeerDatos {
    public static void main(String[] args) throws IOException {

    }

    public static void primeraLectura() throws IOException {
        String archivo = "prueba.dat";
        String linea = null;

        FileReader fr = new FileReader(archivo);
        BufferedReader entradaArchivo = new BufferedReader(fr);

        linea = entradaArchivo.readLine();

        while(linea != null) {
            System.out.println(linea);
            linea = entradaArchivo.readLine();
        }
        entradaArchivo.close();
    }
}
