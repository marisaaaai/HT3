/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maris
 */
public class Sorts {
    //Metodo de insrtion sort
    public static <T> void insertionSort(T data[], iComparable<T> c){
        //pre: c compara los objetos que encuentra en el array 
        //post: los valores en el array estan ordenados en orden ascendiente
        int numSorted = 1; //numero de datos ya ordenados
        int index;//index del numero en el array
        int n = 10; //valor que se ira cambiando para comparar los tiempos del profiler, normalmente es data.length;
        while(numSorted<n){
            //toma el primer valor del array
            T temp = data[numSorted];
            //lo inserta en donde corresponda
            for(index=numSorted;index>0;index--){
                if(c.compare(temp,data[index-1])<0){
                    data[index] = data[index-1];
                }
                else{
                    break;
                }
            }
            //reinserta el valor
            data[index]= temp;
            numSorted++; 
        }
    }
    public static <T> void selectionSort(T data[], iComparable<T> c){
        int length=10; //valor que cambiara como se desee
        for(int i=0;i<(length-1);i++){
            int minIndex = i;
            for (int j = i+1;j<length;j++){
                if(c.compare(data[j],data[minIndex])<0){
                    minIndex=j;
                }
            }
            T temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }
    /*
    public static <T> void mergeSort(T data[],T temp[],int low, int middle, int high, iComparable<T> c) {      
        int ri = low;
        int ti = low;
        int di = middle;
        while((ti<middle)&&(di<=high)){
            if(c.compare())
        }
    } 
}
