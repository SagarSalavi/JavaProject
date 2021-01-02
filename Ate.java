class Ate extends Tester 
{
	private String Designation="AutomationTestingEngineer" ;
	private static int AteCount=0;

	Ate()
	{
		super("Vijay", 17000);
		
		AteCount++;
	}

	public String getDesignation()
	{
		return Designation;
	}

	public int getAteCount()
	{
		return AteCount;
	}

	public void WriteScript()
	{
		System.out.println("ATE writes Script ");
	}

	@Override
	public void Work()
	{
		System.out.println("AutomationTestingEngineer work in Company!");
	}
}
