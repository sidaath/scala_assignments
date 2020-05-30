object final_price extends App {

	def shipping_cost (x : Int) = (((x%50)*.75)+((x/50)*150));
	def final_price (y: Int) = y*24.95*.6*shipping_cost(y); 

	println(final_price(60))
}
