/*�����ַ���ʵ�֣����ı��ļ��ж�ȡ���ݲ���ʾ����Ļ��.*/
package javaIO;
import java.io.*;
public class JavaIOFile6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("D:\\test\\data.txt");//�����ļ�����.
			FileReader fileReader = new FileReader(file);  //������.
			char ch;
			for(int i = 0; fileReader.ready();i++) {
				ch = (char) (fileReader.read());    //�����ж�ȡһ���ַ�.
				System.out.print(ch);
			}
			fileReader.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("�ļ���ʧ��!!!");
		} catch (IOException ioe) {
			System.out.println("�ļ�����/����쳣!!!");
		} finally {
			System.out.println("\n���������ɹ���ȡ!!!");
		}
	}

}