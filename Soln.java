
package soln;

import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class Soln {
boolean b=false;
int count=0;
   void check(String st,String[] s,int d){
      st=st.replace('(', '[');
      st=st.replace(')', ']');
      for(int k=0;k<d;k++){
      b=Pattern.matches(st, s[k]);
      if(b==true) count++;
      b=false;
  }
   }
    public static void main(String[] args) throws IOException {
     Scanner sc=new Scanner(new FileReader("F:\\a.in"));
     PrintWriter pw=new PrintWriter(new FileWriter("F:\\out.txt"));
     int l=sc.nextInt();
     int d=sc.nextInt();
     int n=sc.nextInt();
     String[] s=new String[d];
     sc.nextLine();
     for(int i=0;i<d;i++){
         s[i]=sc.nextLine();
           
         }
    String st;
    Soln obj=new Soln();
    int temp=1;
    while(n>0){
    st=sc.nextLine();
    obj.check(st,s,d);
    pw.println("Case #"+temp+": "+obj.count);
    pw.flush();
    obj.count=0;
    temp++;
    n--;    
    }
    pw.close();
    sc.close();
}
}