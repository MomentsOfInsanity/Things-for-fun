package p1;

import java.util.Scanner;

public class DndCharacterCreation
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		// Put your D&D chatbot here
		System.out.println("Hi, I'm the D&D character generation helper.");
		System.out.println("Please write a designated number for one of the following: lawful(1), neutral(2), chaotic(3).");
		int value = keyboard.nextInt(); // int stands for integer. There is various like String for a statement
	// or Double for a value that goes more than a whole integer for ex
		// int will only take whole numbers
		// while double will be 1.0 or 2.5 etc etc
		// double is a type of format for how to set numbers
		// Here i had set there variables to specific number values so the term "lawful" == the value of 1. 
		int lawful = 1;
		int neutral = 2;
		int chaotic = 3;
		int good = 4;
		int evil = 5;
		
		// Using these values i create a statements to continue on
		if(value == 1)
		{
			System.out.println("You picked " + value + " which is lawful");
			System.out.println("Now pick one of the following: good(4), neutral(2), evil(5).");
			int value2 = keyboard.nextInt();
			if(value2 == 4)
			{
				System.out.println("You picked " + value2 + " which is good");
				System.out.println("You are lawful good");
			}
			else if(value2 == 2)
			{
				System.out.println("You picked " + value2 + " which is neutral");
				System.out.println("You are lawful neutral");
			}
			else if(value2 == 5)
			{
				System.out.println("You picked " + value2 + " which is evil");
				System.out.println("You are lawful evil");
			}
			else
			{
				System.out.println("You did not pick the correct choice.");
			}
			
		}
		else if(value == 2)
		{
			System.out.println("You picked " + value + " which is neutral");
			System.out.println("Now pick one of the following: good(4), neutral(2), evil(5).");
			int value2 = keyboard.nextInt();
			if(value2 == 4)
			{
				System.out.println("You picked " + value2 + " which is good");
				System.out.println("You are neutral good");
			}
			else if(value2 == 2)
			{
				System.out.println("You picked " + value2 + " which is neutral");
				System.out.println("You are neutral neutral");
			}
			else if(value2 == 5)
			{
				System.out.println("You picked " + value2 + " which is evil");
				System.out.println("You are neutral evil");
			}
			else
			{
				System.out.println("You did not pick the correct choice.");
			}
		}
		else if(value == 3)
		{
			System.out.println("You picked " + value + " which is chatoic");
			System.out.println("Now pick one of the following: good(4), neutral(2), evil(5).");
			int value2 = keyboard.nextInt();
			if(value2 == 4)
			{
				System.out.println("You picked " + value2 + " which is good");
				System.out.println("You are chatoic good");
			}
			else if(value2 == 2)
			{
				System.out.println("You picked " + value2 + " which is neutral");
				System.out.println("You are chatoic neutral");
			}
			if(value2 == 5)
			{
				System.out.println("You picked " + value2 + " which is evil");
				System.out.println("You are chaotic evil");
			}
		}
		else
		{
			System.out.println("You did not pick the correct choice.");
		}

	}

}
