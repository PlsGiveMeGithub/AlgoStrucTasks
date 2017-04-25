import java.util.Scanner;

public class StudentListTest 
{
	private static List currentList;
	private static Node currentNode;
	private static CmdLine currentCmd;
	
	public static void main(String[] args) 
	{
		System.out.println("+++ Welcome to the StudentListText Java Project +++");
		System.out.println("Please visit the help page (type -> help)");
		
		currentCmd = new CmdLine("");
		scanCommand();
	}
	
	private static void scanCommand () 
	{
		System.out.print("\n");
		
		if(existList())
			System.out.print("Current List: active \t");
		else
			System.out.print("Current List: missing \t");
			
		if(existNode())
			System.out.print("Current Node: active \t");
		else
			System.out.print("Current Node: missing \t");
		
		System.out.print("\n");
		
		currentCmd.readLine();
		processCommand();
	}
	
	private static void processCommand () 
	{
		switch (currentCmd.getCmd(0)) 
		{
			case "list":
				listCommand(currentCmd.getCmd(1), currentCmd.getCmd(2));
				break;
			case "node":
				nodeCommand(currentCmd.getCmd(1), currentCmd.getCmd(2));
				break;
			case "help":
				printHelp ();
				scanCommand ();
				break;
			case "exit":
				System.out.println("Exit ...");
				System.exit(0);
				break;
			default:
				System.out.println("Command not found ...");
				scanCommand ();
				break;
		}
	}
	
	private static void listCommand (String operation, String target) 
	{
		switch (operation)
		{
			case "new":
				createList ();
				break;
			case "print":
				if(existList())
					System.out.println(currentList);
				else
					System.out.println("Please create a List");
				break;
			case "append":
				break;
			case "push":
				break;
			case "get":
				break;
			case "set":
				break;
			default:
				System.out.println("Command not found ...");
				break;
		}
		
		scanCommand ();
	}
	
	private static void nodeCommand (String operation, String target) 
	{
		switch (operation)
		{
			case "new":
				createNode ();
				break;
			case "print":
				if(existNode())
					System.out.println(currentNode);
				else
					System.out.println("Please create a List");
				break;
			case "append":
				break;
			case "push":
				break;
			case "get":
				break;
			case "set":
				break;
			default:
				System.out.println("Command not found ...");
				break;
		}
		
		scanCommand ();
	}
	
	private static void printHelp () 
	{
		System.out.println("Available Commands are:");
		System.out.println("-> help/exit");
		System.out.println("-> list [new/print]");
		System.out.println("-> list [append/push]");
		System.out.println("-> list [get/set/remove] (index)");
		System.out.println("-> node [new]");
		System.out.println("-> node [print/child/parent] (index)");
		System.out.println("Examples:");
		System.out.println("> list new");
		System.out.println("> node print 5");
	}
	
	private static boolean existList () 
	{
		if(currentList == null)
			return false;
		return true;
	}
	
	private static boolean existNode () 
	{
		if(currentNode == null)
			return false;
		return true;
	}
	
	
	private static void createList () 
	{
		System.out.println("Creating List ...");
		currentList = new List();
	}
	
	private static void createNode () 
	{
		System.out.println("Creating Node ...");
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Mtrcl Prefix: ");
		String prefix = sc.nextLine();
		
		System.out.print("Mtrcl Id: ");
		String id = sc.nextLine();
		
		System.out.print("Course of Studies: ");
		String course = sc.nextLine();
		
		System.out.print("Year: ");
		String year = sc.nextLine();
		
		System.out.print("Last Name: ");
		String lastname = sc.nextLine();
		
		System.out.print("First Name: ");
		String firstname = sc.nextLine();
		
		MtrclNumber mtrcl = new MtrclNumber(prefix, id);
		CourseOfStudies cofs = new CourseOfStudies(course, year);
		
		Student student = new Student(mtrcl, cofs, lastname, firstname);
		currentNode = new SimpleNode<Student>(student, null);
	}
}
