package com.capg.shapes;

public class Main {
	 public static void main(String[] args) {
	        Shape l=new Line();
	        Shape r=new Rectangle();
	        Shape c=new Cube();
	        Shape s=new Square();
	        draw_All(l);
	        draw_All(r);
	        draw_All(c);
	        draw_All(s);
	    }
	    //just one method to call methods from four different classes
	    public static void draw_All(Shape obj){
	        obj.draw();
	    }
}
