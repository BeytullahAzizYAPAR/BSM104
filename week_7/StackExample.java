import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		String data[]= {"java","php","python","C","c++"};
		
		Stack<String> s=new Stack<String>();
		for(String word:data) {
			s.push(word);
			
		}
		System.out.println(s.size());
		System.out.println("Ste�imiz ="+s);
		System.out.println("POP>"+s.pop());
		System.out.println("peek>"+s.peek());
		System.out.println(s);
		System.out.println("ste�imiz="+s);
		System.out.println(s.size());
		
		System.out.println("--------------------");
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
			System.out.println("Stack ="+s);
		}
		
	}

}
