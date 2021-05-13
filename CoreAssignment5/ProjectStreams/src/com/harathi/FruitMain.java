package com.harathi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class FruitMain {

	public static void main(String[] args) {
		ArrayList<Fruit> al = new ArrayList<>();
		al.add(new Fruit("Kiwi", 90, 50, "green"));
		al.add(new Fruit("Dragonfruit", 200, 10, "pink"));
		al.add(new Fruit("sapota", 200, 70, "brown"));
		al.add(new Fruit("mango", 300, 150, "yellow"));
		al.add(new Fruit("Strawberry", 30, 20, "pink"));
		
		
		//Fruit f1 = new Fruit ("apple",500,100,"red");// we can add by this method too
		//System.out.println(f1);
		for(Fruit name:al)    
		    System.out.println(name);
		
		
		System.out.println("Acoording to <less calories ");
		al.stream()
		.filter(t->(t.getcalories()<100))
		.collect(Collectors.toList())
		.forEach(t->System.out.println(t));
	
		System.out.println("\nSort according to color");
		al.stream()
		.sorted((p1,p2)->p1.color.compareTo(p2.color))
		.forEach(System.out::println);
		
		System.out.println("\nSort green color fruits sorted withprice in ascending");
		al.stream()
		.filter(t->t.color.equals("pink"))
		.forEach(t->System.out.println(t));
		
	}

}