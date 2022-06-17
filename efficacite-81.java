package eraser;

public class Eraser {
    public static String erase(String str) {
		String reponse = "";
		int cpt=0;
		String tmp="";
		int longueur = str.length();
		for(int i=0;i<longueur;i++){
			if(str.charAt(i)==' '){
				tmp+=" ";
				cpt++;
			}
			else {
				if(cpt>1) {
					reponse+=tmp;
				}
				tmp="";
				cpt=0;
				reponse+=str.charAt(i);
			}
		}
		if(cpt>1) {
			reponse+=tmp;
		}
		return reponse;
    }
}