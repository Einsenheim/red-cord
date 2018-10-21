package red_cord;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panneau extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int posX = -50;
	private int posY = -50;

	//******************************CREATION OF RED CIRCLE*******************************************************
	
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.gray);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.red);
		g.fillOval(posX, posY, 50, 50);
	}
	
	//******************************GETTER AND SETTER*******************************************************
	public int getPosX() {
		return posX;
	}
		
	public void setPosX(int posX) {
		this.posX = posX;
	}
		
	public int getPosY() {
		return posY;
	}
		
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	}

