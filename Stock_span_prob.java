//Monotonic Stack GFG

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
      //For geting previous record of small values tilll current index we use stack datastru 
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> stack=new Stack();
        for(int i=0;i<arr.length;i++)
        {
            //here we remove all value which is less than the current value
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()])
            {
                stack.pop();
            }

            //like supose 40->35->28->20 and further we get 50 so above function remove all value til current value'index
            //stack get empty so we add condition i+1 and add in answer
            if(stack.isEmpty())
            {
                ans.add(i+1);
            }else{
                //we remove stack peek's value which is greater than curr and remove that value from current index
                ans.add(i-stack.peek());
            }
            stack.push(i);
        }
        return ans;
    }
}
