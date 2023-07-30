package com.amarjeet.webservice.StreamAPI.Practical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API_1 {

	@GetMapping("/getMap")
	public String apiDemo() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		return "Using StreamAPI Map" + list.stream().map(e -> e + 5).collect(Collectors.toList());
	}

	@GetMapping("/getFilter")
	public String apiDemo1() {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		return "Using StreamAPI Filter" + list1.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

	}

	@GetMapping("/getMapEntry")
	public Map<Integer, String> getMapEntry() {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Amarjeet");
		map.put(102, "Sanjeet");
		map.put(103, "Hira");

		return map;

	}

	
	@GetMapping("/getTraversedMapEntry1")
	public Set<Integer> getMapEntry2()
	{
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "Amarjeet");
		map.put(102, "Sanjeet");
		map.put(103, "Hira");
		
		return map.keySet();
		
	}
	
	@GetMapping("/getTraversedMapEntry2")
	public Collection<String> getMapEntry3()
	{
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "Amarjeet");
		map.put(102, "Sanjeet");
		map.put(103, "Hira");
		
		return map.values();
		
	}
	
	@GetMapping("/getTraversedMapEntry3")
	public Set<Entry<Integer, String>> getMapEntry4()
	{
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "Amarjeet");
		map.put(102, "Sanjeet");
		map.put(103, "Hira");
		return map.entrySet();
	}
	
	@GetMapping("/getOperationMap")
	public Map<Integer, String> getMapEntry5()
	{
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "Amarjeet");
		map.put(102, "Sanjeet");
		map.put(103, "Hira");
		map.get("Accessing values: "+101);
		map.remove(103);
		map.replace(102, "sanjeet kumar");
		return map;
	}
	
	
	

}
