package collections_types;
import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int roll;
	String name;
}

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //	Store only string in the arraylist	
		ArrayList<String> list1 = new ArrayList<String>();
		
		//	Store any object in the arraylist	
		ArrayList list2 = new ArrayList();
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "Mike";
		
		// List 1 
		list1.add("John");
		list1.add("Jennie");
		
		list2.add(2.0);
		list2.add("John");
		list2.add(s1);
		
		System.out.println("List1 is : "+list1);
		System.out.println("List2 is : "+list2);
		
		//	Pull out a string and display it
		String name = list1.get(1);
		System.out.println("name is : "+name);
		
		//	Pull out any value and display it
		Object o = list2.get(2);
		System.out.println("item is : "+o);
		
		// Update a List
		list1.set(0, "Wick");
		System.out.println("Updated Value in List1 is : "+list1.get(0));
		
		// Remove an element from the List
		list1.add("ToBeDeleted");
		System.out.println("Current List1 is : "+list1);
		list1.remove(2);
		System.out.println("New List1 is : "+list1);
		
		// Remove all elements
		//list1.clear();
		
		// Searching and sorting 
		// Searching 
		if(list1.contains("Jennie")) {
			System.out.println("Jennie is in the list");
		}
		
		// Iterate in an ArrayList - Method 1 : operator
		System.out.println("======Looping 1 ======");
		for(Object ob : list2) {
			System.out.println(ob);
		}
		
		// Iterate in an ArrayList - Method 2 size()
		System.out.println("======Looping 2======");
				for(int i=0;i<list1.size();i++) {
					System.out.println(list1.get(i));
				}
		// Iterate in an ArrayList - Method 3 Iterator()
				System.out.println("======Looping 3 ======");
				Iterator itr = list2.iterator();
				// Iterator<String> itr = list1.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
	}
}
