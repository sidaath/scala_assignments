class account(id:String,accNumber:Int,balance:Double)
{
	var nic=id;
	var accountNumber=accNumber;
	var accountBalance=balance;
}

object Q4
{
	def main(args:Array[String])
	{
		println("  Overdraft-Total Balance-Interest");
		println("-------------------------------------\n");

		var account1=new account("x1",00001,500);
		var account2=new account("x2",00002,100000);
		var account3=new account("x3",00003,0);
		var account4=new account("x4",00004,-1250);
		var account5=new account("x5",00005,-72000);
		var account6=new account("x6",00006,-14000);
		val bank:List[account]=List(account1,account2,account3,account4,account5,account6);
		
		//Overdraft accounts
		print("Overdraft accounts   : ");
		var OverdraftList=overdraft(bank);
		OverdraftList.foreach(x=>print(x.accountNumber+"   "));

		//Total account balance
		var TotalBalance=balance(bank);
		print("\nTotal account balance       : "+TotalBalance.accountBalance);

		//Account balance after interest
		print("\nWith interest: ")
		var interestList=interest(bank);
		interestList.foreach(x=>print(x+" "));

		println("\n-------------------------------------");
	}

	val overdraft=(list:List[account])=>list.filter(x=>x.accountBalance<=0);
	val balance=(list:List[account])=>list.reduce((x,y)=>new account("S000",1000,x.accountBalance+y.accountBalance));
	val interest=(list:List[account])=>list.map(x=>(if(x.accountBalance>0) x.accountBalance*1.05d else x.accountBalance*1.01d));
}
