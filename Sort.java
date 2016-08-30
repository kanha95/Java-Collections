
package sort;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.util.*;


public class Sort {
int[] a;
int[] b;
long res=0;

void mindot(){
        int temp=a.length-1;
    for(int i=0;i<a.length;i++){
        res+=(a[i]*b[temp-i]);
      
    }
}
   void sort1(){
       for(int i=1;i<a.length;i++){
           int key=a[i];
           int j=i-1;
           while(j>=0 && a[j]>key){
               a[j+1]=a[j];
                j=j-1;
           }
           a[j+1]=key;
       }
       
         for(int i=1;i<=b.length-1;i++){
           int key=b[i];
           int j=i-1;
           while(j>=0 && b[j]>key){
               b[j+1]=b[j];
                j=j-1;
           }
           b[j+1]=key;
       }
   } 
    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(new FileReader("D:\\f.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("D:\\output2.txt"));
    
                int t=sc.nextInt();
    int n;
        Sort obj=new Sort();
     int y=1;
    while(t>0){
    
        n=sc.nextInt();
           obj.a=new int[n];
           obj.b=new int[n];
            for(int i=0;i<n;i++){
                obj.a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                obj.b[i]=sc.nextInt();
            }
        
            obj.sort1();
            
            obj.mindot();
            
            pw.println("Case #"+y+": "+obj.res);
            pw.flush();
            obj.res=0;
            y++;
      t--;
    }
    }
    
}
