class StringToInteger {
 
    // A simple atoi() function
    static int myAtoi(String str)
    {
        // Initialize result
        int res = 0;
 
        
        for (int i = 0; i < str.length(); ++i)
            res = res * 10 + str.charAt(i) - '0';
 
        // return result.
        return res;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String str = "89789";
       
         
        // Function call
        int val = myAtoi(str);
        System.out.println(val);
    }
}
 
