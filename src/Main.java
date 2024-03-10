public class Main {
    public static void main(String[] args)
    {
        StackArray sa = new StackArray(6);
        sa.push(7);
        sa.push(3);
        sa.push(2);
        sa.push(9);
        sa.push(8);
        sa.display();
        sa.push(4);
        sa.push(1);
        sa.display();
        try{
            int x = sa.peek();
            System.out.println("peek is: "+x);
            System.out.println("poped item:"+sa.pop());
            System.out.println("poped item:"+sa.pop());
            System.out.println("poped item:"+sa.pop());
            System.out.println("poped item:"+sa.pop());
            System.out.println("poped item:"+sa.pop());
            System.out.println("poped item:"+sa.pop());
            System.out.println("poped item:"+sa.pop());
        }
        catch (Exception e){
            System.out.println(e);
        }
        sa.display();
    }
}