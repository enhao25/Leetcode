class MyQueue {
    private int front;
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    // Time Complexity = O(n);
    public void push(int x) {
        if (s1.empty()) {
            front = x;
        }
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    // Time Complexity = O(1)
    public int pop() {
        int popValue = s1.pop();
        if (!s1.empty()) {
            front = s1.peek();
        }
        return popValue;
    }
    
    /** Get the front element. */
    // Time Complexity = O(1)
    public int peek() {
        return front;
    }
    
    /** Returns whether the queue is empty. */
    // Time Complexity = O(1)
    public boolean empty() {
        return s1.empty();
    }
}

// Problem: https://leetcode.com/problems/implement-queue-using-stacks/submissions/