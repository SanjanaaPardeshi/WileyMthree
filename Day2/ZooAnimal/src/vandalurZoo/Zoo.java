package vandalurZoo;

import org.animals.Deer;
import org.animals.Elephant;
import org.animals.Giraffe;
import org.animals.Lion;
import org.animals.Monkey;
import org.animals.Tiger;
public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer deer = new Deer();
		deer.setAge(10);
		deer.setColor("Brown");
		deer.setWeight(35);
		//System.out.println();
		System.out.println("DEER");
		System.out.println("Age: "+deer.getAge());
		System.out.println("Color: "+deer.getColor());
		System.out.println("Weight: "+deer.getWeight());
		if(deer.isVegetarian() == true)
			System.out.println("Vegetarian: "+"Yes");
		else
			System.out.println("vegetarian"+"No");
		if(deer.canClimb() == true)
			System.out.println("Can Climb: "+"Yes");
		else
			System.out.println("Can Climb: "+"No");
		System.out.println("Sound: "+deer.sound());
		System.out.println();
		
		
		Elephant elephant = new Elephant();
		elephant.setAge(45);
		elephant.setColor("Silver");
		elephant.setWeight(200);
		System.out.println("ELEPHANT");
		System.out.println("Age: "+elephant.getAge());
		System.out.println("Color: "+elephant.getColor());
		System.out.println("Weight: "+elephant.getWeight());
		if(elephant.isVegetarian() == true)
			System.out.println("Vegetarian: "+"Yes");
		else
			System.out.println("Vegetarian"+"No");
		if(elephant.canClimb() == true)
			System.out.println("Can Climb: "+"Yes");
		else
			System.out.println("Can Climb: "+"No");
		System.out.println("Sound: "+elephant.sound());
		System.out.println();
		
		Giraffe giraffe = new Giraffe();
		giraffe.setAge(30);
		giraffe.setColor("Yellow");
		giraffe.setWeight(75);
		System.out.println("GIRAFFE");
		System.out.println("Age: "+giraffe.getAge());
		System.out.println("Color: "+giraffe.getColor());
		System.out.println("Weight: "+giraffe.getWeight());
		if(giraffe.isVegetarian() == true)
			System.out.println("Vegetarian: "+"Yes");
		else
			System.out.println("Vegetarian"+"No");
		if(giraffe.canClimb() == true)
			System.out.println("Can Climb: "+"Yes");
		else
			System.out.println("Can Climb: "+"No");
		System.out.println("Sound: "+giraffe.sound());
		System.out.println();
		
		Lion lion = new Lion();
		lion.setAge(25);
		lion.setColor("Brown");
		lion.setWeight(75);
		System.out.println("LION");
		System.out.println("Age: "+lion.getAge());
		System.out.println("Color: "+lion.getColor());
		System.out.println("Weight: "+lion.getWeight());
		if(lion.isVegetarian() == true)
			System.out.println("Vegetarian: "+"Yes");
		else
			System.out.println("Vegetarian"+"No");
		if(lion.canClimb() == true)
			System.out.println("Can Climb: "+"Yes");
		else
			System.out.println("Can Climb: "+"No");
		System.out.println("Sound: "+lion.sound());
		System.out.println();
		
		Monkey monkey = new Monkey();
		monkey.setAge(13);
		monkey.setColor("Brown");
		monkey.setWeight(25);
		System.out.println("MONKEY");
		System.out.println("Age: "+monkey.getAge());
		System.out.println("Color: "+monkey.getColor());
		System.out.println("Weight: "+monkey.getWeight());
		if(monkey.isVegetarian() == true)
			System.out.println("Vegetarian: "+"Yes");
		else
			System.out.println("Vegetarian"+"No");
		if(monkey.canClimb() == true)
			System.out.println("Can Climb: "+"Yes");
		else
			System.out.println("Can Climb: "+"No");
		System.out.println("Sound: "+monkey.sound());
		System.out.println();
		
		
		Tiger tiger = new Tiger();
		tiger.setAge(15);
		tiger.setColor("Golden");
		tiger.setWeight(30);
		System.out.println("TIGER");
		System.out.println("Age: "+tiger.getAge());
		System.out.println("Color: "+tiger.getColor());
		System.out.println("Weight: "+tiger.getWeight());
		if(tiger.isVegetarian() == true)
			System.out.println("Vegetarian: "+"Yes");
		else
			System.out.println("Vegetarian"+"No");
		if(tiger.canClimb() == true)
			System.out.println("Can Climb: "+"Yes");
		else
			System.out.println("Can Climb: "+"No");
		System.out.println("Sound: "+tiger.sound());
	}

}
