package _06_Hospital;

public class Patient {
	Boolean feelsCaredFor = false;
	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}
	public void checkPulse() {
		feelsCaredFor = true;
	}
}
