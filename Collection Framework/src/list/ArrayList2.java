package list;
import java.util.*;
import java.util.Scanner;
public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> al=new ArrayList<Integer>(); 
Scanner scan=new Scanner(System.in);
int i;
if(al.isEmpty()) {
System.out.println("Specified size:");
int size=scan.nextInt();
System.out.println("Enter the Elememts");
for(i=0;i<size;i++) {
al.add(scan.nextInt());
	System.out.println(al.get(i));
}
	}
	}
}
