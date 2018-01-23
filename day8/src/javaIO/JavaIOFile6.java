/*改用字符流实现，从文本文件中读取数据并显示在屏幕上.*/
package javaIO;
import java.io.*;
public class JavaIOFile6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("D:\\test\\data.txt");//创建文件对象.
			FileReader fileReader = new FileReader(file);  //创建流.
			char ch;
			for(int i = 0; fileReader.ready();i++) {
				ch = (char) (fileReader.read());    //从流中读取一个字符.
				System.out.print(ch);
			}
			fileReader.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("文件打开失败!!!");
		} catch (IOException ioe) {
			System.out.println("文件输入/输出异常!!!");
		} finally {
			System.out.println("\n哈哈哈，成功读取!!!");
		}
	}

}
