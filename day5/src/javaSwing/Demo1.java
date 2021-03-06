package javaSwing;
import java.awt.*;
import javax.swing.*;
class LoginGUI{
	//声明各个组件.
	JFrame frame;
	JLabel labelUserName, labelPassword;
	JTextField textFieldUserName;
	JPasswordField passwordField;
	JButton buttonLogin, buttonReset;
	LoginGUI(String title){                  //创建各个组件，然后组装成统一的界面.
		frame = new JFrame(title);           //创建框架.
		//设置框架的布局管理器.
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setSize(200, 200); 
		this.labelUserName = new JLabel("用户名");   //创建其他组件.
		labelPassword = new JLabel("密  码");
		textFieldUserName = new JTextField(10);
		passwordField = new JPasswordField(10);
		buttonLogin = new JButton("登录");
		buttonReset = new JButton("重置");
		frame.add(labelUserName);                 //将组件添加到框架中.
		frame.add(labelPassword);
		frame.add(textFieldUserName);
		frame.add(passwordField);
		frame.add(buttonLogin);
		frame.add(buttonReset);
		frame.setVisible(true);                   //设置框架的可见性.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}
public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginGUI("登录");
	}

}
