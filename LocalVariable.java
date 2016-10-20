public class LocalVariable{

static  int xValue = 0; // This variable is in the scope of the entire LocalVariable class It needs to be declared static to be used in other methods within the LocalVariable class

public static void main(String[]args){
	int yValue = 0;  //the scope of the yValue variable is limited to the main method
	for(int iVar = 1; iVar <= 5; iVar++){  		// iVar for loop
		System.out.println(" ");
		for(int aVar = 1; aVar <= iVar; aVar++){ 	// aVar for loop
			System.out.print(" " + aVar);
			xValue = aVar + 90; // This is in the scope of the aVar for loop
			yValue = aVar + 10;			
		}
		xValue = aVar; // This is outside the scope of the aVar for loop(compile error)
		yValue = aVar; // This is outside the scope of the aVar for loop(compile error)
		System.out.print("\n    This is xValue of aVar + 90 = " + xValue);
		System.out.print("\n    This is yValue of aVar + 10 = " + yValue);
		System.out.print("\n    after being assigned to the aVar but before being assigned to the iVar");
		xValue = iVar; // This is in the scope of the iVar for loop
		yValue = iVar + 5; // This is in the scope of the iVar for loop
	}	
	xValue = iVar; // This is outside the scope of the iVar for loop (compile error)	
	System.out.println("\n\nThis is xValue of iVar    :  " + xValue);
	System.out.println("This is yValue of iVar + 5: " + yValue);
}

}
