package p1;

public class Demo 
{

	public static void main(String[] args)
	{
		
		Person a = new Person("Glenn");
		Person b = new Person("Phill");
		Person c = new Person("Glenn");
		System.out.println(a.equals(c));
		System.out.println("Person " + a + " and Person " + c + " are equal.");
		System.out.println("");
		System.out.println(a.equals(b));
		System.out.println("Person " + a + " and Person " + b + " are not equal.");
		System.out.println("");
		
		Vehicle jeep = new Vehicle("Jeep", 6, a);
		Vehicle ram = new Vehicle("Ram", 8, b);
		Vehicle jeep2 = new Vehicle("Jeep", 6, c);
		System.out.println(jeep.equals(jeep2));
		System.out.println(jeep + "\n and " + jeep2 + " are equal.");
		
		System.out.println("");
		System.out.println(jeep.equals(ram));
		System.out.println(jeep + "\n and" + ram + " are not equal.");
		System.out.println("");
		
		Truck jeepGC = new Truck(a, "Jeep", 6, 2.3, 1000);
		System.out.println(jeepGC.toString());
		System.out.println("");
		Truck ramC = new Truck(b, "Ram", 8, 3.5, 1500);
		System.out.println(ramC.toString());
		System.out.println("");
		Truck ford = new Truck(c, "Jeep", 6, 2.3, 1000);
		System.out.println(ford.toString());
		System.out.println("");
		
		System.out.println(jeepGC.equals(ford));
		System.out.println(jeepGC + "\n and " + ford + " are equal.");
		System.out.println("");
		System.out.println(jeepGC.equals(ramC));
		System.out.println(jeepGC + "\n and" + ram + " are not equal.");
		
		
		

	}

}
