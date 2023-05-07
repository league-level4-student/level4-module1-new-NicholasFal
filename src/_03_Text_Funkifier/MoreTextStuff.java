package _03_Text_Funkifier;

public class MoreTextStuff implements TextFunkifier {
    private String unfunkifiedText;

	public MoreTextStuff(String string) {
		// TODO Auto-generated constructor stub
		this.unfunkifiedText = string;
	}

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String newString = "";
		String text = unfunkifiedText;
		for(int i = 0; i < text.length(); i++) {
			newString+=text.substring(i, i+1).toUpperCase();
		}
		return newString;
	
		
	}

}
