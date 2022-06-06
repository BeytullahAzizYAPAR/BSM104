public class Sorting {
	//Merge Sort************************************************************
	static void MergeSorting(int arr[], int left, int mid, int right) {
		//dizinin iki par�a b�y�kl�klerine bak�yoruz
        int part1=mid-left+1;
        int part2=right-mid;
        //ge�ici alt dizileri olu�turuyoruz 
        int arrLeft[]=new int[part1];
        int arrRight[]=new int[part2];
        //datam�z� ge�ici dizilere yerle�tiriyoruz 
        for (int i=0;i<part1;++i)
            arrLeft[i] =arr[left+i];
        for (int j=0;j<part2;++j)
            arrRight[j]=arr[mid+1+j];
        
        int i=0,j=0;
 
        int key=left;
        while (i<part1 && j<part2) {
            if (arrLeft[i]<=arrRight[j]) {
                arr[key]=arrLeft[i];
                i++;
            }
            else {
                arr[key]=arrRight[j];
                j++;
            }
            key++;
        }
        while (i<part1) {
            arr[key]=arrLeft[i];
            i++;
            key++;
        }
        while (j<part2) {
            arr[key]=arrRight[j];
            j++;
            key++;
        }
    }
    // Merge
    void sort(int arr[], int left, int right)
    {
        if (left<right) {
            int mid=left+(right-left)/2;
            
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            MergeSorting(arr,left, mid,right);
        }
    
	}
    //Insertion sort*************************************************
	static void InsertionSorting(int[]arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	//Selection sort*************************************************
	static void SelectionSorting(int[]arr) {
		int n=arr.length-1;
		//dizinin i�inde gezeriz
		for(int i=0;i<=n;i++) {
			//da��n�k dizi i�erisindeki en k���k eleman� buluruz
			int key=i;
			for(int j=1+i;j<n;j++) {
				//swap i�lemi
				if(arr[key]>arr[j]) {
					key=j;
					int temp=arr[key];
					arr[key]=arr[i];
					arr[i]=temp;
					
				}
			}
		}	
	}
	//Bubble Sort*******************************************************
	static void BubbleSorting(int[]arr) {
		int n=arr.length-1;
		//i� i�e forlar ile dizi i�inde gezeriz 
		for(int i=0;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if(arr[i]>arr[j]) {
					//swap i�lemi
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	//diziyi yazd�rmak i�in kullan�r�z
	static void printarr(int[] arr,String sortname) {
		int a=arr.length;
		for(int x=0;x<a;x++) {
			System.out.print(arr[x]+",");
		}
		System.out.println(" :"+sortname+" ile siralandi");

	}
	public static void main(String[] args) {
		int[] arr= {3,33,8,15,1,7,5,17,6,21,11,2,35,-2};
		
		//Bubble sortu i�in
		BubbleSorting(arr);
		printarr(arr,"bubble Sort");
		//Selection sortu i�in 
		SelectionSorting(arr);
		printarr(arr,"selection Sort");
		//Insertion sort i�in
		InsertionSorting(arr);
		printarr(arr,"Insertion Sort");
		//Merge sort i�in
		MergeSorting(arr,0,arr.length/2,arr.length-1);
		printarr(arr,"Merge Sort");
		
	}
}
