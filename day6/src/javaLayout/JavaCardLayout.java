/*将框架的布局管理器设置为卡片布局管理器，创建一个面板、一个按钮、
 * 一个文本框放入其中，然后交替显示这三个组件.*/
package javaLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CardLayoutDemo extends MouseAdapter {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;
	Container contentPane;
	CardLayout cardLayout;               //声明卡片布局管理器对象.
	CardLayoutDemo() {
		frame = new JFrame("CardLayout");
		contentPane = frame.getContentPane();
		cardLayout = new CardLayout();           //创建卡片布局管理器对象.
		contentPane.setLayout(cardLayout);      //为frame设置卡片布局管理器.
		//创建每个组件.
		panel = new JPanel();
		JLabel labelPanel = new JLabel("这是一个面板");
		panel.add(labelPanel);
		label = new JLabel("这是一个标签");
		button = new JButton("这是一个按钮");
		//将组件添加到frame中，每个组件赋予一个名字.
		frame.add(panel,"panel");
		frame.add(label,"label");
		frame.add(button, "button");
		cardLayout.show(contentPane, "panel");  //显示面板.
		frame.setSize(240, 180);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//组件的事件注册.
		panel.addMouseListener(this);
		label.addMouseListener(this);
		button.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e) {       //事件处理.
		cardLayout.next(contentPane);
	}
}
public class JavaCardLayout {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CardLayoutDemo();
	}

}
