package practice_03_09_2022;

import java.util.*;

public class TestCollectionMap {
	public static void main(String[] args) {
		/*
		 * A map is a container object that stores a collection of key/value pairs.
		 * It enables fast retrieval, deletion, and updating of the pair through the key.
		 * A map stores the values along with the keys.
		 * The keys are like indexes.
		 * In List, the indexes are integers. In Map, the keys can be any objects.
		 * A map cannot contain duplicate keys. Each key maps to one value.
		 *
		 * HashMap >> not insertion ordered
		 *
		 * LinkedHashMap >> insertion ordered
		 *
		 * TreeMap >> sorted
		 *
		 * map.put(K key, V value)
		 * map.remove(Object key)
		 * map.containsKey(Object key)
		 * map.containsValue(Object value)
		 * map.isEmpty()
		 * map.size()
		 *
		 * The java.util.HashMap.entrySet() method in Java is used to create a set out
		 * of the same elements contained in the hash map. It basically returns a set
		 * view of the hash map or we can create a new set and store the map elements
		 * into them.
		 */

		Map<String, String> map = new LinkedHashMap<>();

		map.put("city", "paris");
		map.put("animal", "cat");
		map.put("country", "UK");
		map.put("team", "cowboys");
		map.put("animal", "dog");
		map.put("pet","dog");

		System.out.println(map);

		map.remove("animal");
		System.out.println(map);

		if (map.containsKey("team")) {
			System.out.println("There is team in key");
		}

		System.out.println(map.size());

		Map<String, String> map2 = new HashMap<>();

		map2.put("city", "paris");
		map2.put("animal", "cat");
		map2.put("country", "UK");
		map2.put("team", "cowboys");
		map2.put("animal", "dog");

		System.out.println(map2);

		map2.remove("animal");
		System.out.println(map2);

		System.out.println(map2.get("country"));

		if (map2.containsKey("team")) {
			System.out.println("There is team in key");
		}

		System.out.println(map2.size());


		System.out.println("==================================");




//  ===============================================================

		Map<Character, String> connect = new HashMap<>();
		connect.put('a', "a");
		connect.put('c', "C");
		connect.put('z', null);
		connect.put('y', "yz");
		connect.put('y', connect.get('c'));
		System.out.println(connect.get('z') + connect.get('y') + connect.get('a'));

		System.out.println("===============================");
//  ===============================================================

		Map<Integer, String> map4 = new HashMap<>();
		map4.put(1, "a");
		map4.put(2, "b");
		map4.put(3, "c");
		map4.put(4, "d");
//		for (Integer key : map4) {
//			if (key % 2 == 0) {
//				System.out.print(map4.get(key));
//
//			}
//		}


		// using for-each loop for iteration over Map.entrySet()
		for (Map.Entry<Integer,String> entry : map4.entrySet()) {
//			System.out.println("Key = " + entry.getKey() +
//					", Value = " + entry.getValue());
			if (entry.getKey() % 2 == 0) {
				System.out.println(entry.getValue());
			}
		}
		}
	}
