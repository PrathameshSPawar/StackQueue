Input: heights = [2,1,5,6,2,3]
Output: 10

class Solution {
    public static int largestRectangleArea(int[] heights)
    {
        Stack<Integer> stack=new Stack<>();
        int max=0;
        stack.push(0);
        for(int i=1;i<heights.length;i++)
        {
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()])
            {
                max=getMax(heights,stack,max,i);
            }
            stack.push(i);
        }

        while(!stack.isEmpty())
        {
            max=getMax(heights,stack,max,heights.length);
        }
        return max;
    }

    private static int getMax(int heights[],Stack<Integer> stack,int max,int i)
    {
        
        int area;
        int popped=stack.pop();
        if(stack.isEmpty())
        {
            area=heights[popped]*i;
        }else{
            area=heights[popped]*(i-1-stack.peek());
        }
        return Math.max(area,max);
    }
}
