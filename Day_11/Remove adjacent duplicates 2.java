class Solution {
    public String removeDuplicates(String s, int k) {
       Stack<Integer> countSt = new Stack<>();
       Stack<Character> charSt = new Stack<>();

       for(char ch: s.toCharArray()) {
            if(charSt.size() > 0 && charSt.peek() == ch) {
                countSt.push(countSt.peek()+1);
            } else {
                countSt.push(1);
            }
            charSt.push(ch);

            if(countSt.peek() == k) {
                for(int i = 0; i<k; i++) {
                    charSt.pop();
                    countSt.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!charSt.isEmpty()) {
            sb.append(charSt.pop());
        }
        return sb.reverse().toString();
    }
}