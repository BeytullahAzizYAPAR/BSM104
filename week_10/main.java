
public class main {

	public static void main(String[] args) {
		LinkedIntList linkList=new LinkedIntList();
		linkList.add(5);
		linkList.add(7);
		linkList.add(9);
		linkList.add(15);
		
		System.out.println(linkList.toString());
		System.out.println(linkList.indexOf(0));
		System.out.println(linkList.indexOf(15));
		linkList.remove(0);//5 elamanýný sildik
		System.out.println(linkList.toString());
		linkList.add(0,5);//5 elamanýný ekledik
		System.out.println(linkList.toString());
		int count=linkList.size();
		System.out.println(count);
		
	}

}
