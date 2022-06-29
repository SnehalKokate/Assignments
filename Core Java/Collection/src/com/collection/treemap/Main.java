package com.collection.treemap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Long l1=Long.valueOf("1234567890");
        Long l2=Long.valueOf("2598741061");
        Long l3=Long.valueOf("7350025460");
        Long l4=Long.valueOf("9911221560");
        Contact c1=new Contact(l1,"Sneha","sneha@gmail.com",Gender.female);
        Contact c2=new Contact(l2,"Pratap","pratap@gmail.com",Gender.male);
        Contact c3=new Contact(l3,"Lara","lara@gmail.com",Gender.female);
        Contact c4=new Contact(l4,"Shlok","shlok@gmail.com",Gender.male);

        TreeMap<Long,Contact> treemap= new TreeMap<Long,Contact>(Collections.reverseOrder());
        treemap.put(l1,c1);
        treemap.put(l2,c2);
        treemap.put(l3,c3);
        treemap.put(l4,c4);
        System.out.println("All the key-Value pairs: ");
        //printing all key-value pairs
        for (Map.Entry<Long, Contact> entry: treemap.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
        //printings all the keys
        System.out.println("All the Keys: ");
        for (Map.Entry<Long, Contact> entry: treemap.entrySet()){
            System.out.println(entry.getKey());
        }
        System.out.println("All the Values: ");
//        printing all values
        for (Map.Entry<Long, Contact> entry: treemap.entrySet()){
            System.out.println(entry.getValue());
        }

	}

}

enum Gender{
    male,female;
}

class Contact{
    private Long phone_number;
    private String name;
    private String email;
    private Gender gender;

    public Contact(Long phone_number,String name,String email,Gender gender){
        this.phone_number=phone_number;
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    @Override
    public String toString() {
      
        return "name: "+name+" Phone no: "+phone_number+" email: "+email;
    }
}