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
		System.out.println("liste yazdır"+lists);
		
		Set<String> sets=new HashSet<String>();
		sets.add("kalem");
		sets.add("masa");
		sets.add("bilgisayar");
		sets.add("defter");
		sets.add("kalem");
		sets.add("masa");
		
		System.out.println(sets);
		System.out.println(sets.size());//sets uzunluğunu yazdırır
		System.out.println(sets.contains("dolap"));//set içinde dolap var mı arar ve true/false döndürür
		
		sets.clear();//sets tüm elemanları sildik
		System.out.println(sets);//boş sets yazdırırız 
		sets.addAll(lists);//listeyi sete ekleriz setlerde aynı elemanlar bir defa yazılır
		
		System.out.println(sets);//liste eklenmiş seti yazarız
		System.out.println(lists.get(2));//listedeki 2.indexli elemanı alırız
	}

}
