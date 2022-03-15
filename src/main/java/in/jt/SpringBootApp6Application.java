package in.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp6Application {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootApp6Application.class, args);
		
		System.out.println("Applicaiton :: main method");
		
		//dependent object
		//manually creating object for Address
		Address address = new Address();	//1010: cityName : null-> Hyderabad  stateName: null-> Telangana
		System.out.println("address: "+address);
		address.setCityName("Hyderabad");
		address.setStateName("Telangana");
		
		System.out.println("address: "+address);
		
		//Target object
		//manually creating object for Student
		Student student =  new Student();	//2020: sid: 0 sname: null address: null
		System.out.println("student: "+student);
		student.setSid(101);
		student.setSname("Ramchandra");
		
		//injection of dependent object to target object by using setter method
		student.setAddress(address);
		
		System.out.println("student: "+student);
	}

}
