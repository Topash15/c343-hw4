public class queueTest
{
    public static void main(String[] args)
    {
        AccountQueue myqueue = new AccountQueue();
            
        myqueue.enqueue(6006, "Paul Mayer", 2000);
        myqueue.enqueue(1001, "Lisa Smith", 1000);
        myqueue.enqueue(2002, "May Bee", 1500);
        myqueue.enqueue(3003, "Love Summer", 4500);
        AccountNode an = new AccountNode(4004, "Power Seeker", 999);
        myqueue.enqueue(an);
        myqueue.enqueue(5005, "Janet Mayer", 2000);
            
        AccountNode bn = myqueue.dequeue();
        if(bn !=null) System.out.println(bn.account_number + "\n");
                    
        System.out.println("Original queue:");
        myqueue.printQueue();
            
        myqueue.reverseQueue();
        System.out.println("\nReversed queue:");
        myqueue.printQueue();

mj        return;
    }
}

/*
output:

6006

Original queue:
1001 Lisa Smith 1000.0
2002 May Bee 1500.0
3003 Love Summer 4500.0
4004 Power Seeker 999.0
5005 Janet Mayer 2000.0

Reversed queue:
5005 Janet Mayer 2000.0
4004 Power Seeker 999.0
3003 Love Summer 4500.0
2002 May Bee 1500.0
1001 Lisa Smith 1000.0

*/
