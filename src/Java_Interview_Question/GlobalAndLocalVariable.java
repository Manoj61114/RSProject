package Java_Interview_Question;

//Global variable : We are not able to access through out of class.
// Global variable : We are able to access outside of the class 
// if global variable is final, We are not able to change the value of final keyword.
// we are not able to access local variable outside the method.
// we can use only inside the method local variable.


public class GlobalAndLocalVariable {
static int i = 10;
int j = 100;
final int k =10;


public static void main(String[] args) {
	i=30;  // We are able to change the value of static variable
	System.out.println("Static variable : "+i);
//	=================================================================
	GlobalAndLocalVariable  obj =  new GlobalAndLocalVariable();
	obj.j =20;
	System.out.println("Non Static Variable : "+obj.j);
	//=============================================================
	// obj.k = 50; // We are not able to change the value of variable which is defined by final keyword.
	
	System.out.println("Final Instance Veriable : "+obj.k);
	//obj.mm=100; we are not able to access local variable outside the method.
	 
	}

public  void vari()
{  // We can not declare static variable inside the method.
	// We can declare the final keyword variable inside the method.
		
	final int mm = 10;
//	mm= 20;  // we can not change the value of variable when it is defined by final keyword.
	
}
}
