
object BestTicketPrice extends App{
  def noOfAttendees(tp:Int)=120+(15-tp)/5*20;
  def income(tp:Int)=noOfAttendees(tp)*tp;
  def cost(tp:Int)=500+3*noOfAttendees(tp);
  def profit(tp:Int)=income(tp:Int)-cost(tp:Int);
  println(profit(5),profit(10));
  println(profit(15));
  println(profit(20),profit(25),profit(30));
}
