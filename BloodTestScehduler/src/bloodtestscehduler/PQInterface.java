/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscehduler;

/**
 *
 * @author edvin
 */

//adapted from week 3 lab
public interface PQInterface {
    
    public void enqueue(Patient patient);
    public Object dequeue();
    public int size();
    public boolean isEmpty();
    public String printPQueue();
    
}
