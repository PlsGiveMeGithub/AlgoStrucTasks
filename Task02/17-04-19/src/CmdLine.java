import java.util.Scanner;

public class CmdLine 
{
	private String cmdLine;
	private String[] cmdList;
	private String cmdMissing;
	
	public CmdLine (String cmdMissing) 
	{
		this.cmdMissing = cmdMissing;
	}
	
	public void readLine () 
	{
		System.out.print("> ");
		Scanner sc = new Scanner(System.in);
		cmdLine = sc.nextLine();
		cmdList = cmdLine.split(" ");
	}
	
	public String getCmdLine () 
	{
		if(cmdLine == null)
			return cmdMissing;
		
		return cmdLine;
	}
	
	public String getCmd (int index) 
	{
		if(cmdList == null)
			return cmdMissing;
		
		if(cmdList.length < 1)
			return cmdMissing;
		
		if(index < 0 || index >= cmdList.length)
			return cmdMissing;
		
		return cmdList[index];
	}
	
}
