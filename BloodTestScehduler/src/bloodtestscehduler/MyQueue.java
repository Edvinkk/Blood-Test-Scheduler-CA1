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
public class MyQueue implements QueueInterface {

    private ArrayList<Patient> queue;

    public MyQueue() {
        queue = new ArrayList<>();
    }

    @Override
    public void enqueue(Patient patient) {
        queue.add(patient); // Add to the end of the queue
    }

    @Override
    public Patient dequeue() {
        return queue.remove(0); // Remove from the front of the queue
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    //recursive method 
    public int countPatientsRecursive(int index) {
        if (index >= queue.size()) {
            return 0; // Base case: end of queue
        }
        return 1 + countPatientsRecursive(index + 1); // Recursive case
    }

    // Wrapper method for recursive counting
    public int countPatients() {
        return countPatientsRecursive(0);
    }
}
