import java.util.*;
class Main {
    public static void main(String[] args) {
       String s="the quick brown fox jumps over the lazy dog";
       int n=s.length();
       HashSet<Character> set=new HashSet<>();
       for(int i=0;i<26;i++)
       {
           char cc=(char)((int)('a')+i);
           set.add(cc);
       }
       for(char ch:s.toCharArray())
       {
           if(set.contains(ch))
           {
               set.remove(ch);
               if(set.size()==0)
               {
                   break;
               }
           }
       }
        //    System.out.println(set.toString());
       
       if(set.size()==0)
       {
           System.out.println("True");
       }
       else
       {
           System.out.println("False");
       }
    }
}