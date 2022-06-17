package Eraser;

public class Eraser_version_court {
	
	public static void Eraser_court(String mot_avec_espace) {

		String str = mot_avec_espace.replaceAll("   ", "~");
		str= str.replaceAll("  ", "~~");
		str = str.replaceAll(" ", "");
		str = str.replaceAll("~~", "  ");
		str = str.replaceAll("~", "   ");
		System.out.println(str);
		
	}
}
