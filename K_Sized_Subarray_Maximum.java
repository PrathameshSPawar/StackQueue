//Monotonic Queue

class Solution {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        // code here
        Deque<Integer> dq=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        //Process first window
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
            {
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        ans.add(arr[dq.peekFirst()]);
        //Process remaining Window
        for(int i=k;i<arr.length;i++)
        {
            if(!dq.isEmpty() && dq.peekFirst()==i-k)
            {
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
            {
                dq.pollLast();
            }
            
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekFirst()])
            {
                dq.pollFirst();
            }
            
            dq.offerLast(i);
            ans.add(arr[dq.peekFirst()]);
        }
        return ans;
    }
