public class SortingExample01 {
  	// method for sorting array
	public static int[] sortArray(int[] arr) {
    		// to store the small number from array
		int small = 0;
    		// iterating over array using for-loop
		for(int i=0 ; i<arr.length ; i++) 
		{
      			// initially taking first as small
			small = arr[i];
     			// declaring small index as 0
      			// if found the small number to take the array index
			int smallIndex = 0;
                       // iterating from next box to all the array
			for(int j=i+1 ; j<arr.length ; j++)
			{
				// if the current value is less than small
				if(arr[j]<small) 
				{
					// make small == current value
					small = arr[j];
					// take the index of small number 
					// to swap the number
					smallIndex = j;			
					// swapping process
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[smallIndex];
					arr[smallIndex] = temp;
				}
			}			
		}
		// returning the array
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {0,5,3,6,4,9,1,8,2};
		int ans[] = sortArray(arr);
		for(int i=0 ; i<ans.length ; i++) {
			System.out.print(ans[i]+"  ");
		}

		// output : 0 1 2 3 4 5 6 7 8 9
	}
}
