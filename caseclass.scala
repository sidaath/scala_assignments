object caseclass extends App {

	case class Point (a: Int, b:Int) {
	
		def x: Int = a;
		def y :Int = b;

		def add ( p: Point) = Point (p.x + this.x, p.y+ this.y)
		def move ( dx: Int, dy:Int) = Point(this.x + dx, this.y+dy) 
		
		def distance (p:Point) = {
						val x1:Int = this.x;
						val x2:Int = p.x;
						val y1:Int = this.y;
						val y2:Int = p.y
						
						val x_vals_squared = math.pow((x1-x2),2);
						val y_vals_squared = math.pow((y1-y2),2);
						val sum_of_squared = x_vals_squared + y_vals_squared;
						
						val distance = math.sqrt(sum_of_squared);
						println(distance)
						}
	
		def invert (p:Point) = Point( this.y , this.x) 
	
	}

	
}
