import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		
		String data[]= {"java","php","python","C","c++"};
		
		Queue<String> q=new LinkedList<String>();
		
		for(String word:data) {
			q.add(word);
			
		}
		System.out.println("size="+q.size());
		System.out.println("Queue="+q);
		System.out.println("peek : "+q.peek());
		System.out.println("remove>"+q.remove());
		System.out.println("peek : "+q.peek());
		System.out.println("size="+q.size());

	}

}
