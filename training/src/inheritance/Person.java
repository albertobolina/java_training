package inheritance;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	// construtor por omissão.
	public Person() {
		System.out.println("Estamos no construtor por omissão de Person"); }
	 	 
	
	public Person(String nome) {
		this.name = nome;
		System.out.println("Estamos no construtor parametro nome de Person");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
