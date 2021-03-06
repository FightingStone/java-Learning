/*单击按钮触发ActionEvent事件，事件源是按钮，监听器类可以是本类，也可以是另外一个
 * 类，本例讨论前一种情况。按钮所在的EventDemo类须实现ActionListener接口，进而实现
 * actionPerformed()方法，在该方法中将窗口标题改为“点击了确定按钮”*/
package javaEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class EventDemo1 implements ActionListener {  //实现ActionListener接口.
	JFrame frame;
	JButton button;
	EventDemo1(String title) {
		frame = new JFrame(title);
		frame.setSize(500,200);
		frame.setLayout(new FlowLayout());
		button = new JButton("确定");
		frame.add(button);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);              //注册监听器对象.
	}
	public void actionPerformed(ActionEvent e) {  //实现接口中的方法.
		frame.setTitle("点击了确定按钮");         //事件处理代码.
	}
}
public class JavaActionEventEdition1 {           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDemo1 evd = new EventDemo1("动作事件");
	}
}
