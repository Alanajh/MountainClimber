import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Main extends Canvas implements Runnable{
	private static final long serialVersionUID = 1L;

	private BufferStrategy bs;
	
	private Thread thread;
	private boolean running = false;
	public static JFrame frame;
	
	public Main() {
		Dimension size = new Dimension(WIDTH, HEIGHT);
		setPreferredSize(size);
		frame = new JFrame();
	}
	public synchronized void start(){
		running = true;
		thread = new Thread(this, "Display");
		thread.start();
	}
	public synchronized void stop(){
		running = false;
		try{
			thread.join();
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	public void run(){
		while(running){
			update();
			render();
		}

	}
	public void update(){
		
	}
	public void render(){
		BufferStrategy bs = getBufferStrategy();
		if(bs == null)
			createBufferStrategy(3);
		return;
		
	}
	Graphics g = bs.getDrawGraphics();{
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.dispose();
		bs.show();
	}
}
