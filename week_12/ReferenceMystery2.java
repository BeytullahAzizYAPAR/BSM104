import java.util.*;
public class ReferenceMystery2 {

	public static void main(String[] args) {
		int hp=10;
		Pokemon pikachu=new Pokemon(5);
		
		battle(pikachu,hp);
		System.out.println("Level:"+pikachu.level+","+hp+" hp");
		hp=hp+pikachu.level;
		battle(pikachu,hp+1);
		System.out.println("Level:"+pikachu.level+","+hp+" hp");		
	}
	public static void battle(Pokemon poke,int hp) {
		poke.level++;
		hp-=5;
		System.out.println("Level:"+poke.level+","+hp+" hp");
	}

}
