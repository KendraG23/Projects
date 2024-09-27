package Pentagon;



public class Pentagon {
	private double radius;
	private double sideLength;
	
	public Pentagon() {
		
	}
/*Constructor that accepts a radius parameter.
* method will also call another method to calculate Side length of object
*/
	public Pentagon(double radius) {
		this.radius = radius;
		sideLength = getSide(this.radius);
	}
/*	getSide will calculate the side of object based on the 
 *  radius supplied during the instance of new object.  The side
 *  will be saved to sideLength variable.
 */
	public double getSide(double radius) {
		double sideLength = 2*radius*Math.sin(Math.PI/5);
		return sideLength;
	}
/*	getArea will calculate area of pentagon and return a value.
 * 	
 */
	public double getArea() {
		double area = (5*Math.pow(sideLength, 2))/ (4 * Math.tan(Math.PI/5));
		return area;
	}
	public void setRadius(double radius) {
		this.radius = radius;
		
	}
}
