package javaIO;
import java.io.*;
public class JavaIOFile1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("D:\\test");     //创建一个File对象，代表一个目录.
		System.out.println("目录下的文件和子目录有：");
		String[] fileName = folder.list();    //获得目录下所有的文件和子目录名称.
		for (int i = 0;i < fileName.length;i++) {
			System.out.println(fileName[i]);
		}
		//创建File对象，代表一个文件.
		File file = new File(folder, "data.txt");
		//如果文件不存在，则创建该文件.
		if(!file.exists()) {
			try {
				System.out.println("文件不存在，正在创建文件......");
				file.createNewFile();
				System.out.println("文件创建成功!!!");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		//获得文件绝对路径.
		System.out.println("文件的绝对路径：" + file.getAbsolutePath());
		//获得文件名.
		System.out.println("文件名：" + file.getName()); 
		//判断是否是文件.
		System.out.println("是文件吗？" + file.isFile());
		//获得文件长度.
		System.out.println("文件的长度：" + file.length());
	}
}
