package Math;

public class circles {
	double radious;
	double xcor;
	double ycor;
	public circles(double xc,double yc,double r){
		xcor=xc;
		ycor=yc;
		radious=r;
	
	}
	public String toString(){
		return "("+xcor+","+ycor+")";
		}
	public double getR(){
		return radious;
	}
	public double getArea(){
		return (Math.PI*radious*radious);
	}
	public double getCircumference(){
		return (Math.PI*2*radious);
	}
	public double getDiameter(){
		return (2*radious);
	}
//	public pointincircle(){
//		return OUTSIDE;
//	}
}
