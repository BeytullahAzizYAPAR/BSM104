import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class Maps {

	public static void main(String[] args) {
		Map<Integer,String> citys=new TreeMap<Integer,String>();
		// <  key  , value>
		
		citys.put(34,"istanbul");
		citys.put(6,"Ankara");
		citys.put(35,"İzmir");
		citys.put(55,"Samsun");
		citys.put(54,"Sakarya");
		citys.put(74,"Bartın");
		
		System.out.println(citys);
		System.out.println("indeksler - keys "+citys.keySet());
		System.out.println(citys.values());
		System.out.println(citys.get(35));
		Map<Integer,Set<String>> city2=new HashMap<Integer,Set<String>>();
		
		city2.put(34,new TreeSet<String>());
		city2.get(34).add("İstanbul");
		city2.get(34).add("Besiktas");
		city2.get(34).add("Eminonu");
		city2.put(6,new TreeSet<String>());
		city2.get(6).add("Ankara");
		city2.get(6).add("Cankaya");
		System.out.println(city2);
	}

}
