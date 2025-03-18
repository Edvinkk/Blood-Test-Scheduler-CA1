/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscehduler;

import java.util.ArrayList;

/**
 *
 * @author edvin
 */
public class MyStack implements StackInterface {

    private ArrayList<Patient> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(Patient patient) {
        stack.add(patient); // Add to the end of the list (top of the stack)
    }

    @Override
    public Patient pop() {
        return stack.remove(stack.size() - 1); // Remove from the end of the list (top of the stack)
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        String result = "Stack (Top to Bottom):\n";
        for (int i = stack.size() - 1; i >= 0; i--) {
            result += stack.get(i).toString() + "\n"; // Concatenate strings
        }
        return result;
    }
}
