import scala.io.StdIn.readInt

object Q_4 extends App {
  def IsOdd(a :Int):Unit={
    var b = a-2;
    if(b==0)
    {
      println("Even Number")
    }
    else if(b<2)
    {
      println("Odd  Number")
    }
    else{
      IsOdd(b);
    }
  }

  print("Enter a value:")
  var n=readInt()
  IsOdd(n);
}
