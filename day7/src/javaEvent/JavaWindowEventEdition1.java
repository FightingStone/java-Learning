/*在用户关闭窗口时退出程序*/
package javaEvent;
import javax.swing.*;
import java.awt.event.*;
class QuitWindow1 implements WindowListener {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowOpened(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
}
public class JavaWindowEventEdition1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame;
		frame = new JFrame();
		frame.setSize(300,200);
		frame.setVisible(true);
		frame.addWindowListener(new QuitWindow1()); //窗口注册事件.
	}

}
