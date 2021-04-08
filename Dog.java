package day3.task1;

public class Dog {
	private String name;
	private int age;
	private int weight;
	private boolean status;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
		//System.out.println(this);
	}
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// Business method
	public void doFeedAnimal()
	{
		this.weight+=10;
	}
	
	
	public void playGames()
	{
		
		if(weight < 2 || weight > 30) {
			status = false;
		}
		else {
			this.weight-=1;
			status = true;
		}
	}
}
