package singleton;

import java.util.HashMap;
import java.util.Map;

public class TestJava {

	public static void main(String[] args) {

		Map<String,Employee> map = new HashMap<>();
		Employee emp=new Employee();
		emp.setName("Sitansu");
		emp.setAge(27);
		map.put("emp", emp);
		
		Employee emp1=(Employee)map.get("emp");
		emp1.setName("test");
		emp1.setAge(12);
		
		
		Employee emp2=(Employee)map.get("emp");

		
		System.out.println(emp2.toString());
	}


}
