public class Search {

	public static void main(String[] args) {
		//dizileri tanımlıyoruz
		int[]numbers= {63,51,55,13,98,56,71,25,59,7,85};
		int[]numbers2= {13,14,15,16,17,18,19,29,30,31,32};
		String[]words= {"aa","ab","ac","ad","ba","bb","bc",
				"bd","ca","cb","cc","cd","da","db","dc","dd"};
		
		//int index=indexOf(numbers,29);
		//int index=indexOf2(numbers2,29);
		//int index=binarySearch(numbers2,29);
		//int index=binarySearchR(numbers2,30,0,numbers.length-1);
		int resultt=binarySearchString(words,"db");
		
		//String için resulltt int için index
		if(resultt!=-1)
			System.out.println("indeksi:"+resultt);
		else
			System.out.println("eleman bulunamadı");
	}
	
	public static int indexOf2(int []numbers,int target) {
		int i=0;
		while(i<numbers.length && numbers[i]<=target) {
				if(numbers[i]==target)
					return i;
				else
					i++;
		}
		
		return -1;
	}
	
	public static int indexOf(int[] numbers,int target) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] numbers,int target) {
		int left=0;
		int right=numbers.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(target<numbers[mid]) {//dizinin alt yarısında right değerini azaltırız
				right=mid-1;
			}
			else if(target>numbers[mid]) {//dizinin üst yarısındadır left değerini yükseltiriz
				left=mid+1;
			}
			else {
				return mid;
			}		
		}		
		return -1;
	}
	public static int binarySearchR(int[]numbers,int target,int min,int max) {
		if(min>max) {
			return -1;
		}
		else {
			int mid=min+max/2;
			if(numbers[mid]==target) {
				return mid;
			}
			else if(numbers[mid]<target) {
				return binarySearchR(numbers,target,mid+1,max);
			}
			else {
				return binarySearchR(numbers,target,min,mid-1);
			}
		}
		
	}
	
	public static int binarySearchString(String[] words,String word) {
		int left=0,right=words.length-1;
		while(left<right) {
			int mid=(left+right)/2;
			int result=word.compareTo(words[mid]);
			if(result==0) {
				return mid;
			}
			else if(result>0) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}			
		}
		return -1;
	}
}
