package annotationdemo;

import javax.swing.event.AncestorEvent;

public class MyMain {
public static void main(String[] args) {
	Demo d = new Demo();
	Class c = d.getClass();
	System.out.println(c.getName());
	
	MyAnnotation an = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
	
	
	
	System.out.println(an.myValue());
	System.out.println(an.myName());
	System.out.println(an.myCity());
}
}
