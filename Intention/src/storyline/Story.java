package storyline;
import java.util.*;
import gamemaster.GameMaster;
import monsters.Monster;
import monsters.Orc;
import classes.Class;
import classes.Paladin;
import classes.Warrior;
import classes.Wizard;

import java.awt.*;

public class Story {
	//Class Variables
	static String name;
	static int input;
	
	//Class Objects
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	//Class Methods
	public static Class[] chooseClasses(Class[] arr){
		System.out.println("Welcome to Intention!  The game where you set your party up for greatness or certain death!");
		System.out.println("First enter your name!");
		name = scan.nextLine();
		System.out.println("Great, now choose 3 classes to take in your party.");
		for(int i = 0; i < arr.length; i++){
			System.out.println((i+1) + ". " + arr[i]);
		}
		Class[] team = new Class[3];
		String classChoice;
		int count = 0;
		while(count < 3){
			classChoice = scan.nextLine();
			if(classChoice.equals("1") || classChoice.equalsIgnoreCase("warrior")){
				System.out.println("You're taking a Warrior!");
				team[count] = Warrior.getWarrior();
				count++;
			}
			if(classChoice.equals("2") || classChoice.equalsIgnoreCase("paladin")){
				System.out.println("You're taking a Paladin!");
				team[count] = Paladin.getPaladin();
				count++;
			}
			if(classChoice.equals("3") || classChoice.equalsIgnoreCase("wizard")){
				System.out.println("You're taking a Wizard!");
				team[count] = Wizard.getWizard();
				count++;
			}			
		}//End choosingClass While loop
		return team;
	}// End method chooseClasses

	public static void startStory(Class[] currentTeam, ArrayList monsters){
		System.out.println("Your team has found a cave.");
		System.out.println("Do they enter?\n1.Yes\n2.No");
		String choice = scan.nextLine();
		if(choice.equals("1") || choice.equalsIgnoreCase("yes")){
			enterCave(currentTeam);
		}
		else {
			System.out.println("Your heros continue on their journey.");
		}
	}//End method StartStory
	public static void enterCave(Class[] currentTeam){
		ArrayList monsterArr = Monster.getMonsterArrayLists();
		String[] first = new String[3];
		String[] second = new String[3];
		first[0] = "Your heros enter what looks like an abandoned cave.";
		first[1] = "Your heros enter the dark cave, and they can hear faint sounds deep within the cave.";
		first[2] = "Your heros enter the cave, it seems as though someone or something is dwelling within.";
		//int instancePicked = rand.nextInt(3);
		int instancePicked = 0;
		System.out.println(first[instancePicked]);
		
		if(instancePicked == 0){
			System.out.print("The party ");
			//System.out.println("1.Look around.\n2.Go deeper into the cave.\n3.Fight a monster.\n4.Find treasure.\n5.Get scared and leave.");
			String[] option = new String[5];
			option[0] = "takes a look around.";
			option[1] = "ventures deeper into the cave.";
			option[2] = "encounters an enemy.";
			option[3] = "finds a treasure.";
			option[4] = "got scared and ran out of the cave.";
			//String choice = option[rand.nextInt(5)];
			String choice = option[2];
			if(choice.equals(option[0])){
				System.out.println(option[0]);
				
			}
			else if(choice.equals(option[1])){
				System.out.println(option[1]);
			}
			else if(choice.equals(option[2])){
				System.out.println(option[2]);
				System.out.println("Which enemy do they encounter? (Enter the number next to the name.)");
				int count = 0;
				ArrayList newList = new ArrayList();
				for(int i = 0; i < Monster.getMonsterArrayLists().size(); i++){
					ArrayList currentArray = (ArrayList) Monster.getMonsterArrayLists().get(i);
					System.out.println(" ");
					System.out.println("Difficulty Level: " + (i+1));
					for(int k = 0; k < currentArray.size(); k++){						
						newList.add(currentArray.get(k));
						count++;
						System.out.println(count + (". ") + ((Monster) newList.get(count-1)).getName());
					}					
				}
				input = scan.nextInt();
				Monster enemy = (Monster) newList.get(input-1);
				//System.out.println("Current Enemy: " + enemy.getName());
				
				Monster.battle(currentTeam, enemy);
			}//End else if Option[2]
			else if(choice.equals(option[3])){
				System.out.println(option[3]);
			}
			else if(choice.equals(option[4])){
				System.out.println(option[4]);
			}
		}//End if(instancePicked == 0)
	}//End method enterCave
}//End class Story

