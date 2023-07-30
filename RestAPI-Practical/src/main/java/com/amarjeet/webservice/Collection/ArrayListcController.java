package com.amarjeet.webservice.Collection;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayListcController {

	@GetMapping("/getList1")
	public ArrayList getArrayList() {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		return al;
	}

	@GetMapping("/traverseArrayList")
	public void getArrayList1() {
		ArrayList al = new ArrayList<>();
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(104);
		al.add(105);

		System.out.println("using for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("using for inhance for loop");
		for (Object i1 : al) {
			System.out.println(i1);
		}

		System.out.println("using forEach");
		al.forEach(e -> System.out.println(e));

		System.out.println("using iterator");
		Iterator<Object> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("using list iterator");
		ListIterator<Object> listItr = al.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		System.out.println("using stream api");
		((ArrayList) al.stream().collect(Collectors.toList())).forEach(e -> System.out.println(e));

	}
	
	@GetMapping("/listOperation")
	public Object listOperation()
	{
		ArrayList al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(null);
		al.add(null);
		
		
		al.set(5, "sanjeet");
		return al.get(1);
		
		
	}

}
