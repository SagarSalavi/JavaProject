class Tester extends Employee 
{
	private static int TestCount=0;
    
	Tester(String name, double salary)
	{
        super(name, salary);
		TestCount++;
	}

	public int getTestCount()
	{
		return TestCount;
	}
}
