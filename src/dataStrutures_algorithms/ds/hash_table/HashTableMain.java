package dataStrutures_algorithms.ds.hash_table;

public class HashTableMain {

	public static void main(String[] args) {
		HashTableOP table = new HashTableOP();
		
		table.set("nails", 100);
		table.set("title", 50);
		table.set("lumber", 80);
		table.set("bolts", 200);
		table.set("screws", 140);
		
		table.printHashTable();
		
		System.out.println("bolts : "+table.get("bolts"));
		System.out.println("lumber : "+table.get("lumber"));
		System.out.println("ram : "+table.get("ram"));
		
		System.out.println(table.getAllKeys());
		
	}

}
