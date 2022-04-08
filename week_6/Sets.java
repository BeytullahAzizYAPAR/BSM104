import java.util.*;
public class Sets {

	public static void main(String[] args) {
		
		ArrayList<String> lists=new ArrayList<String>();
		lists.add("kalem");
		lists.add("masa");
		lists.add("bilgisayar");
		lists.add("defter");
		lists.add(3,"dolap");
		lists.add("kalem");
		lists.add("masa");
		lists.add("silgi");
		System.out.println("liste yazd�r"+lists);
		
		Set<String> sets=new HashSet<String>();
		sets.add("kalem");
		sets.add("masa");
		sets.add("bilgisayar");
		sets.add("defter");
		sets.add("kalem");
		sets.add("masa");
		
		System.out.println(sets);
		System.out.println(sets.size());//sets uzunlu�unu yazd�r�r
		System.out.println(sets.contains("dolap"));//set i�inde dolap var m� arar ve true/false d�nd�r�r
		
		sets.clear();//sets t�m elemanlar� sildik
		System.out.println(sets);//bo� sets yazd�r�r�z 
		sets.addAll(lists);//listeyi sete ekleriz setlerde ayn� elemanlar bir defa yaz�l�r
		
		System.out.println(sets);//liste eklenmi� seti yazar�z
		System.out.println(lists.get(2));//listedeki 2.indexli eleman� al�r�z
	}

}
