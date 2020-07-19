object AddtoN extends App {

	def recursiveSum(x: Int): Int = {
		if (1 < x) {
		x + recursiveSum(x-1)
	}
    	else 1
}

	println(recursiveSum(5))

}