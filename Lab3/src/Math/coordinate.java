package Math;

public class coordinate {


	public static void main(String[] args) {
		Cartesian x = new Cartesian(3,2);
		Cartesian y = new Cartesian(4,5);
		//Cartesian distance =new Cartesian(x,y);
		//System.out.println(x);
		//System.out.println(x.getX());
		//System.out.println(y);
	    //System.out.println(x.getDistance(y));
	

		circles xc = new circles(10,10,20);
		circles yc = new circles(20,10,30);
		System.out.println(xc);
		System.out.println(yc);
		System.out.println(xc.getArea());
		System.out.println(xc.getCircumference());
		System.out.println(xc.getDiameter());
	}

}
