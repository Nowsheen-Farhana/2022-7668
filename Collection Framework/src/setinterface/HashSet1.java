package setinterface;
import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> hs=new HashSet<String>();
hs.add("Delhi");
hs.add("Andaman");
hs.add("Mumbai");
hs.add("Kolkata");
hs.add("Delhi");
hs.add("Maharastra");
hs.add("Gujarat");
System.out.println("Tree Elememts are:");
for(String temp:hs)
{
	System.out.println(temp);
}
	}

}
