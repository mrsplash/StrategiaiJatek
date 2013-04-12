import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import processing.core.*;
import game.*;


public class StrategiaiJatek {
	public StrategiaiJatek(){
		init();
	}
	private void init(){
		final JFrame frame = new JFrame("Strat�giai J�t�k ind�t�");
		frame.setSize(400, 320);
		frame.setDefaultLookAndFeelDecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		final JButton button = new JButton("IND�T�S!");
		frame.add(button);
		button.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		    	frame.remove(button);
		    	frame.repaint();
		    	jatsz(frame);
		    }
		});
	}
	private void jatsz(JFrame frame){
		frame.setLayout(new BorderLayout());
		frame.setSize(800,650);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("Strat�giai J�t�k");
		PApplet a = new Drawer(800,650);
		a.init();
		frame.add(a, BorderLayout.CENTER);
		frame.repaint();
	}

	public static void main (String[] args){
		StrategiaiJatek a = new StrategiaiJatek();
	}
}
