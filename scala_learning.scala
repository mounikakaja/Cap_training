// Databricks notebook source
// val , var
val variable1: String = "hello world!" 

// COMMAND ----------

var variable1_var : String = "hello worrllllldd 2"
variable1_var


// COMMAND ----------

var valuu1 = "hgello"

// COMMAND ----------

val variable1 = "hey"
 val variable1 = "hey" + "world!"

// COMMAND ----------

var value2 = 

// COMMAND ----------

var value2 = "hey"
value2= "hey" + "world!"

// COMMAND ----------

val var_byte : Byte = 126
val val_int : Int = 2


// COMMAND ----------

print(f"hello,$val_int")

// COMMAND ----------

//switch statement
var m: Int = 3
n match{}

// COMMAND ----------

//switch statement
var n: Int = 3
n match{
  case 1 => print("1")
  case 2 => print("2")
  case 3 => print("Holla found value 3")
  case _ => print("not found")
}

// COMMAND ----------

var a =2
if(a==2){
  println
  ("value 2")
}
else
{
  print("no value")
}

// COMMAND ----------

for ( i <- 1 to 4){
  println(i)
}

// COMMAND ----------

var wh = 4
while(wh <4)
{
  print(f"wh,$wh")
  wh =wh-1
}

// COMMAND ----------

/*function def <name>(argument : <Type>) Return datatype Int :{
commands
}
*/
def squareInt(x : Int): Int = {
  x * x
}
//calling function
squareInt(2)

// COMMAND ----------

def devFloat(x : Float , y : Float): Float = {
  x / y
}
devFloat(8.0f,16.0f)

// COMMAND ----------

def tableInt(x : Int): Int = {
  
}

// COMMAND ----------

var list1 = List("tushar","goyal")
list1.head

// COMMAND ----------

var dict = 1 -> "hello" 

dict._1

// COMMAND ----------

var List1 = List("tushar","goyal")
var List2 = List("sri","lakshmi")
List1++List2


// COMMAND ----------

var newlist = List(1,2,3,4,5)
newlist.filter( (x:Int) => x<5)

// COMMAND ----------

var newlist = List(1,2,3,4,5)
newlist.filter( (x:Int) => x!=3)

// COMMAND ----------

var liststring = List("hey","hello")
liststring.map( (x:String) => x.reverse )

// COMMAND ----------

var liststring = List("hey","hello")
liststring.map( (x:String) => x.length )

// COMMAND ----------

var newlist = List(1,2,3,4,5)
newlist.reduce( (x:Int, y:Int) => x+y )

// COMMAND ----------

var list6 = List("hey","tushar","class","is","boring")
list6.map( (x:String) => (x,1) )

// COMMAND ----------

var ss : Byte = 124
ss.toString


// COMMAND ----------

var list6 = List("hey","tushar","class","is","boring")
list6(0)
