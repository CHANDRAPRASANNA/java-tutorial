package stack;

public class PushAndPop {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public void arraystack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("stack is full cannot push" + value);
        } else {
            stackArray[++top] = value;
            System.out.println("pushed" + value + "  peek:" + peek());
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("empty");

        } else {
            System.out.println("poped ,peek " + stackArray[top - 1]);
            System.out.println(stackArray[top--]);

        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int peek() {
        return stackArray[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i] + " ");
            }
        }
    }

    public void count() {
        int ec = 0, oc = 0;
        for (int i = 0; i < top + 1; i++) {
            if (stackArray[i] % 2 == 0) {
                ec += 1;
            } else {
                oc += 1;
            }
        }
        System.out.println("Even count: " + ec + "  Odd count: " + oc);
    }

    public static void main(String[] args) {
        PushAndPop mystack = new PushAndPop();
        mystack.arraystack(5);
        mystack.push(20);
        mystack.push(2);
        mystack.push(3);
        mystack.push(5);
        mystack.push(6);
        mystack.pop();
        mystack.count();
        mystack.display();
    }
}
