package IHM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class PanelMenu extends JMenuBar implements ActionListener{
	
	/**
	 * The Frame associated to the Menu.
	 */
	private JFrame window;

	/**
	 * The item of the section "New Game"
	 */
	private JMenuItem MenuItemNewGame;

	/**
	 * The item of the section "Close"
	 */
	private JMenuItem MenuItemClose;
	
	/**
	 * The Menu bar creation
	 * 
	 * @param window
	 *            The Frame associated to the Menu
	 */
	public PanelMenu(JFrame window)
	{
		this.window = window;
		JMenu menu = new JMenu("Menu");
		this.MenuItemNewGame = new JMenuItem("New Game");
		this.MenuItemClose = new JMenuItem("Close");
		menu.add(this.MenuItemNewGame);
		menu.add(this.MenuItemClose);
		this.MenuItemNewGame.addActionListener(this);
		this.MenuItemClose.addActionListener(this);
		this.add(menu);
	}
	
	/**
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event)
	{
		JMenuItem itemSelected = (JMenuItem) event.getSource();

		if (itemSelected == this.MenuItemNewGame)
		{
			JOptionPane.showMessageDialog(this.window, "Game launched !", "New Game", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		if (itemSelected == this.MenuItemClose)
		{
			if (JOptionPane.showConfirmDialog(this.window, "Close the application ?", "Confirm", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
				this.window.dispose();
			return;
		}
	}

}
