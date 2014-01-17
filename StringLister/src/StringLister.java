import java.util.Collections;
import java.util.Vector;


public class StringLister {
	String[] names = { "Dan", "Joe", "Steve", "Helen", "Troy", "Eric", "Clark", "Natalie", "Marlene"};
	
	public StringLister(String[] moreNames) {
		Vector<String> list = new Vector<String>();
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		}
		
		for (int i = 0; i < moreNames.length; i++) {
			list.add(moreNames[i]);
		}
		
		Collections.sort(list);
		for (String name : list){
			System.out.println(name);
		}
		
	}
	
	public static void main(String[] args)  {
		StringLister lister = new StringLister(args);
	}
}
