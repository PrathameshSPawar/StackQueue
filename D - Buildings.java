public class Main
{
	public static void main(String[] args) {
	    Scanner pp=new Scanner(System.in);
	    System.out.print("\nEnter the Count of Array's Element: ");
	    int n=pp.nextInt();
	    int arr[]=new int[n];
	    System.out.println("\nEnter Element one by one: ");
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=pp.nextInt();
	    }
	    int ans[]=new int[n];
	    Stack<Integer> stack=new Stack();
	    for(int i=n-1;i>=0;i--)
	    {
	        ans[i]=stack.size();
	        while(!stack.isEmpty() && arr[i]>stack.peek())
	        {
	            stack.pop();
	        }
	        stack.push(arr[i]);
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(ans[i]+" ");
	    }
	    return;
	}
}
