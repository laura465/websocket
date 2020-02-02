package it.sisal.model;


public class Persona {
	
	  public Persona() {
		super();
	}
	@Override
	public String toString() {
		return " Persona [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Persona(String id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	private String id;
	  public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	private String name;
	  private Integer age;
}
