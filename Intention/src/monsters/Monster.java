package monsters;
import java.util.*;

import classes.Class;

import java.awt.*;

public class Monster {
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	String name;
	int health, attackDamage, defense, dodge, difficulty;
	public Monster(String nam, int hp, int attkDmg, int def, int dodg, int diff){
		name = nam;
		health = hp;
		attackDamage = attkDmg;
		defense = def;
		dodge = dodg;
		difficulty = diff;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttackDamage() {
		return attackDamage;
	}
	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getDodge() {
		return dodge;
	}
	public void setDodge(int dodge) {
		this.dodge = dodge;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	public static ArrayList getLevelOneMonsterArray(){
		ArrayList levelOne = new ArrayList();
		levelOne.add(Rat.getRat());
		levelOne.add(Ravenborn.getRavenborn());
		levelOne.add(Owlbat.getOwlBat());
		levelOne.add(Bonepicker.getBonepicker());
		return levelOne;
	}//End Level One Monster Array
	
	public static ArrayList getLevelTwoMonsterArray(){
		ArrayList levelTwo = new ArrayList();
		levelTwo.add(Skeleton.getSkeleton());
		levelTwo.add(HulkingBrute.getHulkingBrute());
		levelTwo.add(StoneSlipper.getStoneSlipper());
		levelTwo.add(WaterGrazer.getWaterGrazer());
		return levelTwo;
	}//End Level Two Monster Array
	
	public static ArrayList getLevelThreeMonsterArray(){
		ArrayList levelThree = new ArrayList();
		levelThree.add(Orc.getOrc());
		levelThree.add(GreenMother.getGreenMother());
		levelThree.add(RatDragon.getRatDragon());
		levelThree.add(EternalRest.getEternalRest());
		return levelThree;
	}//End Level Three Monster Array
	
	public static ArrayList getMonsterArrayLists(){
		ArrayList monsterArrayLists = new ArrayList();
		monsterArrayLists.add(getLevelOneMonsterArray());
		monsterArrayLists.add(getLevelTwoMonsterArray());
		monsterArrayLists.add(getLevelThreeMonsterArray());
		return monsterArrayLists;
	}

	public static void battle(Class[] currentTeam, Monster enemy){
		Class[] party = currentTeam;
		boolean fighting = true;
		while(fighting){
			Class currentFighter = party[rand.nextInt(3)];
			System.out.println("The " + currentFighter.getVocation());
			//System.out.println(currentFighter);
		}//End fighting loop
	}
}//End Class Monster
