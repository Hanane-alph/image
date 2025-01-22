package com.neotech.review11;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EnglishSpanishDictionary {

	public static void main(String[] args) {
	Map<String, String> dictionary= new TreeMap<>();
		dictionary.put("home", "casa");
	    dictionary.put("donkey", "burro");
	    dictionary.put("flag", "bandera");
	    dictionary.put("cat", "gato");
	    dictionary.put("banner", "bandera");
		System.out.println("map: "+dictionary);
		
		// {} its a MAP entries
		// SET--> no duplicates
		// List--> insertion order is preserved
		Set<String> englishwords=dictionary.keySet();
		System.out.println("key--> "+ englishwords);
		Collection<String> spanishwords=dictionary.values();
		System.out.println(" value--> "+ spanishwords);
		
		Set<Entry<String,String>>entries=dictionary.entrySet();
		System.out.println("entries--> "+ entries);
		// []set entries
		System.out.println(" =================================");
		// Advanced- enhanced-for-each loop
		for(Entry<String, String > pair: entries) {
			System.out.println(pair);
		
		String k=pair.getKey();
		String v= pair.getValue();
		System.out.println(k+"-->"+v);
		
		}
		System.out.println("==================================");
		// TASL. ITERATE THE ENTRIES AND PRINT BY USING ITERATOR
		Iterator< Entry<String,String>>it= entries.iterator();
		while(it.hasNext()){
			Entry<String, String> pair=it.next();
		System.out.println(pair.getKey()+" $$$$$$ "+pair.getValue());
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
