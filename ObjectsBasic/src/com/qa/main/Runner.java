package com.qa.main;

import com.qa.Npc.NPC;
import com.qa.Npc.Character;
import com.qa.Npc.Player;
import com.qa.Npc.StoryNPC;

public class Runner {

	public static void main(String[] args) {
		
//		
//		NPC Commonfolk = new NPC("Joe", 2, "Commoner","Spoon","Common Clothes", true);
//		NPC MainSidekick = new NPC("Hiro", 9001, "Best Friend", "+5 GreatSword of Fireball", "Full Reflect Plate", true);		
//		
//		System.out.println(Commonfolk.getHP());
//		System.out.println(MainSidekick.getWeapon());
//		System.out.println(MainSidekick.getHP());
//		System.out.println(MainSidekick.getName());
		System.out.println("Player info");
		Player Drahan = new Player("Drahan","Dwarf", "Battleaxe", "Full Plate", true,8,"Articifer", true);
		Drahan.didYouSplit();
		Drahan.statusCheck();
		System.out.println(Drahan.getJobClass());
		
		System.out.println(" " );
		System.out.println("Story NPC");		
		StoryNPC KingThordan = new StoryNPC("King Thordan","Human", "Greatsword", "Half Plate",false, true,"King", 15);
		KingThordan.statusCheck();
		System.out.println(KingThordan.getRole());
		System.out.println("Changing Kings Data");
		KingThordan.setRole("King - Quest Giver");
		KingThordan.setLiving(true);
		System.out.println(KingThordan.getRole());
		KingThordan.statusCheck();
	}
}
