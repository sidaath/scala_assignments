object optimalPrice extends App{


	def attendees (price:Int)=120+((15-price)/5)*20
	def income(price:Int)=attendees(price)*price
	def cost(price:Int)=500+3*attendees(price)
	def profit(price:Int)=income(price)-cost(price)
	println(profit(scala.io.StdIn.readInt()))

}