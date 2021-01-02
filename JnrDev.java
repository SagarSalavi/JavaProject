class JnrDev extends Developer 
{
	private String Designation="JuniorDeveloper" ;
	private static int JnrDevCount=0;

	JnrDev()
	{
		super("Suresh", 15000);
		
		JnrDevCount++;
	}

	public String getDesignation()
	{
		return Designation;
	}

	public int getJnrDevCount()
	{
		return JnrDevCount;
	}

	public void CreateLLD()
	{
		System.out.println("Jnrdev designs Code ");
	}

	@Override
	public void Work()
	{
		System.out.println("Junior Developer work in Company!");
	}
    
  
}
