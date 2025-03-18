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
public class MyPriorityQueue implements PQInterface {

    private final ArrayList<PQElement> thePQueue;

    public MyPriorityQueue() {
        thePQueue = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    @Override
    public int size() {
        return thePQueue.size();
    }

    //a new element with a given key and element information will be added 
    //Enqueue a new patient based on their priority
    @Override
    public void enqueue(Patient patient) {
        //Get the priority of the patient (e.g., "High", "Medium", "Low")
        String priority = patient.getPriority();
        
        //Create a new PQElement object to store the patient and their priority
        PQElement newElement = new PQElement(priority, patient);

        //Find the correct position to insert the new patient based on their priority
        int iIndex = findInsertPosition(priority);
        
        //If the position is at the end of the queue, add the patient to the end
        if (iIndex == size()) {
            thePQueue.add(newElement);
            
        //Otherwise, insert the patient at the correct position to maintain priority order   
        } else {
            thePQueue.add(iIndex, newElement);
        }
    }

    private int getPriorityValue(String priority) {
        switch (priority) {
            case "High":
                return 3; //Highest priority
            case "Medium":
                return 2; //Medium priority
            case "Low":
                return 1; //Lowest priority
            default:
                return 0; //Unknown priority
        }
    }

    //Find the position where the new element will be added to the list in descending order
    //based on the priority provided
    private int findInsertPosition(String newPriority) {
        boolean bFound = false;
        int iPosition = 0;
        PQElement curElement;

        int newPriorityValue = getPriorityValue(newPriority);
        
        //Loop through the queue to find the correct position for the new patient
        while (iPosition < thePQueue.size() && !bFound) {
            //Get the current element at the current position
            curElement = thePQueue.get(iPosition);
            
            int currentPriorityValue = getPriorityValue(curElement.getPriority());

            // Compare numerical priority values in descending order
            if (currentPriorityValue > newPriorityValue) {
                iPosition = iPosition + 1;
            } else {
                bFound = true;
            }
        }
        return iPosition;
    }

    //remove the first element on the list, which has the highest key (priority)
    @Override
    public Object dequeue() {
        return thePQueue.remove(0).getPatient();
    }

    @Override
    public String printPQueue() {
        String message = "Priority Queue:\n";
        //Loop through each element in the priority queue

        for (PQElement element : thePQueue) {
            Patient patient = element.getPatient();
            String details = patient.toString();
            String priority = element.getPriority();
            message += details + " with the priority of " + priority + "\n";
        }
        return message;
    }
}
