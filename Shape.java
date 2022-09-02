package com.proj1;


abstract class Shape {
	    private String color;
	    private boolean filled;

	    public Shape() {
	        color = "green";
	        filled = true;
	    }

	    public Shape(String color, boolean filled) {
	        this.color = color;
	        this.filled = filled;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public boolean isFilled() {
	        return filled;
	    }

	    public void setFilled(boolean filled) {
	        this.filled = filled;
	    }

	    @Override
	    public String toString() {
	        return "A Shape with color of " + color + " and " + (filled ? "" : "Not ") + "filled.";
	    }
	    
	    
	    abstract double getArea();

		public static void main1(String[] args) {
//			Shape s1=new Shape();
//			System.out.println(s1);
			
			Square sq=new Square();
			if(sq.length == sq.width) {
				System.out.println("The rectangle class is square");
			}
			
		}
	}
	class Circle extends Shape{
		double getArea() {
			return 0;
		}
	}
	class Rectangle extends Shape{
		int length;
		int width;
		Rectangle(int length,int width){
			this.length=length;
			this.width=width;
		}
		double getArea() {
			return 0;
		}
	}


	class Square extends Rectangle{
		Square(){
			super(10,10);
			System.out.println("length: "+super.length);
			System.out.println("width: "+super.width);
		}
	}
	       