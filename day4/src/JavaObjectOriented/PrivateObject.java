package JavaObjectOriented;
class Person01 {
	private String name;
	private int age;
	private char sex = '��';
	void setName(String name){
		if(name == null || name.isEmpty()){
			System.out.println("�������Ϸ�");
			return;
		}
		this.name = name;
	}
	void setAge(int age){
		if(age < 0 || age > 100){
			System.out.println("���䲻�Ϸ�������������");
			return;
		}
		this.age = age;
	}
	void setSex(char sex){
		if(sex == '��' || sex == 'Ů'){
			this.sex = sex;
		}
		else
			System.out.println("�Ա𲻺Ϸ�������������");
	}
	String getInfo(){
		String info;
		info = "����Ϊ��" + this.name + "����Ϊ��"+ this.age + "�Ա�Ϊ��"+ this.sex;
		return info;
	}
}
public class PrivateObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person01 person1 = new Person01();
		Person01 person2 = new Person01();
		System.out.println("�޸�ǰ��");
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
		person1.setName("Tom");
		person1.setAge(18);
		person2.setName("Sally");
		person2.setSex('Ů');
		person2.setAge(21);
		System.out.println("�����޸ĺ�");
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
	}

}