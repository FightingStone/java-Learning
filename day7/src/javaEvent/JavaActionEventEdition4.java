/*ʵ����ͬ�Ĺ���*/
package javaEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class EventDemo4 {
	JFrame frame;
	JButton okButton,cancelButton;
	EventDemo4(String title) {
		frame = new JFrame(title);
		frame.setSize(800,600);
		frame.setLayout(new FlowLayout());
		okButton = new JButton("ȷ��");
		cancelButton = new JButton("ȡ��");
		frame.add(okButton);
		frame.add(cancelButton);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonEvent buttonEvent = new ButtonEvent();    //�����ڲ������.
		okButton.addActionListener(buttonEvent);        //�ڲ������ע��Ϊ������.
		cancelButton.addActionListener(buttonEvent);    //�ڲ������ע��Ϊ������.
	}
	class ButtonEvent implements ActionListener {   //�ڲ�������������.
		public void actionPerformed(ActionEvent e) { 
			if (e.getSource() == okButton)            //�¼�Դ�ǡ�ȷ������ť.
				frame.setTitle("�����ȷ����ť");      //ֱ�ӷ���frame.
			else                                      //�¼�Դ�ǡ�ȡ������ť.
				frame.setTitle("�����ȡ����ť");      //ֱ�ӷ���frame.
		}
	}
}
public class JavaActionEventEdition4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDemo4 evd = new EventDemo4("�¼���Ӧ");
	}
}