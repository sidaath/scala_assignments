class rationalNumber(n:Int,d:Int)
{
	require(d>0,"d must be greater than 0");
    def numerator=n/gcd(n,d);
    def denominator=d/gcd(n,d);
    def this(n:Int)=this(n,1);
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    def +(r:rationalNumber)=new rationalNumber(this.numerator*r.denominator + this.denominator*r.numerator,this.denominator*r.denominator);
    def neg=new rationalNumber(-this.numerator,this.denominator);
    def -(r:rationalNumber)=this+r.neg;
    override def toString= numerator+"/"+denominator;
}

object Q2
{
	def main(args:Array[String])
	{

		println("\t X-Y-Z ;");
		println("\n");

		val rat1=new rationalNumber(3,4);
		val rat2=new rationalNumber(5,8);
		val rat3=new rationalNumber(2,7);
		val rat4=rat1-rat2-rat3;
		println("X-Y-Z = "+rat4);


	}

}
