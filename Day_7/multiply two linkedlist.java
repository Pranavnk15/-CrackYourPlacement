class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long mod = (long)1e9 + 7;
        long num1 = 0;
        while(first != null) {
            num1 = (num1*10 + first.data)%mod;
            first = first.next;
        }
        long num2 = 0;
        while(second != null) {
            num2 = (num2*10 + second.data)%mod;
            second = second.next;
        }
        
        long ans = (num1*num2)%mod;
        return ans;
    }
}