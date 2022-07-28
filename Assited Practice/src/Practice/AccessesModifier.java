package Practice;
import Pack1.*;
import Pack2.*;
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 
class Privatel
{ 
   void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
}
public class AccessesModifier {

	public static void main(String[] args) {
		//default
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}

   public class  AccessesModifier1{
		
			public static void main(String[] args) {
				//private
				System.out.println("Private Access Specifier");
				Privatel obj =new Privatel();
				//obj.display();

}
public class AccessesModifier2 extends Protected {

	public static void main(String[] args) {
	        Protected obj = new Protected ();   
	        obj.display();  

	}
   
public class AccessesModifier3 extends Public{

		public static void main(String[] args) {
			
			Public obj = new Public(); 
	        obj.display();  
			
		}

}
}
}
}

