import java.util.*;
public class SunTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Sun marse=new Sun("Marse",150000.0,15400.0);
		marse.showDetails();
		
		Sun earth= new Sun();
		System.out.println("Enter the name of planet");
		earth.planetName=sc.nextLine();
		System.out.println("Enter the Distance of planet");
		earth.planetDistance=sc.nextDouble();
		System.out.println("Enter the Gravity of planet");
		earth.planetGravity=sc.nextDouble();
		earth.showDetails();
		
		Sun pluto= new Sun();
		pluto. setPlanetName("pluto");
		pluto. setPlanetDistance(8000000.0);
		pluto. setPlanetGravity(54231.00);
		pluto.showDetails();
		
		
		
		
		
		
		

	}

}
