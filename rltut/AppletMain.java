package rltut;

import java.applet.Applet;
import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import rltut.screens.Screen;
import rltut.screens.StartScreen;

public class AppletMain extends Applet implements KeyListener {
	private static final long serialVersionUID = -6765556773027208419L;
	
	private AsciiPanel terminal;
	private Screen screen;
	
	public AppletMain() {
		super();
		terminal = new AsciiPanel();
		add(terminal);
		screen = new StartScreen();
		addKeyListener(this);
		repaint();
	}
	
	public void init() {
		super.init();
		this.setSize(terminal.getWidth() + 20, terminal.getHeight() + 20);
	}

	public void repaint() {
		terminal.clear();
		screen.displayOutput(terminal);
		super.repaint();
	}

	public void keyPressed(KeyEvent e) {
		screen = screen.respondToUserInput(e);
		repaint();
	}

	public void keyReleased(KeyEvent e) { }

	public void keyTyped(KeyEvent e) { }
}
