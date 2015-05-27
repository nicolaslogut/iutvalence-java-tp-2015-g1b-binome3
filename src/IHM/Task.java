package IHM;


import  javax.swing.*;
import  java.awt.*;
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

public class Task implements Runnable, ActionListener, KeyListener {

	/**
	 * The Frame
	 */
	private JFrame window;
	
	/**
	 * The Grid
	 */
	private PanelGridGame grid;
		
	public void initializeFrame(){
		//Initialize Frame
		this.window = new JFrame();

		this.window.setTitle("Turn Off Lights");
		this.window.setSize(600, 600);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		
        PanelGridGame grid = new PanelGridGame();
		this.window.setContentPane(grid);
        this.window.setVisible(true);
		//TODO lien controleur
				
		this.window.setVisible(true);
		
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

