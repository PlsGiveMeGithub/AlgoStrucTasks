
public class List<TNode>
{
	private Node firstNode;
	
	public List () 
	{
		this.firstNode = null;
	}
	
	public List(Node firstNode) 
	{
		this.firstNode = firstNode;
	}
	
	public void getNode (int index)
	{
		
	}
	
	public void setNode (int index)
	{
		
	}
	
	public void append (Node node) 
	{
		if(firstNode == null)
		{
			firstNode = node;
			return;
		}
		
		Node current = firstNode;
		
		while (current.getChild() != null)
		{
			current = (Node) current.getChild();
		}
		
		current.setChild(node);
	}
	
	public void push (Node node)
	{
		
	}
	
	public int length () 
	{
		if(firstNode == null)
			return 0;
		
		int count = 1;
		Node current = firstNode;
		
		while (current.getChild() != null)
		{
			current = (Node) current.getChild();
			count++;
		}
		
		return count;
	}
	
	public String toString () 
	{
		return null;
	}
}
