//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends




// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        int sum=0,temp,digit,p=0;
        temp=n;
        digit=digits(n);
        while(n!=0){
            int d=n%10;
            p=p+power(d,digit);
            n=n/10;
        }
        if(p==temp){
            return "true";
        }
            return "false";
    }
    static int digits(int n){
        int c=0;
        while(n!=0){
        int digit=n%10;
        c=c+1;
        n=n/10;
        }return c;
    }
    static int power(int d,int digit){
        int r=1;
        for(int i=1;i<=digit;i++)
        {
            r=r*d;
        }return r;
    }
    
}