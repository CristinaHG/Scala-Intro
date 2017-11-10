
//Pattern matching

abstract class Shape
case class Circle(radius: Double) extends Shape
case class Square(side:Double) extends Shape
case class Triangle(base:Double,height:Double) extends Shape

def area(a:Shape)=a match{
  case Circle(r)=>3.14*r*r
  case Square(s)=>s*s
  case Triangle(b,h)=>(b*h)/2
  case _=> throw sys error("not expected shape")
}

val circle=Circle(3)
val square=Square(2)
val triangle=Triangle(2,3)

println(area(square))

/*
-----------------------
       Traits
-----------------------
 */

trait Tail {
  def wagTail { println("tail is wagging") }
}

abstract class Pet (var name: String) {
  def emitPetSounds  // abstract
  def ownerIsHome //abstract
  def askForFood= println("following you until you feed me")
}

class Cat(name: String) extends Pet (name) with Tail {
  def emitPetSounds { println("miaurr") }
  def ownerIsHome: Unit = println("meh, dont really care")
}

val dandy=new Cat("Dandy")
dandy.emitPetSounds
dandy.ownerIsHome
dandy.askForFood
dandy.wagTail


/*------------------
    FP funcions
------------------*/

val numberlist=List(1,2,3,4,5,6,7,8,9,10)
val tuplesList=List((1,2),(3,4),(5,6),(7,8))

//filter(p: (A) ⇒ Boolean)
numberlist.filter(_>5)
//find(p: (A) ⇒ Boolean)
numberlist.find(_>5)
//flatMap[B](f: (A) ⇒ GenTraversableOnce[B])
def getReals(i:Int)=List(i-1,i+1)
numberlist.flatMap(a=>getReals(a))

//reduce[A1 >: A](op: (A1, A1) ⇒ A1)
numberlist.reduce(_+_)
//fold[A1 >: A](z: A1)(op: (A1, A1) ⇒ A1)
numberlist.foldLeft(0)((x,y)=>x+y)
//aggregate[B](z: ⇒ B)(seqop: (B, A) ⇒ B, combop: (B, B) ⇒ B)
numberlist.aggregate(0)((x,y)=>x+y,(x,y)=>x+y)
//exists(p: (A) ⇒ Boolean)
numberlist.exists(_%2==0)
//forall(p: (A) ⇒ Boolean)
numberlist.forall(a=>a%2==0)

