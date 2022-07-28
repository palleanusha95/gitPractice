object obj1 extends  App {
println("Hi, This is Anusha")
  val l=List(1,2,3,4,5,6)
  println(l.map(x=>x.toFloat))
  val a=Array("Anusha","Reddy","Palle")
  println(a.mkString("|"))
for(i<-a)
  if (i=="Reddy")
    {println("Data Engineer")}
  else {println("DE")}
  println("This is a very good example")
}
