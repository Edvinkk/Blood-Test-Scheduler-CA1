/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscehduler;

/**
 *
 * @author edvin
 */
public interface QueueInterface {
    public void enqueue(Patient patient);
    public Patient dequeue();
    public boolean isEmpty();
    public int size();
}
