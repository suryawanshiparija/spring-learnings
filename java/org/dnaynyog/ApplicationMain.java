package org.dnaynyog;



import org.dnyanyog.component.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	public class ApplicationMain {
	    public static void main(String[] args) {
	        // Spring run
	        ApplicationContext spring = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	        Student app = spring.getBean(Student.class); // Student class object created by SPRING

	        app.setFirstName("Parija");
	        app.getaddress().setCity("Pune");
	        System.out.println(app.getFirstName());
	        System.out.println(app.getaddress().getCity());

	        System.out.println("---------------------------------------");

	        Student std = new Student(); // JAVA
	        std.setFirstName("Parija");
	        std.getaddress().setCity("Pune");
	        System.out.println(std.getFirstName());
	        System.out.println(std.getaddress().getCity());
	    }
	}



