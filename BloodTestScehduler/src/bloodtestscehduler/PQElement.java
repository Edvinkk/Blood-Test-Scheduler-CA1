/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscehduler;

/**
 *
 * @author edvin
 */

//adapted from PQ Lab
public class PQElement {

    private String priority;
    private Patient patient;

    public PQElement(String priority, Patient patient) {
        this.priority = priority;
        this.patient = patient;
    }

    public String getPriority() {
        return priority;
    }

    public Patient getPatient() {
        return patient;
    }
}
