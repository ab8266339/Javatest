package Math;

public class Cartesian {
	double xco;
	double yco;
	double xdif;
	double ydif;
	public Cartesian(double x, double y){
		xco=x;
		yco=y;
		
	}
	public String toString(){
		return "("+xco+","+yco+")";
	}
	public double getX(){
		return xco;
	}
	public double getY(){
		return yco;
	}
	public double getDistance(Cartesian dif){
		xdif=dif.getX()-xco;
		ydif=dif.getY()-yco;
		return Math.hypot(xdif, ydif);
		//return Math.sqrt(xco+yco);
	}
	

}
