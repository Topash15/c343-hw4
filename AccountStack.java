public class AccountStack
{
    private AccountNode top;

    public AccountStack()
    {
        top = null;
    }
	
    public boolean isEmpty()
    {
        if(top==null) return true;
	else return false;
    }
	
    public void push(AccountNode n)
    {
        n.next = top;
        top = n;
    }
	
    public AccountNode pop()
    {
        if(isEmpty()==false)
	{
            AccountNode result = top;
            top = top.next;
            result.next = null;
            return result;
	}
	else return null;
    }
}
