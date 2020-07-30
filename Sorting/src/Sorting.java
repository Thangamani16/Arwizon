
public class Sorting {
	public static void main(String[] args) {
		int[] arr = {5,3,4,1,2};
		for (int i = 0,temp; i < arr.length; i++) {   
			for (int j = i+1; j < arr.length; j++) {   
				if(arr[i] > arr[j]) {  
					temp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = temp;  
				}   
			}   
		}
		System.out.println("Bubble sorted Elements ");  
		for (int k = 0; k < arr.length; k++) {   
			System.out.print(arr[k] );  
		}  
	}

}
