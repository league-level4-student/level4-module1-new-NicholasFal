package _03_Text_Funkifier;

import java.util.Random;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String originalText = unfunkifiedText;
		String returnMe = "";
		
		for(int i = 0; i < originalText.length(); i++) {
			if(i % 2 == 1) {
				returnMe+=originalText.substring(i, i+1).toUpperCase();	
			} else {
				returnMe+=originalText.substring(i, i+1).toLowerCase();
			}
		}
		return returnMe;
	}

}
