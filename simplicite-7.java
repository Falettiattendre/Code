package eraser;

public class Eraser {
    public static String erase(String str) {
    	
    	if(str.length() == 0) {
    		return str;
    	}
    	
    	String result = "";
   
    	//si le début de la chaîne n'est pas un espace
    	if(str.charAt(0) != ' '){
    		result = result + str.charAt(0);
    	}
    	
    	//on part du deuxième caractère jusqu'à l'avant-dernier pour éviter
    	//les problèmes d'indices dans le test ci-dessous
    	for(int i=1; i<str.length()-1; i++) {

    		//on concatène si ce n'est pas un espace
    		if(str.charAt(i) != ' ' ) {		
    			result = result + str.charAt(i);
    		}
    		else {
    			
    			//si ce n'est pas un simple espace on concatène
    			if(str.charAt(i) == ' ' && (str.charAt(i-1) == ' ' || str.charAt(i+1) == ' '  )) {	
    				result = result + str.charAt(i);	
    			}
    		}
    	}
    	
    	//si la fin de la chaîne n'est pas un espace on concatène
    	if(str.charAt(str.length()-1) != ' '){
    		result = result + str.charAt(str.length()-1);
    	}
    	
        return result;
    }
}
