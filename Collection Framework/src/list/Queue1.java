package list;
import java.util.*;
import java.util.LinkedList;
public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Queue<String> q=new LinkedList<>();
Queue<String> q1 = new PriorityQueue<String>();
Queue<String> q = new LinkedList<String>();
q.add("Nowsheen");
q.add("Farhana");
q.add("Sneha");
q.add("Reshma");
q.add("Sumaiya");
q.add("Fathima");
System.out.println("The Names of the Students are:"+q);
System.out.println("Name of the Student who is in the top of the list:"+q.peek());
q.poll();
q.poll();
System.out.println("Students who are present for Today's Class:"+q);
}

}
