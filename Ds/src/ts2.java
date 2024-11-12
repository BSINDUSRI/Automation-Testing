import java.util.TreeSet;

public class ts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> Employee = new TreeSet<>();
		Employee.add("William");
		Employee.add("Robert");
		Employee.add("Stewart");
		System.out.println(Employee);
		System.out.println("-----------------------------------");
		TreeSet<String> Department = new TreeSet<>();
		Department.add("IT");
		Department.add("Finance");
		Department.add("Marketing");
		TreeSet<String> Designation = new TreeSet<>();
		Designation.add("Developer");
		Designation.add("Tester");
		Designation.add("Manager");
		Department.addAll(Designation);
		System.out.println(Department);
		System.out.println("-----------------------------------");
		TreeSet<String> Training = new TreeSet<>();
		Training.add("Selenium Java");
		Training.add("Selenium c#");
		Training.add("Selenium Python");
		Training.descendingSet();
		System.out.println(Training);
		System.out.println("-----------------------------------");
		TreeSet<String> Platform = new TreeSet<>();
		Platform.add("Eclipse");
		Platform.add("Visual Code Editor");
		Platform.add("Sublime");
		Platform.add("PyCharm");
		System.out.println(Platform.first());
		System.out.println(Platform.last());
		Platform.remove("Sublime");
		System.out.println(Platform);
		System.out.println("-----------------------------------");
		TreeSet<String> TestingTools = new TreeSet<>();
		TestingTools.add("Selenium");
		TestingTools.add("QTP");
		TestingTools.add("JMeter");
		TestingTools.add("LoadRunner");
		System.out.println(TestingTools.size());
		System.out.println("Protractor is given tree set or not?" + TestingTools.equals("Protractor"));
		System.out.println("-----------------------------------");
		TreeSet<Integer> NumberFinding = new TreeSet<>();
		NumberFinding.add(1);
		NumberFinding.add(3);
		NumberFinding.add(5);
		NumberFinding.add(7);
		NumberFinding.add(9);
		NumberFinding.add(11);
		System.out.println(NumberFinding);
		for (int s : NumberFinding) {
			if (s < 7) {
				System.out.println(s);
			}
		}

		System.out.println("-----------------------------------");
		TreeSet<String> SearchFirst = new TreeSet<>();
		SearchFirst.add("Yahoo");
		SearchFirst.add("Google");
		SearchFirst.add("Binge");
		System.out.println(SearchFirst.first());
		SearchFirst.remove("Binge");
		System.out.println(SearchFirst);
		System.out.println("-----------------------------------");
		TreeSet<Integer> LowerValueSearch = new TreeSet<>();
		 LowerValueSearch.add(100);
		 LowerValueSearch.add(50);
		 LowerValueSearch.add(75);
		 LowerValueSearch.add(80);
		 LowerValueSearch.add(30);
		 LowerValueSearch.add(40);
		System.out.println( LowerValueSearch.lower(75)); 
		System.out.println("-----------------------------------");
		TreeSet<Integer> EliminateValue = new TreeSet<>();
		EliminateValue.add(100);
		EliminateValue.add(50);
		EliminateValue.add(75); 
		EliminateValue.add(80);
//		EliminateValue.remove(100);
		EliminateValue.pollLast();
		System.out.println(EliminateValue);
		System.out.println("-----------------------------------");
		TreeSet<Integer> FindSubSet = new TreeSet<>();
		FindSubSet.add(10);
		FindSubSet.add(15);
		FindSubSet.add(20);
		FindSubSet.add(25);
		FindSubSet.add(30);
		FindSubSet.add(35);
		System.out.println(FindSubSet.subSet(15, 25));
		System.out.println(FindSubSet);
	}

}
