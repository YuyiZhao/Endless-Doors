import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class GameOver extends GameGui {
	
	public GameOver(int x, int y, double w, double h) {
		super(x, y, w, h, true, "GameOverBckgrnd.jpg");
		locX = x;
		locY = y;
		WIDTH = w;
		HEIGHT = h;
	}

	public void draw(Graphics g) {
		g.setColor(new Color(255, 0, 0));
		super.draw(g);;

		g.setColor(new Color(255, 255, 255));
		g.setFont(new Font("Times New Roman", 0, 101));
		g.drawString("Game Over!", StartGame.SCREEN_WIDTH * 11 / 40, StartGame.SCREEN_HEIGHT * 4 / 10);
		g.setFont(new Font("Times New Roman", 0, 50));
		g.drawString("Press B to return to start.", StartGame.SCREEN_WIDTH * 11 / 40, StartGame.SCREEN_HEIGHT * 6 / 10);
	}
}
