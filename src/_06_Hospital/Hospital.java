package _06_Hospital;

import java.awt.List;
import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> unassignedPatients = new ArrayList<Patient>();
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	public void addPatient(Patient patient) {
		unassignedPatients.add(patient);
	}
	public void assignPatientsToDoctors() throws Exception {
		boolean overThree = false;
		int index = 0;
		for(int i = 0; i < doctors.size(); i++) {
			if(overThree == true) {
				i--;
				overThree = false;
			}
			try {
				doctors.get(i).assignPatient(unassignedPatients.get(index));
			} catch (DoctorFullException dfe) {
				overThree = false;
			}
			index++;
			overThree = true;
		}
	}
	public ArrayList getDoctors() {
		return doctors;
		
	}
	public ArrayList getPatients() {
		return unassignedPatients;
	}
}
