import java.util.*;
public class StackStutter {

	public static void main(String[] args) {
		int data[]= {3,4,8,9,1};
		
		Stack<Integer> S=new Stack<Integer>();
		Stack<Integer> tempS=new Stack<Integer>();
		for(int n:data) {
			S.push(n);
		}
		System.out.println("Önceki Hali: "+S);
		stutter(S,tempS);
		
		System.out.println("Sonraki hali: "+S);
	}
	public static void stutter(Stack<Integer> S,Stack<Integer> tempS) {
		
		
		while(!S.isEmpty()) {
			
			int now=S.pop();
				tempS.push(now);
				tempS.push(now);
			}
		
		while(!tempS.isEmpty()) {
			int al=tempS.pop();
			S.push(al);
		}
		
		
		
	}
	

}
