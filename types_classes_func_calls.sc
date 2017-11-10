
/*
----------------------------------
  LISTS
  - in lists all elements must be the same
----------------------------------
*/

var mylist=List(2,3,4)
//try to insert
mylist=0::1::mylist
println(mylist)

//concatenate Lists in mylist2
val mylist1=List(5,6,7,8)

val mylist2=mylist:::mylist1

//many operations defined on list:
//sortWith, exists,count, drop, dropRight,head,tail...
mylist2.sortWith(_>_)
mylist2.count(_>4)

/*
TUPLES - different type values inside
 */
val tuple1=(24,"Cristina")
tuple1._1
tuple1._2//access tuple fields

/*
SETS - by default collection.inmutable.Set
  mutable version can be used by importing:
  scala.collection.mutable.Set
*/
var cities=Set("Málaga","Granada","Córdoba")
cities+="Cádiz"
print(cities)

cities.count(_.startsWith("C"))
cities.filter(_.length==6)
cities.foreach(z=>print(z))
/*
MAPS- mutable and inmutable version
 */

var cars=Map[Int,String]()

cars+=(1996->"Frontera")

println(cars(1996))

//inmutable version:
// val cars=Map[Int,String](1996->"Frontera")



/*
----------------------------------
classes and special function calls
----------------------------------
 */
//
//class Person(ag:Int, nam:String){
//  private var _age:Int=ag //invisible fields
//  private var _name:String=nam
//
//  def age:Int=_age //getters
//  def name=_name
//
//  def age_=(newage:Int) = _age=newage
//  def name_=(newname:String) = _name=newname
//}
//
//val me=new Person(24,"Cristina")
//println(me.name+"\n")
//me.name="lola"
//println(me.name+"\n")

//
class Person(var ag:Int, var nam:String)
val me=new Person(24,"Cristina")
println(me.nam+"\n")
me.nam="lola"
println(me.nam+"\n")


//----special calls

//default params and without order!
class PersonDefault(var ag:Int=15, val nam:String="Unamed")
var medefault=new PersonDefault(nam="Lola")
println(medefault.ag + " "+ medefault.nam)


// for functions

def saySomething(someone: String="unamed",something:String="hi"): Unit={
  print(something+", "+someone +"!")
}
saySomething(something = "silly you")


// repeated args

  def upper(strings: String*): Seq[String]={
    strings.map((s:String)=>s.toUpperCase)
  }

upper("hello", "you","thanks","for","comming")

upper("hi","Leo")


