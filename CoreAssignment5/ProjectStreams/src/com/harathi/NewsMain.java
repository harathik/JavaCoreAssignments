package com.harathi;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class NewsMain {

	public static void main(String[] args) {
		ArrayList<News> al = new ArrayList<>();
		al.add(new News(22,"harathi","hayathi","evarything is good"));
		al.add(new News(23,"nayani","vishal","IPL"));
		al.add(new News(23,"madhu","radha","covid started again"));
		al.add(new News(22,"uday","pooja","exams postponed"));
		al.add(new News(22,"akhil","syama","lockdown laid in many sates"));
		al.add(new News(22,"bharathi","ramakrishna","capgemini Started tarining for freshers"));
		
		
		int  p=al.stream()
				.min((p1,p2)-> {
					return (int) p1.getnewsId()+p2.getnewsId();
					}).get().getnewsId();
			 System.out.println(p);
			 
		
			 al.stream()
				.filter(t->t.comment.contains("budget"))
				.forEach(t->System.out.println(t)); 
			
			 System.out.println("\nwhich user has posted maximum comments");
			 	String  n=al.stream()
				.max((p1,p2)-> {
					return (int) p1.getcommentByUser().compareTo(p2.getcommentByUser());
					}).get().getcommentByUser();
			 	System.out.println(n);
			 	
			 	
			 	System.out.println("\ncommentByUser wise number of comments");
				al.stream()
				.sorted((p1,p2)->p1.getcommentByUser().compareTo(p2.getcommentByUser()))
				.collect(Collectors.toList())
				.forEach(t->System.out.println(t.commentByUser+"="+t.comment));
				
		

	}

}
