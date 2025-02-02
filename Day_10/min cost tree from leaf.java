class Solution {
    public int mctFromLeafValues(int[] arr) {
        if(arr == null || arr.length < 2) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        stack.push(Integer.MAX_VALUE);

        for(int num: arr) {
            while(stack.peek() <= num) {
                int smallValue = stack.pop();
                result += smallValue * Math.min(stack.peek(), num);
            }
            stack.push(num);
        }

        while(stack.size() > 2) {
            result += stack.pop() * stack.peek();
        }
        return result;
    }
}