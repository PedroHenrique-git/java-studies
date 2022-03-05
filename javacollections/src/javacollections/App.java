package javacollections;
import java.util.*;

public class App {
	public static void main(String args[]) {
		ArrayList<String> lista = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		
		lista.add("Pedro");
		lista.add("Luiz");
		lista.add("Paulo");
		
		linkedList.add("Simone");
		linkedList.add("Anderson");
		linkedList.add("Carlos");
		
		System.out.println();
		
		lista.forEach(item -> System.out.println(item));
		
		Collections.shuffle(lista);
		
		System.out.println();
		
		lista.forEach(item -> System.out.println(item));
		
		System.out.println();
		
		linkedList.forEach(item -> System.out.println(item));
		
		System.out.println(linkedList);
		
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(4);
		set.add(5);
		set.add(5);
		set.add(6);
		set.add(10);
		set.add(9);
		
		System.out.println(set + ", " + set.contains(57));
		
		System.out.println();
		
		set.forEach(item -> System.out.println(item));
		
		linkedHashSet.add(10);
		linkedHashSet.add(11);
		linkedHashSet.add(12);
		linkedHashSet.add(13);
		linkedHashSet.add(14);
		linkedHashSet.add(15);
		
		linkedHashSet.forEach(item -> System.out.println(item));
	
		System.out.println();
		
		for(Integer num : linkedHashSet) {
			System.out.println(num);
		}
		
		Iterator<Integer> it = linkedHashSet.iterator();
		
		System.out.println();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Conta 1", 123123);
		map.put("Conta 2", 456456);
		map.put("Conta 3", 789789);
		
		System.out.println();
		
		Properties config = new Properties();
		
		config.setProperty("database.login", "root");
		config.setProperty("database.password", "");
		config.setProperty("database.host", "jdbc:mysql://localhost/test");
	
		String login = config.getProperty("database.login");
		String password = config.getProperty("database.password");
		String host = config.getProperty("database.host");
	
		System.out.println(login + " " + password + " " + host);
	}
}
