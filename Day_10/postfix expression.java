class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<S.length(); i++) {
            char ch = S.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int b = st.peek(); st.pop();
                int a = st.peek(); st.pop();
                int res = solve(a, b, ch);
                st.push(res);
            } else {
                st.push(ch-48);
            }
        }
        return st.peek();
    }
    
    public static int solve(int a, int b, int ch) {
        if(ch == '+') {
            return a+b;
        } else if(ch == '-') {
            return a-b;
        } else if(ch == '*'){
            return a*b;
        } else if(ch == '/'){
            return a/b;
        } else {
            return 0;
        }
    }
}