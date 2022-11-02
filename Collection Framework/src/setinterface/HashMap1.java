package setinterface;
import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> hm=new HashMap<>();
hm.put(101,"Nowsheen");
hm.put(102, "Sneha");
hm.put(103,"Reshma");
hm.put(104,"Poornima");
hm.put(105,"Nivi");
hm.put(106,"Brindha");
hm.put(106,"Farhana");
System.out.println("List of the Employee's Id and Employee's Name...."+hm);
hm.remove(105);
System.out.println("Updated list of the Employee's"+hm);
hm.putIfAbsent(105,"Nivedha");
System.out.println("After using putIfAbsent() Method"+hm);
hm.put(107,"Preetha");
hm.putAll(hm);
System.out.println("After using putAll() Method"+hm);
	}

}
