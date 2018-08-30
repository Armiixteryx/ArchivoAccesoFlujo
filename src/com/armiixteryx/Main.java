package com.armiixteryx;

import java.util.Scanner;

import com.armiixteryx.Escritura.CrearDatos;
import com.armiixteryx.Lectura.LeerDatos;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] vacio = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("INICIO");
        boolean salida = false;
        while(!salida) {
            switch (Integer.parseUnsignedInt(sc.nextLine())) {
                case 1: CrearDatos.primeraEscritura(); break;
                case 2: LeerDatos.primeraLectura(); break;
                case 0: salida = true;
            }
        }
    }

}
