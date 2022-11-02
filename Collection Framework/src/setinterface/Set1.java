package setinterface;
import java.util.*;
public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> ts=new TreeSet<String>();
ts.add("Delhi");
ts.add("Andaman");
ts.add("Mumbai");
ts.add("Kolkata");
ts.add("Delhi");
ts.add("Maharastra");
ts.add("Gujarat");
System.out.println("Tree Elememts are:");
for(String temp:ts)
{
	System.out.println(temp);
}
	}

}
