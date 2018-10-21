package red_cord;

import javax.swing.JFrame;

public class fenetre extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Panneau pan = new Panneau();
//******************************SHOWING WINDOWS*******************************************************
	
	public fenetre () {
		this.setTitle("Animatons");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(pan);
		this.setVisible(true);
		go();
		
	}
//******************************METHOD FOR MOVE ROUND*******************************************************
		
	private void go() {
		for (int i = -50; i< pan.getWidth(); i++) {
			int x = pan.getPosX(), y = pan.getPosY();
			x++;
			y++;
			pan.setPosX(x);
			pan.setPosY(y);
			pan.repaint();
			try {
				Thread.sleep(10);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}