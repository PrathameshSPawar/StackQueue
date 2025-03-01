/*
Given an input stream s consisting only of lowercase alphabets. While reading characters from the stream, 
you have to tell which character has appeared only once in the stream upto that point. 
If there are many characters that have appeared only once, you have to tell which one of them was the first one to appear. 
If there is no such character then append '#' to the answer.
*/ } Driver Code Ends


class Solution {
    public String FirstNonRepeating(String s) {
        // code here
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        //char ch=s.charAt(0);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            
            char c=s.charAt(i);
            q.offer(c);
            freq[c-'a']++;
            while(freq[q.front()]>1)
            {
                q.poll();
            }
            
            if(q.isEmpty())
            {
                str.append('#');
            }else{
                str.append(q.front());
            }
        }
        return str.toString();
    }
}
