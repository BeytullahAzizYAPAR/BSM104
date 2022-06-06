import java.util.Scanner;
import java.util.stream.IntStream;
public class SumPrimes {
	
	public static void main(String[]args) {
		Scanner console=new Scanner(System.in);
		System.out.println("Ka�tane asal say� toplamak istiyorsunuz");
		int count=console.nextInt();
		int sum=sumPrimes(count);
		System.out.println("sum ="+sum);
	}
	public static int sumPrimes(int count) {
		if(count <=0) {
			return 0;
		}
		else {
			long start=System.currentTimeMillis();
			int sum=IntStream
					.iterate(1, n -> n+2)/*sayac� 2 yaparsak arama havuzu yar�ya d��er 
					NOT tek �ift asal say� 2 yi sonradan eklememiz gerekiyor*/
					.filter(SumPrimes::isPrime2)
					.limit(count-1)//2 yi biz ekledi�imiz i�in bir azaltamal�y�z
					.sum()+2;//2 yi toplama ekleriz 
			double elapsed=System.currentTimeMillis()-start;
			System.out.println("time="+elapsed/1000+"ms");
			return sum;
		}
	}
	public static boolean isPrime(int n) {
		return IntStream
				.range(1, n+1)
				.filter(x -> n%x == 0)
				.count()==2;
	}
	public static boolean isPrime2(int n) {
		if(n==1)
			return false;
		else {
			int root=(int)Math.sqrt(n);
			return IntStream
					.range(1, root+1)
					.filter(x -> n%x==0)
					.count()==1;
			
		}
	}

}
