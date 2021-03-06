/*从文本文件中读取数据并显示在屏幕上.*/
package javaIO;
import java.io.*;
public class JavaIOFile2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("D:\\test\\data.txt");   //创建文件对象.
			//使用文件对象创建文件输入流对象，相当于打开文件.
			FileInputStream fileInputStream = new FileInputStream(file);
			char ch;
			for (int i = 0;i < file.length();i++) {  //使用循环读取全部数据.
				ch = (char) (fileInputStream.read()); //从流中读取一个字节.
				System.out.print(ch);
			}
			fileInputStream.close();          //关闭流.
		}
		catch (FileNotFoundException fnfe) {     //捕获文件无法找到异常.
			System.out.println("文件打开失败。");
		}
		catch (IOException ioe) {                //捕获输入/输出异常.
			System.out.println("文件输入异常。");
		}
	}
}
