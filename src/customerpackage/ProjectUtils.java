package customerpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class ProjectUtils {	
	
	public static void diplayByprojectId(Map<Project, Employee> map){
		
	SortedMap<Project, Employee> sortedmap = new TreeMap<Project,Employee>(map);
	
	sortedmap.entrySet().stream().forEach(t->System.out.println(t));
	}
	
	public static void displayByProjectDomain(Map<Project,Employee> map){
		
		
		Comparator<Project> projectcomparator = new Comparator<Project>() {

			@Override
			public int compare(Project o1, Project o2) {
				// TODO Auto-generated method stub
				return o1.getDomain().compareTo(o2.getDomain());
			}
		};
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(projectcomparator)).forEach(t->System.out.println(t));
	}

	public static void main(String[] args) throws ParseException {
		
		Employee e1 = new Employee(1, "madhuri", 20.000, "madhuri@gmail.com");
		
		Employee e2 = new Employee(2, "krishna", 30.000, "krishna@gmail.com");
		
		Employee e3 = new Employee(5, "kushma", 40.000, "kushma@gmail.com");
		
		Employee e4 = new Employee(3, "srinivas", 50.000, "srinivas@gmail.com");
		
		Employee e5 = new Employee(4, "mamatha", 60.000, "mamatha@gmail.com");
		Employee e6 = new Employee(8, "chinnu", 60.000, "chinnu@gmail.com");
		Employee e7 = new Employee(6, "madhu", 60.000, "madhu@gmail.com");
		Employee e8 = new Employee(13, "kushu", 60.000, "kushu@gmail.com");
		Employee e9 = new Employee(11, "srinu", 60.000, "srinu@gmail.com");
		Employee e10 = new Employee(7, "mamu", 60.000, "mamu@gmail.com");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Project p1 = new Project(1, "java", sdf.parse("04-01-2020") , sdf.parse("08-05-2020"));		
		Project p2 = new Project(2, "php", sdf.parse("05-06-2020") , sdf.parse("05-08-2020"));		
		Project p3 = new Project(4, ".net", sdf.parse("04-03-2020") , sdf.parse("08-05-2020"));		
		Project p4 = new Project(5, "rooby", sdf.parse("05-02-2020") , sdf.parse("07-05-2020"));		
		Project p5 = new Project(3, "spring", sdf.parse("07-01-2020") , sdf.parse("09-05-2020"));		
		Project p6 = new Project(3, "asp.net", sdf.parse("07-03-2020") , sdf.parse("09-05-2020"));
		Project p7 = new Project(3, "javascript", sdf.parse("08-01-2020") , sdf.parse("10-05-2020"));
		Project p8 = new Project(3, "html", sdf.parse("10-03-2020") , sdf.parse("09-05-2020"));
		Project p9 = new Project(3, "css", sdf.parse("05-01-2020") , sdf.parse("10-05-2020"));
		Project p10 = new Project(3, "Ajax", sdf.parse("07-01-2020") , sdf.parse("09-05-2020"));
		
		Map<Project, Employee> empmap = new HashMap<Project, Employee>();		
		empmap.put(p1, e1);		
		empmap.put(p2, e2);		
		empmap.put(p3, e3);
		empmap.put(p4, e4);
		empmap.put(p5, e5);
		empmap.put(p6, e6);
		empmap.put(p7, e7);
		empmap.put(p8, e8);
		empmap.put(p9, e9);
		empmap.put(p10, e10);
		
		Set<Map.Entry<Project, Employee>> entryset = empmap.entrySet();
		
		Iterator<Map.Entry<Project, Employee>> itr = entryset.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry<Project, Employee> entry = itr.next();
			
			System.out.println(entry);
		}
		ProjectUtils pu1 = new ProjectUtils();
		System.out.println("displaybyprojectbyId:-------");
		pu1.diplayByprojectId(empmap);
		System.out.println("displaybyprojectbyDomain:-------");
		pu1.displayByProjectDomain(empmap);
		

	}

}
