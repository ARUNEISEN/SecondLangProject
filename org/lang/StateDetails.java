package org.lang;
// child class
public class StateDetails extends LanguageInfo {
	public void southIndia() {
		System.out.println("southIndia");
	}
	public void northIndia() {
		System.out.println("northIndia");
	}
	public static void main(String[] args) {
		StateDetails sd=new StateDetails();
		sd.tamilLanguage();
		sd.englishLanguage();
		sd.hindiLanguage();
		sd.southIndia();
		sd.northIndia();
	}

}
