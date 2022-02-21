package com.upcastinganddowncasting;

public class UpcastingAndDowncasting {
	public static void main(String[] args) {
		Base s = new Child();
		s.show(new BaseService());
		
		Child c = new Child();
		c.show(new BaseService());
	}
}

class BaseService{}
class ChildService extends BaseService{}

class Base{
	public void show(BaseService service) {
		System.out.println("In Base");
	}
}
class Child extends Base{

	@Override
	public void show(BaseService service) {
		super.show(service);
	}
	
	public void show(ChildService service) {
		System.out.println("In Child");
	}
}



