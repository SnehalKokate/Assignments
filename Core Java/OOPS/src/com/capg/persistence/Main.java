package com.capg.persistence;

public class Main {

	public static void main(String[] args) {
		Persistence obj= new Persistence() {
            @Override
            void persist() {
                System.out.println("calling it");
            }
        };
        obj.persist();

	}

}
