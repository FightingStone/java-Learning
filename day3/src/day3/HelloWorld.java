package day3;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");
		int a = 5;
		System.out.println(a);
		//������������ʼ���Լ�����.
		int b[] = {1,2,3,4,5};
		for(int i = 0;i < 5;i++)
		{
			System.out.println(b[i]);
		}
		for(int i : b)
			System.out.print(i);
		//�ַ�����String�ࡢSringBuffer�ࣩ.
		System.out.print("\n");
		String s1 = "Java";
		String s2 = new String("Java");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		StringBuffer s = new StringBuffer("abcd");
		System.out.println(s);
		StringBuffer s3 = s.insert(4, "5");
		System.out.println(s);
		System.out.println(s3);
	}

}