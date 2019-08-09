import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> obj= new ArrayList<String>(); 
		obj.add("Abi");
		obj.add("Leela");
		obj.add("Karthi");
		obj.add("Kathir");
		System.out.println("Original arraylist");
		for(String str : obj)
		System.out.println(str);
		obj.add(0,"Arthi");
		obj.add(2,"Sakthi");
		System.out.println("Arraylist after add");
		for(String str: obj)
		System.out.println(str);
		obj.remove("Leela");
		System.out.println("Arraylist after remove");
		for(String str:obj)
		System.out.println(str);	
	}

}
