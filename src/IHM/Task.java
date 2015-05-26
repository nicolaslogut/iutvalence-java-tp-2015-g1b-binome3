package IHM;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Task implements Runnable, ActionListener, KeyListener {

	/**
	 * The Frame
	 */
	private JFrame window;
	
	/**
	 * The Grid
	 */
	private PanelGridGame Grid;
	
	public void initializeFrame(){
		//Initialize Frame
		this.window = new JFrame();

		this.window.setTitle("Turn Off Lights");
		this.window.setSize(600, 600);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		//Initialize Grid
		this.window.setLayout(new GridLayout(5, 5));
		
		//Add buttons into grid
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				this.window.getContentPane().add(new Button(i, j));
		//TODO lien controleur
				
		this.window.setVisible(true);
		
		//Add label on buttons
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		this.initializeFrame();
	}	
}

