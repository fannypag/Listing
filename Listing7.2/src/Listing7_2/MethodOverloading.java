package Listing7_2;

class MethodOverloading {

	public static void main (String args []) 
	{
		Overload Obj = new Overload(); 
		double result; 
		Obj .demo(10); 
		Obj .demo (10, 20); 
		result = Obj .demo(5.5);
		System.out.println("0/P : " + result); 
	}
}
