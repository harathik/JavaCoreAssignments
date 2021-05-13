package com.harathi;


public class PersistanceTest {

	public static void main(String[] args) {
		Persistance p = new FIlePersistence();
		p.persist();
		Persistance p1 = new DatabasePersistence();
		p1.persist();
		

	}

}
