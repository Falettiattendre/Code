package eraser;

public class Eraser {
    public static String erase(String str) {
        
    	String res = "";
    	int lastSegmentEnd = 0;
    	boolean wasSpace = false;
    	
    	int start = str.indexOf(' ');
    	if (start < 0) start = 0;
    	int end = str.lastIndexOf(' ');
    	
    	for (int i = start; i <= end; i++) {
    		
    		if (str.charAt(i) == 32) {
    			if (i == str.length()-1) {
    				if (!wasSpace) {
    					res += str.substring(lastSegmentEnd, i);
    					lastSegmentEnd = i+1;
    				}
    			} else {
    				if (!wasSpace && str.charAt(i+1) != 32) {
    					res += str.substring(lastSegmentEnd, i);
    					lastSegmentEnd = i+1;
    				}
    			}
    			wasSpace = true;
    		} else wasSpace = false;

    	}
    	
    	if (end < str.length()-1) {
    		res += str.substring(lastSegmentEnd, str.length());
    	}
    	
    	return res;
    }
}
