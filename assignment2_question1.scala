object takeHomeSalary extends App{
	
	def normalHoursPay (hours:Int) = hours*150
	def overTimePay (hours:Int) = hours*75
	def takeHomeSalary(normal_hours:Int, ot_hours:Int) = .9*( normalHoursPay(normal_hours) + overTimePay(ot_hours) )
	println(takeHomeSalary(40,20))
	

}
