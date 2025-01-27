import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s2=sc.next();
        String s1=sc.next();
        
        System.out.println(Check(s1).equals(Check(s2)));
      
    }
    public static List<Character> Check(String s)
    {
        Stack<Character> st=new Stack<>();
        int i=0;
        int n=s.length();
        while(i<n)
        {
            char ch=s.charAt(i);
            if(ch!='#')
            {
                st.push(ch);
            }
            else
            {
                if(!st.isEmpty())
                st.pop();
            }
            i++;
        }
        List<Character> list=new ArrayList<>(st);
        return list;
    }
}