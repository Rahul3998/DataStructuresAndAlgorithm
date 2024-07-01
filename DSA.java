import java.util.Scanner;

public class Example01 
{
	public static int[] array;                                           // declaring the array for storing the data
	public static Scanner sc = new Scanner(System.in);                   // created scanner object 
	
	
	public static int[] addData(int[] arr, int num, int pos)             // methdod for adding data at particular position
	{
		int[] temp = new int[arr.length + 1];
		int count = 0;

		for (int i = 0; i < pos; i++) 
		{
			temp[i] = arr[i];
		}

		temp[pos] = num;

		for (int i = pos + 1; i < temp.length; i++) 
		{
			temp[i] = arr[pos + count];
			count++;
		}
		
		return temp;
	}
	
	
	public static int[] add(int[] arr, int num)                          // method for adding data at last index
	{
		int[] temp = new int[arr.length+1];
		
		for(int i=0 ; i<arr.length; i++) 
		{
			temp[i] = arr[i];
		}
		
		temp[arr.length] = num;
		
		return temp;
	}
	
	
	public static int[] replaceData(int[] arr, int num, int pos)        // method for replacing data at particular position
	{
		int temp[] = arr.clone();
		for(int i=0 ; i<arr.length ; i++) 
		{
			
			if(i==(pos-1)) 
			{
				temp[i] = num;
			}
			
		}
		
		return temp;
	}
	
	
	public static int[] removeAll(int[] arr)                         // method to remove all the data from the array
	{
		int[] temp = new int[0];
		array = temp;
		return temp;
	}
	
	
	public static int[] remove(int[] arr, int num)                   // method to remove number from string
	{
		int count = 0;
		for(int i=0 ; i<arr.length ; i++) 
		{
			if(arr[i] == num ) 
			{
				count++;
			}
		}
		
		int[] temp = new int[arr.length-count];
		int temVal = 0;
		
		for(int i=0 ; i<arr.length ; i++) 
		{
			
			if(arr[i] == num) 
			{
				continue;
			}
			
			else 
			{
				temp[temVal] = arr[i];
				temVal++;
			}
		}
		
		return temp;
	}

  
	public static int[] scan(int n)                                      // method for taking input for array
	{
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) 
		{
			System.out.print("\nIndex("+(i+1)+") = ");
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr)                             // method for printing array
	{
		System.out.println("==================================");
		System.out.print("    Final Array = [ ");
		for(int val : arr) 
		{
			System.out.print(val+" ");
		}		
		System.out.println("]");
		System.out.println("==================================");
		array = arr;
	}

  
	public static boolean switchLoop(int choice)                        // Switch loop method
	{
		boolean flag = true;
		
		switch (choice) 
		{
		
		case 1:
			int n1 = number();
			printArray(add(array, n1));
			break;
			
		case 2:
			int n2 = number();
			int p1 = position();
			printArray(addData(array, n2, p1));
			break;

		case 3: 
			int n3 = number();
			int p2 = position();
			printArray(replaceData(array, n3, p2));
			break;
			
		case 4:
			int n4 = number();
			printArray(remove(array, n4));
			break;
			
		case 5:
			printArray(removeAll(array));
			break;
		
		case 6:
			flag = false;
			break;
			
		default:
			System.out.println("Invalid Input");
			break;
		}
		
		return flag;
	}

  
	public static int number()                                        // input number method
	{
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		return n;
	}
	
	public static int position()                                      // position input method
	{
		System.out.print("Enter the array position : ");
		int p = sc.nextInt();
		return p;
	}

  
	public static void main(String[] args) 
	{
		
		System.out.print("Enter the length of array : ");
		int l = sc.nextInt();
		
		int[] arr = scan(l);
		array = arr;
		
		printArray(array);
		boolean flag = true;
		
		while(flag) {
			System.out.println("\n1. Add\n2. Add at place\n3. Replace\n4. Remove\n5. Remove All\n6. Exit");
			System.out.print("Enter Choice = ");
			int choice = sc.nextInt();
			System.out.println();
			flag = switchLoop(choice);
		}
		
		System.out.println("---------------ENDED-----------------");

	}

}
