/*������ť����ActionEvent�¼����¼�Դ�ǰ�ť��������������Ǳ��࣬Ҳ����������һ��
 * �࣬��������ǰһ���������ť���ڵ�EventDemo����ʵ��ActionListener�ӿڣ�����ʵ��
 * actionPerformed()�������ڸ÷����н����ڱ����Ϊ�������ȷ����ť��*/
package javaEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class EventDemo1 implements ActionListener {  //ʵ��ActionListener�ӿ�.
	JFrame frame;
	JButton button;
	EventDemo1(String title) {
		frame = new JFrame(title);
		frame.setSize(500,200);
		frame.setLayout(new FlowLayout());
		button = new JButton("ȷ��");
		frame.add(button);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);              //ע�����������.
	}
	public void actionPerformed(ActionEvent e) {  //ʵ�ֽӿ��еķ���.
		frame.setTitle("�����ȷ����ť");         //�¼���������.
	}
}
public class JavaActionEventEdition1 {           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDemo1 evd = new EventDemo1("�����¼�");
	}
}