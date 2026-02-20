public class AccountQueue {
    private AccountNode qFront;
    private AccountNode qRear;

    public AccountQueue() {
        qFront = null;
        qRear = null;
    }

    public boolean isEmpty() {
        if (qFront == null)
            return true;
        else
            return false;
    }

    public void enqueue(AccountNode n)
    {
	    // your code goes here
        // insert n to the back of queue
        if(this.isEmpty()){
            qFront = n;
            qRear = n;
        } else if (qFront == qRear){
            AccountNode leader = qFront;
            leader.next = n;
            qRear = n;
        } else {
            AccountNode lead = qFront;
            while(lead.next != null){
                lead = lead.next;
            }
            lead.next = n;
            qRear = n;
        }

    }

    public void enqueue(int act_number, String name, double balance) {
        // your code goes here
        // create a new AccountNode instance n based on parameters
        AccountNode newAccountNode = new AccountNode(act_number, name, balance);
        // call enqueue(n) to insert n to the back of queue;
        this.enqueue(newAccountNode);
    }

    public AccountNode dequeue() {
        // your code goes here
        // if queue is not empty, remove and return one item from the front of queue
        if(!this.isEmpty()){
            AccountNode lead = qFront;
            qFront = qFront.next;
            return lead;
        }
        // else return null;
        return null;
    }

    public void printQueue() {
        AccountNode temp = this.qFront;
        while (temp != null) {
            System.out.println(temp.account_number + " " + temp.name + " " + temp.balance);
            temp = temp.next;
        }
    }

    public void reverseQueue() {
        // your code goes here
        // reverse the order of the elements in queue
        
        // deconstruct queue into a stack
        AccountStack tempStack = new AccountStack();
        AccountNode lead = qFront;
        while(lead != null){
            tempStack.push(new AccountNode(lead.account_number, lead.name, lead.balance));
            lead = lead.next;
        }

        // reset queue and add stack into queue
        qFront = null;
        AccountNode newLead = tempStack.pop();
        while( !tempStack.isEmpty()){
            this.enqueue(newLead);
            newLead = tempStack.pop();
        }
        this.enqueue(newLead);
    }
}