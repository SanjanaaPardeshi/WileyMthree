package org.animals;

public class Giraffe {

	private int weight,age;
    private String color;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isVegetarian()
	{
		return true;
	}
	public boolean canClimb()
	{
		return false;
	}
    public String sound()
    {
    	return "Bleat";
    }
}
