// ******
// *    *
// *    *
// *    *
// *    *
// ******

// printing pattern- Square Hollow pattern

public class SquareHollow{
    
    public static void printPattern(int n)
    {
        int i,j;
        // Outer loop to handle number of throws
        for (i=0;i<n;i++)
        {
            // inner loop to handle number of columns
            
        for(j=0;j<n;j++)
        {
            // star will print only when it is in first throws
            // or last row or first column or last column
            
            if (i == 0 || j == 0 || i == n-1 || j == n-1)
            {
                System.out.print("*");
            }
            // Otherwise print space only
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
    // Driver Function
    
    public static void main(String[] args)
    {
        int n=6;
        printPattern(n);
    }
}
