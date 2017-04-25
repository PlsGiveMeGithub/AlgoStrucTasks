
public interface Node<TNode, TContent>
{
	public void setChild (TNode child);
	public void setParent (TNode parent);
	public TNode getChild ();
	public TNode getParent ();
	public TContent getContent ();
}
