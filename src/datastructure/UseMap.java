package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> stateListOfUSA = new ArrayList<>();
		stateListOfUSA.add("NewYork");
		stateListOfUSA.add("Virginia");
		stateListOfUSA.add("Maryland");

		List<String> provinceListOfCanada = new ArrayList<>();
		provinceListOfCanada.add("Toronto");
		provinceListOfCanada.add("Alberta");
		provinceListOfCanada.add("Quebac");

		List<String> provinceListOfAustralia = new ArrayList<>();
		provinceListOfAustralia.add("Sydeny");
		provinceListOfAustralia.add("Melbourne");
		provinceListOfAustralia.add("perth");

		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		map.put("USA", stateListOfUSA);
		map.put("Canada", provinceListOfCanada);
		map.put("Australia", provinceListOfAustralia);

		for(Map.Entry<String,List<String>> entry:map.entrySet()){
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}


	}

}
