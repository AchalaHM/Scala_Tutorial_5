import scala.io.StdIn.readInt
import scala.util.control.Breaks.break

object Q_3 extends App {
  println("Enter value:")
  var n =readInt()

  def addFunction(a:Int,b:Int):Int={
    if(a<1)
    {
      println("Total =" +b)
      break}
    else
    {
      addFunction(a-1,b+a)
    }
  }

  addFunction(n,0);
}
