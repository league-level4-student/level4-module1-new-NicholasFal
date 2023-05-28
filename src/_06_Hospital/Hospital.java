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
	public void patientToDoctor() throws Exception {
		try {
		for(int i = 0; i < 3; i++) {
		doctors.get(i).assignPatient(unassignedPatients.get(i));
		unassignedPatients.remove(i);
		}
		} catch (DoctorFullException e){
			e.printStackTrace();
		}
	}
}
