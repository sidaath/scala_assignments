object AddPrimes extends App {  
def gcd(x:Int,y:Int):Int=y match{
    case 0 =>x
    case y if y>x => gcd(y,x)
    case _ => gcd(y,x%y)
  }
  def prime(p:Int,q:Int=2): Boolean=q match{
    case q if(q==p) => true
    case q if gcd(p,q)>1 =>false
    case q => prime(p,q+1)
  }
  
  var sum: Int = 0; 
  def primeSeq ( z:Int) = {

	if( prime(z) == true){
		sum= z + primeSeq(z-1)
	}
	
}
}