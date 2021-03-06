/*在窗口中有“确定”和“取消”两个按钮,单击“确定”按钮时，
 * 窗口标题栏显示“点击了确定按钮”;单击“取消”按钮时，
 * 窗口标题栏显示“点击了取消按钮”*/
package javaEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*监听类可以是本类，也可以是另外一个类，这里使用前者。两个按钮都委托本类做事件处理
 * 对应的事件处理代码在同一个actionPerformed()方法中，因此必须要区分事件源，不同
 * 的按钮，执行的操作不同.*/
class EventDemo3 implements ActionListener {
	JFrame frame;
	JButton okButton,cancelButton;
	EventDemo3(String title) {
		frame = new JFrame(title);
		frame.setSize(500,300);
		frame.setLayout(new FlowLayout());
		okButton = new JButton("确定");
		cancelButton = new JButton("取消");
		frame.add(okButton);
		frame.add(cancelButton);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okButton.addActionListener(this); //注册本类对象作为监听器.
		cancelButton.addActionListener(this); //注册本类对象作为监听器.
	}
	public void actionPerformed(ActionEvent e) {  //单击任何按钮，都执行该方法.
		if(e.getSource() == okButton)        //事件源是确定按钮.
			frame.setTitle("点击了确定按钮"); 
		else
			frame.setTitle("点击了取消按钮");//事件源是取消按钮.
		/*
		if(e.getActionCommand().equals("确定"))
			frame.setTitle("点击了确定按钮");
		else
			frame.setTitle("点击了取消按钮");
		*/
	}
}
public class JavaActionEventEdition3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDemo3 evd = new EventDemo3("事件响应");
	}
}
