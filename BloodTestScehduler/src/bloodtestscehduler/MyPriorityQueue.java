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
    // Enqueue a new patient based on their priority
    @Override
    public void enqueue(Patient patient) {
        String priority = patient.getPriority();
        PQElement newElement = new PQElement(priority, patient);

        int iIndex = findInsertPosition(priority);

        if (iIndex == size()) {
            thePQueue.add(newElement);
        } else {
            thePQueue.add(iIndex, newElement);
        }
    }

    private int getPriorityValue(String priority) {
        switch (priority) {
            case "High":
                return 3; // Highest priority
            case "Medium":
                return 2; // Medium priority
            case "Low":
                return 1; // Lowest priority
            default:
                return 0; // Unknown priority
        }
    }

    // Find the position where the new element will be added to the list in descending order
    // based on the priority provided
    private int findInsertPosition(String newPriority) {
        boolean bFound = false;
        int iPosition = 0;
        PQElement curElement;

        int newPriorityValue = getPriorityValue(newPriority);

        while (iPosition < thePQueue.size() && !bFound) {
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
        for (PQElement element : thePQueue) {
            Patient patient = element.getPatient();
            String details = patient.toString();
            String priority = element.getPriority();
            message += details + " with the priority of " + priority + "\n";
        }
        return message;
    }
}
