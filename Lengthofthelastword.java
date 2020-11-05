public class Lengthofthelastword { 
    public int lengthOfLastWord(final String a) 
    { 
        int len = 0; 
  
        /* String a is 'final'-- can not be modified 
           So, create a copy and trim the spaces from 
           both sides */
        String x = a.trim(); 
  
        for (int i = 0; i < x.length(); i++) { 
            if (x.charAt(i) == ' ') 
                len = 0; 
            else
                len++; 
        } 
  
        return len; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String input = "match stiks in matchbox "; 
        Lengthofthelastword lw = new Lengthofthelastword(); 
        System.out.println("The length of last word is " + lw.lengthOfLastWord(input)); 
    } 
} 