package list;
import java.util.*;
public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack();
boolean result=s.empty();
System.out.println("Is the Stack empty?"+result);
s.push(34);
s.push(56);
s.push(97);
s.push(67);
s.push(57);
s.push(46);
System.out.println("Elements in Stack:"+s);
result=s.empty();
System.out.println("Is the stack empty?"+result);
s.pop();
s.pop();
System.out.println("Elements in Stack:"+s);
int p=(int) s.peek();
System.out.println("Elements at top:"+p);
int se=s.search(34);
System.out.println("Location of34:"+se);

	}

}
