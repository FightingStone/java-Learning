package javaSwing;

import javax.swing.JFrame;

public class JavaJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("��һ��java����");//�������.
		frame.setSize(800, 1000);             //���ÿ�ܴ�С.
		frame.setResizable(false);           //���ò��ܸı��ܴ�С.
		frame.setLocationRelativeTo(null);   //��ܾ���.
		frame.setVisible(true);              //���ÿ�ܿɼ���.
		//�رտ��ʱ�������.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}