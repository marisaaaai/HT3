/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maris
 * @param <T>
 */
public interface iComparable <T> {
    public abstract int compare (Object a, Object b);
    //Pre: a y b son del mismo tipo de objeto
    //post: regresa un valor, menor igual o mayor a cero cuando a es menor, igual o mayor que b
}
