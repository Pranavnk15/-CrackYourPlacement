class Solution {
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code her
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        ArrayList<Node> arr = new ArrayList<>();
        solve(root, arr);
      for(Node node: arr) {
          System.out.print(node.data+ " ");
      }
       
       for(int i = 0; i<arr.size(); i++) {
           if(key == arr.get(i).data) {
               pre[0] = arr.get(i-1);
               suc[0] = arr.get(i+1);
               break;
           }
       }
        // for(int i = 0; i<arr.size(); i++) {
        //     if(key == arr.get(i)) {
        //         pre[0] = i-1 >= 0 ? arr.get(i-1) : -1;
        //         suc[0] = i+1 <arr.size() ? arr.get(i+1) : -1;
        //     }
        // }
    }
    
    public static void solve(Node root, ArrayList<Node> arr) {
        if(root == null) {
            
            return;
        }
        solve(root.left, arr);
        arr.add(root);
        solve(root.right, arr);
        
    }
}