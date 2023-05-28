package _06_Hospital;

import java.awt.List;
import java.util.ArrayList;

public abstract class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void doMedicine() {
		
	}
	public void assignPatient(Patient patient) {
		patients.add(patient);
	}
	public ArrayList<Patient> getPatients() {
		return patients;
		
	}
}
