object caesar extends App {

	val E=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)

	val D=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)

	val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))


}