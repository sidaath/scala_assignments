class account(id:String,accNumber:Int,balance:Double)
{
	var nic=id;
	var accountNumber=accNumber;
	var accountBalance=balance;
	def withdraw(amount:Double)=if(accountBalance>amount) accountBalance=accountBalance-amount else println("Your account balnce is insufficient");
	def deposit(amount:Double)=accountBalance=accountBalance+amount;
	def transfer(tacc:List[account],amount:Double)=
	{
		if(accountBalance>amount)
		{
			accountBalance = accountBalance-amount;
			tacc.head.accountBalance = tacc.head.accountBalance+amount;
		}
		else
		{
			println("Your account balnce is insufficient");
		}
	}	
}

object Q3
{
	def main(args:Array[String])
	{
		println("-------------------------------------");
		println("\t   Bank Tranfer");
		println("-------------------------------------\n");

		var account1=new account("S123",1000,25000);
		var account2=new account("S124",1001,10000);
		val bank:List[account]=List(account1,account2,account3);
		
		val x=find(1001,bank);
		account1.transfer(x,10000);

		println("Transferred  : "+account1.accountBalance);
		println("Received : "+x.head.accountBalance);
		println("\n-------------------------------------");
	}

	val find=(accountNumber:Int,list:List[account])=>list.filter(x=>x.accountNumber.equals(accountNumber));

}
