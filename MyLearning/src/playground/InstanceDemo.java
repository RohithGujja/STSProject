package playground;

public class InstanceDemo {
	{
		System.out.println("Instance Block");
	}
	
	static {
		System.out.println("Static Block");
	}
	
	InstanceDemo() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		InstanceDemo d1 = new InstanceDemo();
        d1.print(1);
        System.out.println("Main Method");
        InstanceDemo d2 = new InstanceDemo();
        d2.print(2);
    }
	
	public void print(Integer i) {
		System.out.println("Print Method: "+i);
	}
}
