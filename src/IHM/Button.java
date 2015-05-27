package IHM;

import java.awt.Color;
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

public class Button extends JButton {
	
	private int xButton;
	
	private int yButton;
			
	public Button(int i, int j){
		this.xButton = i;
		this.yButton = j;
		JLabel label = new JLabel();
		String chainei = String.valueOf( i );
		String chainej = String.valueOf( j );
		label.setText(chainei + ", " + chainej);
		label.setVisible(true);
		
	}

}
