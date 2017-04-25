
public class SimpleNode<TContent> implements Node<SimpleNode, TContent>
{
	private TContent content;
	private SimpleNode firstNode;
	private SimpleNode child;
	
	public SimpleNode (TContent content, SimpleNode firstNode) 
	{
		this.content = content;
		this.firstNode = firstNode;
	}
	
	@Override
	public void setChild(SimpleNode child) 
	{
		this.child = child;
	}
	
	@Override
	public void setParent(SimpleNode parent) 
	{
		parent.setChild(this);
	}

	public void setContent (TContent content) 
	{
		this.content = content;
	}
	
	@Override
	public SimpleNode getChild() 
	{
		return child;
	}

	@Override
	public SimpleNode getParent() 
	{
		SimpleNode current = firstNode;
		while (current.getChild() != null)
		{
			if(current.getChild() == this)
				return firstNode;
			else
				current = current.getChild();
		}
		
		return null;
	}
	
	public TContent getContent () 
	{
		return content;
	}
}
