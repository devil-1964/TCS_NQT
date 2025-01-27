import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int n = scanner.nextInt();
        long x = scanner.nextLong();

        int[] arr = new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            map.put(arr[i],i);
        }
        int ans=0;
        for(int i:arr)
        {
            if(map.get(i)==-1)
            {
                continue;
            }
            if(map.containsKey(i*2) && map.get(i*2)!=-1)
            {
                map.put(i,-1);
                map.put(i*2,-1);
            }
        }
        for(int i:map.values())
        {
            if(i!=-1)
            {
                ans++;
            }
        }

        
        // System.out.println(map.toString());
        System.out.println(ans);
    }
}
