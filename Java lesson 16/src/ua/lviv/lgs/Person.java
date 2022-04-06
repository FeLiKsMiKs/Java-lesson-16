package ua.lviv.lgs;

import java.io.Serializable;
import java.util.Objects;

public class Person{
public String name;
public int age;
private int height;
private int weight;
private String lastName;
public Person() {
	
}
public Person(String name, int age, int height, int weight, String lastName) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
	this.lastName = lastName;
}
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
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
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public int hashCode() {
	return Objects.hash(age, height, lastName, name, weight);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	return age == other.age && height == other.height && Objects.equals(lastName, other.lastName)
			&& Objects.equals(name, other.name) && weight == other.weight;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", lastName="
			+ lastName + "]";
}



}
