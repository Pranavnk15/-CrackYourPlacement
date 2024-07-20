class Solution {
    public int calculate(String s) {
        if(s == null || s.isEmpty()) return 0;
        int len = s.length();
        Stack<Integer> st = new Stack<>();
        int currNum = 0;
        char op = '+';
        for(int i = 0; i<len; i++) {
            char currChar = s.charAt(i);
            if(Character.isDigit(currChar)) {
                currNum = currNum*10 + currChar - '0'; 
            }
            if(!Character.isDigit(currChar) && currChar != ' ' || i == len - 1) {
                if(op == '-') {
                    st.push(-currNum);
                } else if(op == '+') {
                    st.push(currNum);
                } else if(op == '*') {
                    st.push(st.pop()*currNum);
                } else if(op == '/') {
                    st.push(st.pop()/currNum);
                }
                op = currChar;
                currNum = 0;
            }
        }
        int result = 0;
        while(!st.isEmpty()) {
            result += st.pop();
        }
        return result;
    }
}