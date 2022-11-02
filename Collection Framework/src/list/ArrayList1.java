package list;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("Mango");
al.add("Apple");
al.add("Banana");
al.add("Grapes");
//System.out.println(al);
System.out.println("Fruits:\n"+al.get(1));
al.add(1,"Dates");
for(String fruit:al)
	System.out.println(fruit);

	}

}
