package day3.task1;

public class DogApp {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("Jully");
		d1.setAge(8);
		d1.setWeight(10);
		d1.doFeedAnimal();
		d1.playGames();
		
		Dog d2 = new Dog();
		d2.setName("Scoopy");
		d2.setAge(12);
		d2.setWeight(22);
		d2.doFeedAnimal();
		d2.playGames();
		
		if(d1.isStatus()) {
			System.out.println(d1.getName()+" of age "+d1.getAge()+" can play games because it's weight is "+d1.getWeight());
		}
		else {
			System.out.println(d1.getName()+" of age "+d1.getAge()+" cannot play games because it's weight is "+d1.getWeight());
		}
		if(d2.isStatus()) {
			System.out.println(d2.getName()+" of age "+d2.getAge()+" can play games because it's weight is "+d2.getWeight());
		}
		else {
			System.out.println(d2.getName()+" of age "+d2.getAge()+" cannot play games because it's weight is "+d2.getWeight());
		}
		
	}

}
