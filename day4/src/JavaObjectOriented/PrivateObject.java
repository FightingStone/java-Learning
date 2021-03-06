package JavaObjectOriented;
class Person01 {
	private String name;
	private int age;
	private char sex = '男';
	void setName(String name){
		if(name == null || name.isEmpty()){
			System.out.println("姓名不合法");
			return;
		}
		this.name = name;
	}
	void setAge(int age){
		if(age < 0 || age > 100){
			System.out.println("年龄不合法，请重新设置");
			return;
		}
		this.age = age;
	}
	void setSex(char sex){
		if(sex == '男' || sex == '女'){
			this.sex = sex;
		}
		else
			System.out.println("性别不合法，请重新设置");
	}
	String getInfo(){
		String info;
		info = "姓名为：" + this.name + "年龄为："+ this.age + "性别为："+ this.sex;
		return info;
	}
}
public class PrivateObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person01 person1 = new Person01();
		Person01 person2 = new Person01();
		System.out.println("修改前：");
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
		person1.setName("Tom");
		person1.setAge(18);
		person2.setName("Sally");
		person2.setSex('女');
		person2.setAge(21);
		System.out.println("数据修改后：");
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
	}

}
