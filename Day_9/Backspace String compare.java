class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '#' && !s1.isEmpty()) {
                s1.pop(); 
            } else if(s.charAt(i) != '#') {
                s1.push(s.charAt(i));
            }
        }
        System.out.println(s1);
        for(int i = 0; i<t.length(); i++) {
            if(t.charAt(i) == '#' && !s2.isEmpty()) {
                s2.pop(); 
            } else if(t.charAt(i) != '#') {
                s2.push(t.charAt(i));
            }
        }
        System.out.println(s2);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(!s1.isEmpty()) {
            sb1.append(s1.pop());
        }
        while(!s2.isEmpty()) {
            sb2.append(s2.pop());
        }
        if(sb1.toString().equals(sb2.toString())) {
            return true;
        }
        return false; 
    }
}