package model;

import java.util.ArrayList;

public class Doctor extends User {
    //Atributo
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public Doctor(String name, String email){
        super(name,email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: CRuz Roja");
        System.out.println("Departamento: Cancerología");
    }


    public class AvailableAppointment {
        public AvailableAppointment(String date, String time) {
        }

        public int getDate() {
            return 0;
        }

        public boolean getTime() {
            return false;
        }
    }
}