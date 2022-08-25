import scala.io.StdIn.readInt
import scala.util.control.Breaks.break

object Q_5 extends App {
  println("Enter value:")
  var n =readInt()

  def addFunction(a:Int,b:Int):Int={
    if(a<1)
    {
      print("Total =" +b)
      break}
    else
    {
      if(a%2 ==0)
        addFunction(a-2,b+a)
      else
        addFunction(a-1,b)
    }
  }

  addFunction(n,0);
}
