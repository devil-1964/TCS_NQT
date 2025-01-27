import java.util.*;
class Node{
    Node next;
    Node prev;
    int value[];
    Node(int value[])
    {
        this.value=value;
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        Node head=null;
        Node p=null;
        Node neww=null;
        int count=0;
        
        for(int a[]:arr)
        {
            count++;
            if(count%2!=0)
            {

                neww=new Node(a);
                neww.prev=p;
                if(p!=null)
                {
                    p.next=neww;
                }
                else
                {
                    head=neww;
                }
                p=neww;
            }
        }
        count=0;
        for(int a[]:arr)
        {
            count++;
            if(count%2==0)
            {
                neww=new Node(a);
                neww.prev=p;
                if(p!=null)
                {
                    p.next=neww;
                }
                p=neww;
            }
        }
        neww.next=null;
        Node current=head;
        while(current!=null)
        {
            System.out.println(Arrays.toString(current.value));
            head=current;
            current = current.next;
        }
        while(head!=null)
        {
            System.out.println(Arrays.toString(head.value));
            head = head.prev;
        }
    }
}