
package modularexponentiation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.TreeSet;
import java.util.Iterator;
public class main {

    static int count=1;
    int prev=0;
    String winner;
    String func(String s,int h){
        if(h>prev){
        prev=h;
        winner=s;
            return winner;
        }
        else
            return winner;
    }
    void check(TreeSet<String> ts,PrintWriter pw){
   
    String leader=null;
    Iterator itr =ts.iterator();
    while(itr.hasNext()){
          TreeSet ch=new TreeSet();
        String s=String.valueOf(itr.next());
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
            ch.add(s.charAt(i));
     
        }
       
        int h=ch.size();
       
            leader=func(s,h);
    }
      pw.println("Case #" + count + ": "+leader);
     
      pw.flush();
     
}

    public static void main(String[] args) throws IOException{
            Scanner sc = new Scanner(new FileReader("D:\\f.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("D:\\output2.txt"));
    
                int t=sc.nextInt();
    int n;
    while(t>0){
        TreeSet<String> ts=new TreeSet<String>();
        n=sc.nextInt();
        sc.nextLine();
        while(n>0){
            ts.add(sc.nextLine());
            n--;
        }
       
        new main().check(ts,pw);
        main obj=new main();
        obj.count=obj.count+1;
        
        
        t--;
    }
    pw.close();
    sc.close();
    
    }
    
}
