package homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class main {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		acount c1=new acount(1100,"ali",001);
		acount c2=new acount(1500,"moha",002);
		acount c3=new acount(1200,"ghazale",003);
		acount c4=new acount(1500,"sara",001);
		acount c5=new acount(900,"hadi",002);
		
		//List<acount> accountlist=List.of(c1,c2,c3,c4,c5);
		List<acount> accountlist= new ArrayList<>();
		
		accountlist.add(c1);
		accountlist.add(c2);
		accountlist.add(c3);
		accountlist.add(c4);
		accountlist.add(c5);
		
		accountlist.forEach(t -> System.out.println(t.toString()));
		
		System.out.println("sorted!");
		Collections.sort(accountlist, (o1, o2) -> o1.compareTo(o2));
		
		//Collections.sort(accountlist);
		//Collections.sort(accountlist, new comper());
		
		/*Collections.sort(accountlist, new Comparator<acount>() {

			@Override
			public int compare(acount o1, acount o2) {
				// TODO Auto-generated method stub
				return o1.getBalanc()-o2.getBalanc();
			}
		});;*/
		
		accountlist.forEach(t -> System.out.println(t.toString()));
		Collections.reverse(accountlist);
		System.out.println("reverse!");
		accountlist.forEach(t -> System.out.println(t.toString()));
				
		List<acount> accountlist2= new ArrayList<>();
		List<acount> accountlist3= new ArrayList<>();
		List<acount> accountlist4= new ArrayList<>();
		List<acount> accountlist5= new ArrayList<>();
		
		
		
		for (acount acount :accountlist) {
			if (acount.getBranch()==1) {
				
				accountlist2.add(acount);
			}
			else if (acount.getBranch()==2) {
				accountlist3.add(acount);
			}
			else if (acount.getBranch()==3) {
				accountlist4.add(acount);
			}
			else{
				accountlist5.add(acount);
			}			
		}
	
		accountlist2.forEach(t -> System.out.println(t.toString()));
		accountlist3.forEach(t -> System.out.println(t.toString()));
		accountlist4.forEach(t -> System.out.println(t.toString()));
		
		Map<Integer,List<acount> > mymap=new HashMap<>();
		
		mymap.put(1, accountlist2);
		mymap.put(2, accountlist3);
		mymap.put(3, accountlist4);
		
		for (Map.Entry<Integer, List<acount>> entry : mymap.entrySet()) {
			Integer key = entry.getKey();
			List<acount> val = entry.getValue();
			
			System.out.println("key : "+key+" value : "+val);
		}
		
		accountlist.removeAll(accountlist3);
		accountlist.forEach(t -> System.out.println(t.toString()));
	
		List<String> name=Arrays.asList("ali","mohi","gha","sara","ahmad") ;
		List<String>ml=  name.stream().filter(t -> t.startsWith("a")).collect(Collectors.toList());
		ml.forEach(t -> System.out.println(t));
		
		
		List<acount>m2=  accountlist.stream()
				.filter(t -> t.getName().startsWith("a"))
				.collect(Collectors.toList());
		
		m2.forEach(t -> System.out.println(t));
		
		accountlist.forEach(t ->t.setName(t.getName().toUpperCase()) );
		
		accountlist.forEach(t -> System.out.println(t));
		
		
		List<acount>m3= accountlist.stream()
		.filter(t -> t.getBalanc()>1000)
		.filter(t -> t.getName()
		.startsWith("A"))
		.collect(Collectors.toList());
		
		
		m3.forEach(t -> System.out.println(t));
	
	}

}
