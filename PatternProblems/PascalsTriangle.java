import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
        scanner.close();
        
        // Create and display Pascal's Triangle
        printPascalsTriangle(numRows);
    }

    // Function to print Pascal's Triangle
    public static void printPascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][numRows];

        // Iterate through rows
        for (int i = 0; i < numRows; i++) {
            // Print leading spaces to center-align the triangle
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }
            
            // Fill in the values for Pascal's triangle
            for (int j = 0; j <= i; j++) {
                // First and last values in every row are 1
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    // Sum of the two values from the previous row
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                // Print the current value
                System.out.print(triangle[i][j] + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

/*
 Output:
 Enter the number of rows for Pascal's Triangle: 7
       1 
      1 1 
     1 2 1 
    1 3 3 1 
   1 4 6 4 1 
  1 5 10 10 5 1 
 1 6 15 20 15 6 1 
*/
