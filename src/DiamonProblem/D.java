package DiamonProblem;

public class D extends B implements C2,C{
	public  void callmethod() {
		this.method();
		super.method();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		C.super.method();
	}
	
	public void methodC2() {
		// TODO Auto-generated method stub
		C2.super.method();
	}
}
