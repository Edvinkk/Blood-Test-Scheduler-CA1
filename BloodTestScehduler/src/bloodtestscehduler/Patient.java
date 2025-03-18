/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscehduler;

/**
 *
 * @author edvin
 */
public class Patient {

    private String name;
    private int age;
    private String priority;
    private String gpDetails;
    private boolean fromHospitalWard;

    public Patient(String name, int age, String priority, String gpDetails, boolean fromHospitalWard) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.fromHospitalWard = fromHospitalWard;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPriority() {
        return priority;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public boolean isFromHospitalWard() {
        return fromHospitalWard;
    }
    
    public String toString(){
        return "Patient: " + name + " Age: " + age + " Priority: " + priority + " GP: " + gpDetails + " From Hospital: " + fromHospitalWard;
    }
}
