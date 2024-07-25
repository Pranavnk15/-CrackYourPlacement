class twoStacks {
    ArrayList<Integer> arr1;
    ArrayList<Integer> arr2;
    twoStacks() {
        arr1 = new ArrayList<>();
        arr2 = new ArrayList<>();
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        arr1.add(x);
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        arr2.add(x);
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if(arr1.size() == 0) {
            return -1;
        }
        int ans = arr1.get(arr1.size()-1);
        arr1.remove(arr1.size()-1);
        return ans;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if(arr2.size() == 0) {
            return -1;
        }
        int ans = arr2.get(arr2.size()-1);
        arr2.remove(arr2.size()-1);
        return ans;
    }
}