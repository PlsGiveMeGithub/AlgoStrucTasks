
public class Student 
{
	private MtrclNumber mtrclNumber;
	private CourseOfStudies courseOfStudies;
	private String firstName;
	private String lastName;
	
	public Student (MtrclNumber mtrclNumber, CourseOfStudies courseOfStudies, String lastName, String firstName)
	{
		this.mtrclNumber = mtrclNumber;
		this.courseOfStudies = courseOfStudies;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public MtrclNumber getMtrclNumber () 
	{
		return mtrclNumber;
	}
	
	public CourseOfStudies getCourseOfStudies () 
	{
		return courseOfStudies;
	}
	
	public String getFirstName () 
	{
		return firstName;
	}
	
	public String getLastName () 
	{
		return lastName;
	}
}
