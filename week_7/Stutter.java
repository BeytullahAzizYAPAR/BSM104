import java.util.*;
public class Stutter {

	public static void main(String[] args) {
		int data[]= {3,4,4,4,8,8,9,1};
		Queue<Integer> q=new LinkedList<Integer>();
		for(int a:data) {
			q.add(a);
		}
		System.out.println("önceki hali= "+q);
		stutter(q);
		System.out.println("son hali= "+q);
	}
	public static void stutter(Queue<Integer> q) {
		
		int size=q.size();
		
		while(size>0) {
			
			int now=q.remove();
			int next=q.peek();
			if(now!=next){
				q.add(now);
				q.add(now);
			}
				size--;
				
		}
		
	}

}
