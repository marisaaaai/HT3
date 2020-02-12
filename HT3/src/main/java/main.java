/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Se importan las clases necesarias
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author maris
 */
public class main {
    public static void main (String[]args){
     //Se instancia la clase que creara el archivo
        archivos arch = new archivos();
        arch.crear_archivo();//se crea el archivo
        String archivo = "numeros.txt";//una vez cread el archivo se guarda en una variable
        File fichero = new File (archivo);//se instancia el indicador de archivo que se usará
        Scanner s;//se instancia el scanner
        String linea="";//se crea la variable en donde se guardara lo que dice el archivo
        try{//si existe el archivo
            s= new Scanner(fichero);//que se escanee el archivo
            while(s.hasNextLine()){//mientras que haya una siguiente linea en el archivo que guarde en la variable linea loque encuentre el scaner
                linea += s.nextLine();
            }
        }
        catch(Exception ex){//si no existe el archivo mostrar mensaje de error
            System.out.println("Mensaje de error: "+ ex.getMessage());
        }
        //System.out.println(linea);muestra que la linea si guardo lo que se encontraba en el archivo
        String [] numerosArray = linea.split("\\s");
        
    }
}
