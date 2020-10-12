import java.util.*;
public class Sun {

	public String planetName;
	public double planetDistance;
	public double planetGravity;
	
	public Sun() {
		
	}
	public Sun(String name, double distance, double gravity) {
		this.planetName=name;
		this.planetDistance=distance;
		this.planetGravity=gravity;
		
	}
	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}

	public double getPlanetDistance() {
		return planetDistance;
	}

	public void setPlanetDistance(double planetDistance) {
		this.planetDistance = planetDistance;
	}

	public double getPlanetGravity() {
		return planetGravity;
	}

	public void setPlanetGravity(double planetGravity) {
		this.planetGravity = planetGravity;
	}

	public void showDetails() {
		System.out.println("Planet name= "+planetName);
		System.out.println("Planet Distance= "+planetDistance);
		System.out.println("Planet Gravity= "+planetGravity);
	}
	
}
