import java.util.*;

public class Rectangle {
	double area,length,height,perimeter;
	
	Rectangle(){}
	void areaRectangle() {
	area=length*height;
	System.out.println("Area of rectangle= "+area);
	}
	Rectangle(double ln,double wd) {
		this.length=ln;
		this.height=wd;
		
	perimeter=(length+height)*2;
	System.out.println("Perimeter of rectangle= "+perimeter);
	}
	
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	Rectangle r1=new Rectangle();
	System.out.println("Enter length");
	r1.length=sc.nextDouble();
	System.out.println("Enter height");
	r1.height=sc.nextDouble();
	r1.areaRectangle();
	Rectangle r2=new Rectangle(r1.length,r1.height);

	
}
}
