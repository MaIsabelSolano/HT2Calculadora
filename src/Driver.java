/**
 * Universidad del Valle de Guatemala
 * Facultad de Ingeniería
 * Dept. Ciencias de la Computación
 * CC2003 Algoritmos y Estructuras de Datos
 * @author Maria Isabel Solano 20504
 * @version 1
 */

import java.io.*;

public class Driver {
    public static void main (String[] args){

        Calculadora calc = new Calculadora();
        String expresion = leerTxt();
        String respuesta = calc.Calculo(expresion);
        System.out.println(respuesta);

    }

    //source: proyecto POO
    public static String leerTxt(){ //direccion del archivo

        String texto = "";

        try{
            BufferedReader bf = new BufferedReader(new FileReader("datos.txt"));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }

            texto = temp;

        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }

        return texto;

    }
}



