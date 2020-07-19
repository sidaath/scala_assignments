class rationalNumber(n:Int,d:Int)
{
	require(d>0,"d must be greater than 0");
    def numerator=n/gcd(n,d);
    def denominator=d/gcd(n,d);
    def this(n:Int)=this(n,1);
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    def neg=new rationalNumber(-this.numerator,this.denominator);
    override def toString= numerator+"/"+denominator;
}

object Q1
{
	def main(args:Array[String])
	{
		
		println("\tRational-->Negation");
		val rat1=new rationalNumber(7,11);
		val rat2=rat1.neg
		println("Number   : "+rat1);
		println("Negetion : "+rat2);

		println("\n-------------------------------------");
	}

}
