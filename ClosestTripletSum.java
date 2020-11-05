// Java implementation of the above approach 
import static java.lang.Math.abs; 
import java.util.*; 
  
class GFG 
{ 
  

static int solution(Vector<Integer> arr, int x) 
{ 
  
    // Sort the array 
    Collections.sort(arr); 
  
    
    int closestSum = Integer.MAX_VALUE; 
  
    
    for (int i = 0; i < arr.size() - 2; i++)  
    { 
  
       
        int ptr1 = i + 1, ptr2 = arr.size() - 1; 
  
        // While there could be more pairs to check 
        while (ptr1 < ptr2) 
        { 
  
            
            int sum = arr.get(i) + arr.get(ptr1) + arr.get(ptr2); 
  
          
            if (abs(x - sum) < abs(x - closestSum))  
            { 
                closestSum = sum; 
            } 
  
           
            if (sum > x)  
            { 
                ptr2--; 
            } 
  
            // Else increment the first pointer 
            // to get a larger sum 
            else
            { 
                ptr1++; 
            } 
        } 
    } 
  
    // Return the closest sum found 
    return closestSum; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    Vector arr = new Vector(Arrays.asList( -1, 2, 1, -4 )); 
    int x = 1; 
    System.out.println(solution(arr, x)); 
} 
} 
  
/* This code is contributed by PrinciRaj1992 */
