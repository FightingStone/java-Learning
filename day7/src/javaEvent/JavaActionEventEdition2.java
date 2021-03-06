/*实现JavaActionEventEdition1中的功能，要求另外定义一个类做监听器类*/
package javaEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*在两个类之间传参数：
 *     一种思路是在actionperformed()方法中增加一个EventDemo类型
 * 的形式参数，但在这里却行不通，因为actionPerformed()方法是要覆
 * 盖的方法，方法首部不能改变。
 *     另一种思路是在ButtonEvent类中声明一个EventDemo类的对象作
 * 为成员变量，然后定义带有EventDemo类型参数的构造方法，在构造方
 * 法中给这个变量赋值.*/
class EventDemo2 {
	JFrame frame;
	JButton button;
	EventDemo2(String title) {
		frame = new JFrame(title);
		frame.setSize(500, 200);
		frame.setLayout(new FlowLayout());
		button = new JButton("确定");
		frame.add(button);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new ButtonEvent(this));
	}
}
class ButtonEvent implements ActionListener {
	EventDemo2 evd;               //声明EventDemo类型的成员变量.
	//构造方法含有EventDemo参数.
	public ButtonEvent(EventDemo2 eventDemo2) {
		this.evd = eventDemo2;       //将EventDemo对象赋给成员变量evd.
	}
	public void actionPerformed(ActionEvent e) { //实现actionPerformed()方法.
		evd.frame.setTitle("点击了确定按钮");     //修改框架frame的标题.
	}
}
public class JavaActionEventEdition2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventDemo2 evd = new EventDemo2("动作事件");
	}

}
