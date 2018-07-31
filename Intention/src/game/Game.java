package game;
import java.util.ArrayList;

import classes.Class;
import classes.Paladin;
import classes.Warrior;
import classes.Wizard;
import monsters.Monster;
import monsters.Orc;
import monsters.Rat;
import monsters.Skeleton;
import storyline.Story;

public class Game {
	public static void main(String[] args) {
		
		boolean runGame = true;
		//Class Array
		Class[] classArray = new Class[3];
		classArray[0] = Warrior.getWarrior();
		classArray[1] = Paladin.getPaladin();
		classArray[2] = Wizard.getWizard();
		
		
		Class[] currentTeam = new Class[3];
		//For Testing*****************************************
		currentTeam[0] = Warrior.getWarrior();
		currentTeam[1] = Paladin.getPaladin();
		currentTeam[2] = Wizard.getWizard();
		//****************************************************
		
		/*currentTeam = Story.chooseClasses(classArray);
		System.out.println("Your current party consists of");
		for(int i = 0; i < currentTeam.length; i++){
			System.out.println(currentTeam[i].getVocation());
		}*/
		
		//Monster Array
		/*ArrayList levelOneMonsters = new ArrayList();
		levelOneMonsters = Monster.getLevelOneMonsterArray();
		System.out.println("Level One Monster Array");
		System.out.println("################################################################################");
		for(int i = 0; i < levelOneMonsters.size(); i++){
			System.out.println(levelOneMonsters.get(i));
		}
		
		System.out.println(" ");
		
		ArrayList levelTwoMonsters = new ArrayList();
		levelTwoMonsters = Monster.getLevelTwoMonsterArray();
		System.out.println("Level Two Monster Array");
		System.out.println("################################################################################");
		for(int i = 0; i < levelTwoMonsters.size(); i++){
			System.out.println(levelTwoMonsters.get(i));
		}
		
		System.out.println(" ");
		
		ArrayList levelThreeMonsters =  new ArrayList();
		levelThreeMonsters = Monster.getLevelThreeMonsterArray();
		System.out.println("Level Three Monster Array");
		System.out.println("################################################################################");
		for(int i = 0; i < levelThreeMonsters.size(); i++){
			System.out.println(levelThreeMonsters.get(i));
		}*/
		while(true){
			Story.startStory(currentTeam, Monster.getMonsterArrayLists());
		}
	}//End Main Method
}//End Class Game
