import java.util.Scanner;
import java.util.*;
public class PalindromeQueue {

	public static void main(String[] args) {
		System.out.println("lütfen bir string girin");
		Scanner in=new Scanner(System.in);
		String inputString=in.nextLine();
		
		Queue que=new LinkedList();
		
		for(int index=inputString.length()-1;index>=0;index--) {
			que.add(inputString.charAt(index));
		}
		String reverseString="";
		while(!que.isEmpty()) {
			reverseString=reverseString+que.remove();
		}
		if(inputString.equals(reverseString)) {
			System.out.println("Girilen kelime palindromdur");
		}
		else {
			System.out.println("Girilen kelime palindrom degildir");
		}	
	}
}
