package innerclass;
import innerclass2.*;

public class innerClassAssisted {
	private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		innerClassAssisted obj=new innerClassAssisted();
		innerClassAssisted.Inner in=obj.new Inner();  
		in.hello();  
	}
}		


