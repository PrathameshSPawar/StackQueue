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
