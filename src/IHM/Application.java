package IHM;

import javax.swing.SwingUtilities;

/**
 * Une application affichant des fenêtres exposant des composants simples
 * 
 * @author sebastienjean
 *
 */

public class Application {

	public static void main(String[] args) {
		
	// Exécution de la tâche de gestion de l'IHM dans le thread "event dispatch" de Swing
		SwingUtilities.invokeLater(new Task());
		System.out.println("fin du main !");
	}
}
