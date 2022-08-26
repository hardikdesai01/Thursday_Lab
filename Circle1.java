package com.proj1;
public class Circle1 {
	private static int count;  
	float center,radius;
	public Circle1(float c,float r) {
		this.center=c;
		this.radius=r;
		count++;
	}
	Circle1(){
		System.out.println("this a default constructor");  
		count++;
	}
void display() {
	System.out.println("Center:"+center+" "+"radius:"+radius);
}
	public static void main(String[] args) {
		Circle1 c1=new Circle1(11.2f,8.9f);
		Circle1 c2=new Circle1(15.0f,38.9f);
		c1.display();
		c2.display();
		Circle1 c3=new Circle1();
		System.out.print("Total Number of Instance: " + Circle1.count); 
		
	}

}
