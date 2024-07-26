class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<tokens.length; i++) {
            String s = tokens[i];
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                int res = solve(a, b, s);
                st.push(res);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
    public static int solve(int a, int b, String ch) {
        if(ch.equals("+")) {
            return a+b;
        } else if(ch.equals("-")) {
            return a-b;
        } else if(ch.equals("*")) {
            return a*b;
        } 
        return a/b;
    }
}