package list;
import java.util.*;
import java.util.LinkedList;
public class Queue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue q=new LinkedList();
System.out.println("The List of the Student's marks  is Empty:"+q.isEmpty());
	System.out.println("The Name of the Student is:Nowsheen");
	q.add(91);
	q.offer(87);
	q.add(79);
	q.add(97);
	q.add(90);
	System.out.println("The Students Marks are:"+q);
	for(int i=0;i<5;i++) {
	//	int total=q[i+1];
	int total=91+87+79+97+90;
	System.out.println("The total of the student is"+total);
	}
	q.remove();
	q.poll();
	System.out.println("The Students marks are:"+q);
	q.add(91);
	q.add(87);
	System.out.println("Studemts First Subject Mark is:"+q.peek());
	System.out.println("The Updated Marklist of the student:"+q);
	System.out.println("The List of the Student's marks  is Empty:"+q.isEmpty());

	}

}
