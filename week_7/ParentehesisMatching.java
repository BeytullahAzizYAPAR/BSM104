import java.util.*;
public class ParentehesisMatching {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("kontrol edilecek de�eri giriniz");
		
		String exp=input.next();
		
		if(isMatching(exp)== true) 
			System.out.println("Do�rudur");
		
		else 
			System.out.println("Yanl��t�r");
	}
		public static boolean isMatching(String exp) {
			
			Stack<Character> s=new Stack<Character>();
			
			for(int i=0;i<exp.length();i++) 
				if(exp.charAt(i)=='(') 
				s.push(exp.charAt(i));
				
				else if(exp.charAt(i)==')')
					if(!s.isEmpty()) 
						s.pop();
	
			
			
			
			return (s.isEmpty());
		}
		
	}
	

 
	
