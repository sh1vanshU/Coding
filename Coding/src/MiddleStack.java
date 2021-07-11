// This is very tricky problem.
/*
    Requirement to delete or find middle element only by O(1) time.
    try to impelement Doubly linked list.
*/
public class MiddleStack {
    class DLLNode {
        private int data;
        private DLLNode previous;
        private DLLNode next;

        DLLNode(int data) {
            this.data = data;
        }
    }

    class myStack {
        private int count;
        private DLLNode head;
        private DLLNode mid;

    }

    public myStack createMyStack() {
        myStack stack = new myStack();
        stack.count = 0;
        return stack;
    }

    public void push(myStack ms, int newData) {
        DLLNode dNode = new DLLNode(newData);
        dNode.previous = null;
        dNode.next = ms.head;
        ms.count++;
        if (ms.count == 1) {
            ms.mid = dNode;
        } else {
            ms.head.previous = dNode;
            if ((ms.count % 2) != 0)
                ms.mid = ms.mid.previous;

        }
        ms.head = dNode;
    }

    public static void main(String[] args) {
        MiddleStack ms = new MiddleStack();
        myStack st = ms.createMyStack();
        ms.push(st, 11);
        ms.push(st, 22);
        ms.push(st, 33);
        ms.push(st, 44);
        ms.push(st, 55);
        ms.push(st, 66);
        ms.push(st, 77);
        System.out.println("Item popped is " + ms.pop(st));
        System.out.println("Item popped is " + ms.pop(st));
        System.out.println("Middle Element is " + ms.findMiddle(st));

    }

    private int pop(MiddleStack.myStack st) {
        try {
            if (st.count == 0)
                throw new Exception("Stack is Empty");
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
        DLLNode head = st.head;
        int item = head.data;
        st.head = head.next;

        if (st.head != null)
            st.head.previous = null;

        st.count-=1;

        if(st.count%2==0)
            st.mid=st.mid.next;
        
        return item;

    }

    private int findMiddle(MiddleStack.myStack st) {
        try {
            if (st.count == 0)
                throw new Exception("stack size is empty");
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }

        return st.mid.data;
    }
}
