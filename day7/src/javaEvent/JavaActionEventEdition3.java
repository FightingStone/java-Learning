/*�ڴ������С�ȷ�����͡�ȡ����������ť,������ȷ������ťʱ��
 * ���ڱ�������ʾ�������ȷ����ť��;������ȡ������ťʱ��
 * ���ڱ�������ʾ�������ȡ����ť��*/
package javaEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*����������Ǳ��࣬Ҳ����������һ���࣬����ʹ��ǰ�ߡ�������ť��ί�б������¼�����
 * ��Ӧ���¼�����������ͬһ��actionPerformed()�����У���˱���Ҫ�����¼�Դ����ͬ
 * �İ�ť��ִ�еĲ�����ͬ.*/
class EventDemo3 implements ActionListener {
	JFrame frame;
	JButton okButton,cancelButton;
	EventDemo3(String title) {
		frame = new JFrame(title);
		frame.setSize(500,300);
		frame.setLayout(new FlowLayout());
		okButton = new JButton("ȷ��");
		cancelButton = new JButton("ȡ��");
		frame.add(okButton);
		frame.add(cancelButton);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okButton.addActionListener(this); //ע�᱾�������Ϊ������.
		cancelButton.addActionListener(this); //ע�᱾�������Ϊ������.
	}
	public void actionPerformed(ActionEvent e) {  //�����κΰ�ť����ִ�и÷���.
		if(e.getSource() == okButton)        //�¼�Դ��ȷ����ť.
			frame.setTitle("�����ȷ����ť"); 
		else
			frame.setTitle("�����ȡ����ť");//�¼�Դ��ȡ����ť.
		/*
		if(e.getActionCommand().equals("ȷ��"))
			frame.setTitle("�����ȷ����ť");
		else
			frame.setTitle("�����ȡ����ť");
		*/
	}
}
public class JavaActionEventEdition3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDemo3 evd = new EventDemo3("�¼���Ӧ");
	}
}