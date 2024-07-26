class Solution {
    public int sumSubarrayMins(int[] arr) {
        long res = 0;
        Stack<Integer> st = new Stack<>();
        long M = (long)1e9+7;
        st.push(-1);

        for(int i = 0; i<arr.length+1; i++) {
            int currVal = (i<arr.length) ? arr[i]:0;
            while(st.peek()!= -1 && currVal < arr[st.peek()]) {
                int index = st.pop();
                int j = st.peek();
                int left = index-i;
                int right = j-index;
                long add = (long)(left*right*(long)(arr[index]))%M;
                res += add;
                res %= M;
            }
            st.push(i);
        }
        return (int)res;



        // long res = 0;
        // Stack<Integer> stack = new Stack<Integer>();
        // long M = (long)1e9 + 7;
        // stack.push(-1);

        // for(int i = 0; i<arr.length+1; i++) {
        //     int currVal = (i < arr.length) ? arr[i] : 0;

        //     while(stack.peek() != -1 && currVal < arr[stack.peek()]) {
        //         int index = stack.pop();
        //         int j = stack.peek();
        //         int left = index-i;
        //         int right = j - index;
        //         long add = (long)(left*right*(long)arr[index])%M;
        //         res += add;
        //         res %= M;
        //     }
        //     stack.push(i);
        // }
        // return (int)res;
    }
}