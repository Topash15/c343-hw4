public class AccountQueue
{
    private AccountNode qFront;
    private AccountNode qRear;

    public AccountQueue()
    {
        qFront = null;
	qRear = null;
    }
        
    public boolean isEmpty()
    {
        if(qFront==null) return true;
	else return false;
    }
    
    public void enqueue(AccountNode n)
    {
	// your code goes here
        // insert n to the back of queue
    }
    
    public void enqueue(int act_number, String name, double balance)
    {
        // your code goes here
        // create a new AccountNode instance n based on parameters
        // call enqueue(n) to insert n to the back of queue;
    }
	
    public AccountNode dequeue()
    {
	// your code goes here
        // if queue is not empty, remove and return one item from the front of queue
	// else return null;
    }
    
    public void printQueue()
    {
        AccountNode temp = this.qFront;
        while(temp != null)
        {
            System.out.println(temp.account_number + " " + temp.name + " " + temp.balance);
            temp = temp.next;
        }
    }
    
    public void reverseQueue()
    {
        // your code goes here
        // reverse the order of the elements in queue
    }
}