Class StaticVariableTest
{
	static int x=10;
    int y = 20;

    public Static Void main(String args[])
	{
		StaticVariableTest t1= new StaticVariableTest();
		t1.x=888;
		t1.y=999;

		StaticVariableTest t2= new StaticVariableTest();

		System.Out.Println(t2.x+ "....." + t2.y);
	}
}