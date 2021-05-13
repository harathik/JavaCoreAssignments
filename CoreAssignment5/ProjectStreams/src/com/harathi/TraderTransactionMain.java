package com.harathi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TraderTransactionMain { 
	public static void main(String[] args) {
	Trader Harathi  = new Trader("Harathi","Vijayawada");
	Trader Bharathi  = new Trader("Bharathi","Vizag");
	Trader Ramya  = new Trader("Ramya","Srikakulam");
	Trader Harika  = new Trader("harika","nellore");
	Trader Dinesh  = new Trader("Dinesh","anatapur");
	Trader Yamini  = new Trader("Yamini","Guntur");
	 	 
	List<Transaction> transactions = Arrays.asList(
			new Transaction(Harika,2011,300),
			new Transaction(Harathi,2012,1000),
			new Transaction(Harathi,2011,400),
			new Transaction(Bharathi,2012,710),
			new Transaction(Bharathi,2012,930),
			new Transaction(Ramya,2012,850),
	        new Transaction(Yamini,2012,1200),
	        new Transaction(Dinesh,2012,2000));
	
	
	List<Transaction> result1 = transactions.stream()
			 .filter( (t)->t.getYear()==2011)
			 .sorted(Comparator.comparing(Transaction::getValue))
			.collect(Collectors.toList()); 
	result1.forEach(System.out::println);
	
	
	List<String> result = transactions.stream()
			 .map(Transaction::getTrader)
			 .map(Trader::getCity)
			 .distinct()
			.collect(Collectors.toList());
	result.forEach(System.out::println);
	
	
	List<Trader> result2 = transactions.stream()
			 .map(Transaction::getTrader)
			 .filter((t)->("Vizag").equals(t.getCity()))
			 .distinct()
			 .sorted(Comparator.comparing(Trader::getName)) 
			.collect(Collectors.toList());
	result2.forEach(System.out::println);
	
	
	String allName = transactions.stream()
			 .map((t)->t.getTrader().getName())
			 .sorted() 
			 .reduce(" ",(a,b)->a+" "+b); 
	System.out.println(allName);
	
	
	boolean flag = transactions.stream()
			 .map(Transaction::getTrader)
			 .anyMatch(t->t.getCity().equals("Nellore"));
	 System.out.println("Is there any traders from Nellore? "+flag);
	 
		 Integer sum = transactions.stream()
				.filter(t->t.getTrader().getCity().equals("Vijayawada"))
				 .map(Transaction::getValue)
				 .reduce(0, (a,b)->a+b);
		 System.out.println("All transactions for traders living in Vijayawada: "+sum);
		 
		 
		 List<Integer> list = transactions.stream()
				 .sorted(Comparator.comparing(Transaction::getValue).reversed())
				 .map(Transaction::getValue)
				 .limit(1)
				.collect(Collectors.toList());
		 System.out.println("In all transactions, the highest transaction amount is "+list.get(0));
		 
	
		 Optional<Integer> min = transactions.stream()
				 .map(Transaction::getValue)
				 .reduce(Integer::min);
		 System.out.println("In all transactions, the minimum transaction amount is "+min.get());
		
	}
}