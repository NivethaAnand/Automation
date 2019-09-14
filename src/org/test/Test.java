package org.test;

public class Test implements Bank1{

	@Override
	public void axis() {
		System.out.println("Axis");
		
	}

	@Override
	public void sbi() {
		System.out.println("SBI");
		
	}

	@Override
	public void icici() {
		System.out.println("ICICI");
		
	}

	@Override
	public void hdfc() {
		System.out.println("HDFC");
		
	}
	public static void main(String[] args) {
		Test t= new Test();
		t.axis();
		t.sbi();
		t.icici();
		t.hdfc();
	}

}
