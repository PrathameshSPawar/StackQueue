class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i= (2*n)-1;i>=0;i--)
        {
            int current=nums[i%n];
            while(!stack.isEmpty() && stack.peek()<=current){
                stack.pop();
            }

            if(stack.isEmpty() && i<n){
                ans[i]=-1;
            }
            
            if (!stack.isEmpty() && i < n)
                ans[i]= stack.peek();

            stack.push(current);
        }
        return ans;
    }
}
