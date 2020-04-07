import java.util.Arrays;

public class BubbleSort{

	public void bubbleSort(int [] arr){
		for(int i = 0; i < arr.length; i++){   // modification2 in condition i < arr.length - 1;
			System.out.println("*******************************");  // used to analyse the sorting algo
			for(int j = 0; j < arr.length -1; j++){      // modification in condition j < arr.length - 1 - i;
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				System.out.println(Arrays.toString(arr));     // Used to serprate and to analyse the sorting algorithm
	 		}
	 		System.out.println("*******************************");  // to print array after each modification;
		}
	}
}