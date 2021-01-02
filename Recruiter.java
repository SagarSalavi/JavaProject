class Recruiter extends Hr 
{
private String Designation="Recruiter" ;
	private static int RecCount=0;

	Recruiter()
	{
		super("Sujay", 20000);
		
		RecCount++;
	}

	public String getDesignation()
	{
		return Designation;
	}

	public int getRecCount()
	{
		return RecCount;
	}

	public void Hire()
	{
		System.out.println("Recruiter hires Employee ");
	}

	@Override
	public void Work()
	{
		System.out.println("Recruiter work in Company!");
	}
    
}
