package com.genric.swap;

public class Main {

	public static void main(String[] args) {
		 int[] arr = {8,22,6,3,5,9,65};
	        int a=1;
	        int b=5;
	        Number num= new Number();
	        num.swapElement(arr,a,b);
	        num.print(arr);
	}

}
class Number{
    public <E> void swapElement(int arr[],int i,int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void print(int aar1[]){
        for (int i = 0; i < aar1.length; i++) {
            System.out.println(aar1[i]);
        }
    }
}