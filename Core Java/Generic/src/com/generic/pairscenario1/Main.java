package com.generic.pairscenario1;

public class Main {

	public static void main(String[] args) {
		 Pair<String, String> object=new Pair<String, String>("1","Hello");
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