object addEvenNum extends App{

    def isEven(x:Int):Boolean=x match{
      case 0 =>true
      case _ => isOdd(x-1)
    };

    def isOdd(x:Int):Boolean= !(isEven(x));

    def add(y:Int):Int={
      if(y==0) 0
     else if(isEven(y)==true) y+add(y-1)
      else add(y-1)
    }
    println(add(scala.io.StdIn.readInt()));
}