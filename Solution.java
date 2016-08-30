package solution;

import java.io.*;
import java.util.*;
import java.math.*;
import java.io.PrintWriter;
public class Solution {
int t=1;


void print(long a,int b,long n,long k,PrintWriter pw ){
    long count=0;
    for(int i=1;i<=n;i++){
                        for(int j=1;j<=n;j++){
    if(i!=j && (sol(i,a,k)+sol(j,b,k))%k == 0){
        count++;
        count=count%1000000007;
    }
        }
     }
     
     pw.println("Case #"+t+": "+count);
     t++;
     pw.flush();
}
  long sol(long a,long b,long k ){
    
     long res=1;
    
     while(b>0){
         if((b&1)==1){
             res=res*a%k;
         }
         
         b>>=1;
         a=a*a%k;
     }
   return res;
     
       
    
 }
    public static void main(String[] args) throws IOException{
        
         Scanner sc = new Scanner(new FileReader("D:\\f.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("D:\\output2.txt"));
                  Solution obj=new Solution();      
                int t=sc.nextInt();
                while(t>0){
                    long a=sc.nextLong();
                    int b=sc.nextInt();
                    long n=sc.nextLong();
                    long k=sc.nextLong();
                    
                    obj.print(a,b,n,k,pw);               
                    
                    //
                    t--;
                }
            
		pw.close();
		sc.close();
    }
    
}
