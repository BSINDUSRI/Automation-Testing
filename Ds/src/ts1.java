import java.util.TreeSet;

public class ts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers=new TreeSet<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		System.out.println("Elements in the TreeSet"+numbers);
		numbers.remove(2);
		System.out.println("Elements in the TreeSet after removal:"+numbers);
		System.out.println("Size of the TreeSet:"+numbers.size());
		System.out.println("First element:"+numbers.first());
		System.out.println("Last element:"+numbers.last());
		System.out.println("Iterating over the TreeSet");
		for(int number:numbers) {
			System.out.println(number);
		}
	}

}
