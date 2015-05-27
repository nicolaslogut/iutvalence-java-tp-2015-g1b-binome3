package IHM;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class PanelGridGame extends JPanel{
	
	
	
	public PanelGridGame(){
		//Initialize Grid
		this.setLayout(new GridLayout(5, 5));
		
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				this.add(new Button(i, j));
		
			}
		}
	}
	
	
}
