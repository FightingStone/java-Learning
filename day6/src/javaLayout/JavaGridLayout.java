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
		//�����������е����񲼾ֹ�����.
		container.setLayout(new GridLayout(3,2));
		button1 = new JButton("��ť1");
		button2 = new JButton("��ť2");
		button3 = new JButton("��ť3");
		button4 = new JButton("��ť4");
		button5 = new JButton("��ť5");
		//�������.
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