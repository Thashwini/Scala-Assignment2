
object TakeHomeSalary extends App{
  def normalHourPayment(x:Int)=x*150;
  def otHourPayment(x:Int)=x*75;
  def income(x:Int,y:Int)=normalHourPayment(x)+otHourPayment(y);
  def tax(x:Int,y:Int)=income(x,y)*0.1;
  def salary(x:Int,y:Int)=income(x,y)-tax(x,y);
  println(salary(40,20));
}

