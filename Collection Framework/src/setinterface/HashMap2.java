package setinterface;
import java.util.*;
public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> m=new HashMap<String,Integer>();
m.put("Mike",4567891);
m.put("Nina",1424541);
m.put("Daniel",45678977);
m.put("Usman",14712314);
	System.out.println("The Map before remove method :");
	System.out.println("\t"+m);
	System.out.println("\n");
	System.out.println("Enter a key from:(Mike,Nina,Dniel,Usman)");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	m.remove(s);
	System.out.println("The Map after remove method");
	System.out.println("\t"+m);
	}

}
