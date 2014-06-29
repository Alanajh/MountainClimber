import javax.swing.JFrame;

public class Window extends JFrame{

	public static int WIDTH = 768;
	public static int HEIGHT = 1024;
	public JFrame frame;
	
	public Window(){
		Main game = new Main();
		game.frame.setResizable(false);
		game.frame.setTitle("Mountain Climber");
		game.frame.add(game);
		game.frame.pack();
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.frame.setLocationRelativeTo(null);
		game.frame.setVisible(true);
		
		game.start();
		
	}
	public static void main(String[] args){
		new Window();
	}
}
