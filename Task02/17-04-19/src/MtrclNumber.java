
public class MtrclNumber 
{
	private String prefix;
	private String id;
	private boolean hasPrefix;
	
	
	public MtrclNumber (String id) 
	{
		this.id = id;
		hasPrefix = false;
	}
	
	public MtrclNumber (String prefix, String id)
	{
		this.prefix = prefix;
		this.id = id;
		hasPrefix = true;
	}
	
	public String getPrefix () 
	{
		return prefix;
	}
	
	public String getId () 
	{
		return id;
	}
	
	public String getMtrclNumber () 
	{
		if(hasPrefix)
			return prefix + id;
		
		return id;
	}
}
