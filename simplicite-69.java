package eraser;

public class Eraser {
    public static String erase(String msg) {
        int taille = msg.length();
		char cAvant;
		char cApres;
		char c;
        String newMsg = "";
			for (int i = 0;i<taille;i++) { // On parcours caractère par caractère
				c = msg.charAt(i);
				if (taille == 1) { // cas particulier
					if (c != ' ') {
						newMsg += c;
					}
				} else {
					if (i == 0) { // Si c'est le premier caractère (cas particulier)
						cApres = msg.charAt(i+1);
						if(cApres == ' ') { // Si il est suivi par un espace
							System.out.print(c);
						} else { // Si il est pas suivi par un espace, 
							if (c != ' '){ // On vérifie si c'est un espace ou pas
                            newMsg += c;
							}
						}
					} else if (i == taille - 1){ // Si c'est le dernier caractère (cas particulier)
						cAvant = msg.charAt(i-1);
						if(cAvant == ' ') { // Si il y a un espace avant
							newMsg += c;
						} else { // Si il n'y a pas d'espace avant,
							if (c != ' '){ // On vérifie si c'est un espace ou pas
                            newMsg += c;
							}
						}
					} else { // Tout le reste du texte (execution générale)
						cApres = msg.charAt(i+1);
						cAvant = msg.charAt(i-1);
						if (c != ' ') {
							newMsg += c;
						} else {
							if ((cAvant == ' ') || (cApres == ' ')) { // Si il est entouré par au moins 1 espace a droite ou a gauche, ça veut dire qu'il est est pas seul
                            newMsg += " ";
							}
						}
					}
					
				}
			}
            return newMsg;
    }
}
