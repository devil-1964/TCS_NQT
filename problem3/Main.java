import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s1=sc.nextLine();
        
        System.out.println(Check(s1));
      
    }
    public static int Check(String s)
    {
        String arr[]=s.split(",");
        int maxi=Integer.MIN_VALUE;
        for(String a:arr)
        {
            String b=a.trim();
            maxi=Math.max(maxi,b.length());
        }
        return maxi;
    }
}