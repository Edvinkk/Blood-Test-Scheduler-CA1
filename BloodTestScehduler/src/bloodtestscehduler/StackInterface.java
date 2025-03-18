package bloodtestscehduler;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author edvin
 */
public interface StackInterface {
    public void push(Patient patient);
    public Patient pop();
    public boolean isEmpty();
    public int size();
    public String toString();
}
