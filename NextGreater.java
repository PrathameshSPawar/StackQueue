public class Solution {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> stack=new Stack();
        int n=A.size();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek()<=A.get(i))
            {
                stack.pop();
            }
            
            if(stack.isEmpty()){
                ans.add(0,-1);
            }else{
                ans.add(0,stack.peek());
            }
            
            stack.push(A.get(i));
        }
        return ans;
    }
}
