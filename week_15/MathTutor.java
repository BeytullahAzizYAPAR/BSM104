import java.util.*;
import java.util.function.IntBinaryOperator;
//Give Problem sorusu
public class MathTutor {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//giveProblems(input,3,"+",(x,y)->x+y);
		giveProblems(input,3,"*",(x,y)->x*y);
	}
public static void giveProblems(Scanner console,int numProblems,String text,IntBinaryOperator operator) {
	Random rand=new Random();
	int numRight=0;
	for(int i=0;i<numProblems;i++) {
		int x=rand.nextInt(20);
		int y=rand.nextInt(20);
		System.out.println(x+" "+text+" "+y+" = ");
		int answer=operator.applyAsInt(x,y);
		int response=console.nextInt();
		if(response==answer) {
			System.out.println(" True ");
			numRight++;
		}
		else {
			System.out.println(" False "+answer);
		}
	}
	System.out.println(numProblems+" Cevaptan dogru sayýs: "+numRight);
	
    }
}
