import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner pp=new Scanner(System.in);
	    System.out.print("\nEnter the count of Queries: ");
	    int queries=pp.nextInt();
	    //int count=0;
	    int sum=0;
	    Queue<Integer> q=new LinkedList();
	    while(queries-->0)
	    {
	        System.out.print("\nEnter Your Choice: ");
	        int cho=pp.nextInt();
	        if(cho==1)
	        {
	            q.offer(-sum);
	        }else if(cho==2)
	        {
	            System.out.print("\nEnter the Size that you want to increase: ");
	            sum+=pp.nextInt();
	        }else if(cho==3)
	        {
	            int count=0;
	            System.out.print("\nEnter the Trees height till which you want to remove: ");
	            int n=pp.nextInt();
	            while(!q.inEmpty() && (q.peek()+sum)>=n)
	            {
	                count++;
	                q.poll();
	            }
	            System.out.println("Removed: "+count);
	        }else{
	            System.out.println("Please select valid input;;;");
	        }
	    }
	    
	    
	}
}
