/*使用内部类和匿名类进行事件处理*/
package javaEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class EventDemo5 {
	JFrame frame;
	JButton okButton, cancelButton;
	EventDemo5(String title) {
		frame = new JFrame(title);
		frame.setSize(600,400);
		frame.setLayout(new FlowLayout());
		okButton = new JButton("确定");
		cancelButton = new JButton("取消");
		frame.add(okButton);
		frame.add(cancelButton);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//创建匿名类进行“确定”按钮的事件处理
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setTitle("点击了确定按钮");
			}
		});
		//创建匿名类进行“取消”按钮的事件处理
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setTitle("点击了取消按钮");
			}
		});
	}
}
public class JavaActionEventEdition5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDemo5 evd = new EventDemo5("事件响应");
	}
}
