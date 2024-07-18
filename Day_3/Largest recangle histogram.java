class Solution {
    public int largestRectangleArea(int[] arr) {
       int n = arr.length;
       Stack<Integer> s = new Stack<>();
       int leftSmall[] = new int[n];
       int rightSmall[] = new int[n];
       for(int i = 0; i<n; i++) {
           while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
               s.pop();
           }

           if(s.isEmpty()) leftSmall[i] = 0;
           else leftSmall[i] = s.peek()+1;
           s.push(i);
       }

       s.clear();
       for(int i = n-1; i>=0; i--) {
           while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
               s.pop();
           }
           if(s.isEmpty()) rightSmall[i] = n-1;
           else rightSmall[i] = s.peek()-1;
           s.push(i);
       }

       int max = 0;
       for(int i = 0; i<n; i++) {
           max = Math.max(max, arr[i]*(rightSmall[i]-leftSmall[i]+1));
       }
       return max;
    }
}