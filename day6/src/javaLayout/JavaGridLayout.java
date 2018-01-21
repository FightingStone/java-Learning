package javaLayout;
import java.awt.*;
import javax.swing.*;
class GridLayoutDemo {
	JFrame frame;
	JButton button1,button2,button3,button4,button5;
	GridLayoutDemo(String title) {
		frame = new JFrame(title);
		frame.setSize(260, 180);
		Container container = frame.getContentPane();
		//设置三行两列的网格布局管理器.
		container.setLayout(new GridLayout(3,2));
		button1 = new JButton("按钮1");
		button2 = new JButton("按钮2");
		button3 = new JButton("按钮3");
		button4 = new JButton("按钮4");
		button5 = new JButton("按钮5");
		//添加组件.
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class JavaGridLayout {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutDemo("GridLayout");
	}

}
