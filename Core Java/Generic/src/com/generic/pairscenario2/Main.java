package com.generic.pairscenario2;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		 Date date=new Date();
	        Pair<String, java.util.Date> object=new Pair<String,java.util.Date> ("1",date);
	        System.out.println("{"+object.getk()+"="+object.getv()+"}");
	}

}

class Pair<K,V>{
    private K k;
    private V v;

    public Pair(K k,V v){
        this.k=k;
        this.v=v;
    }
    public K getk() {
        return k;
    }
    public V getv() {
        return v;
    }

}
