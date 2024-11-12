import java.util.TreeMap;

public class tm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> scores=new TreeMap<>();
		scores.put("Alice", 90);
		scores.put("Bob", 80);
		scores.put("Charlie", 95);
		scores.put("David", 87);
		scores.put("Eve", 92);
		System.out.println("Score of Alice:"+scores.get("Alice"));
		System.out.println("Score of Charlie:"+scores.get("Charlie"));
		System.out.println("Score of David:"+scores.get("David"));
		scores.put("Bob", 85);
		scores.remove("Eve");
		System.out.println("Scores in the TreeMap:");
		for(String name:scores.keySet()) {
			int score=scores.get(name);
			System.out.println(score);
		}
		

	}

}
