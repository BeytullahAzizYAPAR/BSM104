
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		FibonacciSeries fs=new FibonacciSeries();
		//List<List<Integer>>list=fs.fibonacci(5);
		fs.run(100);
		//System.out.println(list.toString());
	}
	private List<List<Integer>> fibonacci(int numRows){
		List<List<Integer>> fib=new ArrayList<List<Integer>>();
		
		List<Integer> temp=new ArrayList<Integer>();
		
		temp.add(1);
		fib.add(temp);
		fib.add(temp);
		for(int index=2;index<numRows;index++) {
			List<Integer> firstPrevious=fib.get(index-1);
			List<Integer> secondPrevious=fib.get(index-2);
			
			int first=secondPrevious.get(secondPrevious.size()-1);
			int second=firstPrevious.get(firstPrevious.size()-1);
			
			List<Integer> currentList=new ArrayList<Integer>();
			currentList.add(second);
			currentList.add(first+second);
			fib.add(currentList);
		}
		System.out.println(fib.toString());
		return fib;
	}
	private void run(int numRows) {
		long start=System.currentTimeMillis();
		fibonacci(numRows);
		long end=System.currentTimeMillis();
		
		long time=end-start;
		System.out.println("total time: "+time+"ms.");
	}
}
