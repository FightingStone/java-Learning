package javaIO;
import java.io.*;
public class JavaIOFile1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("D:\\test");     //����һ��File���󣬴���һ��Ŀ¼.
		System.out.println("Ŀ¼�µ��ļ�����Ŀ¼�У�");
		String[] fileName = folder.list();    //���Ŀ¼�����е��ļ�����Ŀ¼����.
		for (int i = 0;i < fileName.length;i++) {
			System.out.println(fileName[i]);
		}
		//����File���󣬴���һ���ļ�.
		File file = new File(folder, "data.txt");
		//����ļ������ڣ��򴴽����ļ�.
		if(!file.exists()) {
			try {
				System.out.println("�ļ������ڣ����ڴ����ļ�......");
				file.createNewFile();
				System.out.println("�ļ������ɹ�!!!");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		//����ļ�����·��.
		System.out.println("�ļ��ľ���·����" + file.getAbsolutePath());
		//����ļ���.
		System.out.println("�ļ�����" + file.getName()); 
		//�ж��Ƿ����ļ�.
		System.out.println("���ļ���" + file.isFile());
		//����ļ�����.
		System.out.println("�ļ��ĳ��ȣ�" + file.length());
	}
}