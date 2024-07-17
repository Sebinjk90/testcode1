package superkeyword;

public class Child extends Parent {
	int v;
	public Child()
	{
		super(123);
		//this.v=v;
		System.out.println("child class constructor");
	}
	
	public void childMethod()
	{
		System.out.println("child class method :");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.method();
		obj.childMethod();
		
		
	}

}
