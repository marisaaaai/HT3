/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maris
 *  Códigos obtenido del libro Java Strictures: Java Structures for the principled programmer
 * autor: James Duane
 */
public class Sorts {
    //Metodo de insrtion sort
    public void selectionSort(int data[], int na){
        int n = na;
        for (int i = 0; i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if (data[j]<data[min]){
                    min = j;
                }
            }
            int temp = data[min];
            data[min]=data[i];
            data[i]=temp;
        }
    }
    public void toString(int data[],int na){
        int n = na;
        for(int i=0;i<n;i++){
            System.out.println(data[i]+ " ");
        }
        System.out.println();
    }
 
}
