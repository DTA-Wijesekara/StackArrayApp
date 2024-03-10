public class StackArray
{
    private int maxSize;
    int[] stackData;
    private int top;
    public StackArray(int s)
    {
        this.stackData = new int[s];
        this.maxSize = s;
        this.top = -1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == maxSize-1;
    }
    public void push (int item)
    {
        if(isFull())
        {
            System.out.println("stack is full cannot inserted");
            return;
        }
        stackData[++top] = item;
    }
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("stack is empty cannot pop");
        }
        return stackData[top--];
    }
    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("stack is empty cannot peek");
        }
        return stackData[top];
    }
    public void display()
    {
        System.out.println("start printing stack");
        for (int i=top;i>=0;i--)
        {
            System.out.println(stackData[i]);
        }
        System.out.println("end printing stack");
    }
}
