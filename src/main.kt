fun main(){
    var nkima=Human("joy",30,65)
    println(nkima.weight)
    nkima.eat(4)
    println(nkima.weight)
    nkima.speak("hello, vinny")
    nkima.birthday()
    var juana=User("Juana","munduru","juana@gmail.com","0797838610","juana45")
    println(juana.firstName)
    println(juana.phoneNumber)


}
//1.Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-speak(speech: String) :Prints the string passed toit                (2
//points)
//-birthday( ) :Increments the human’s age by 1(2
//points)
//Create an instance of this human class and invoke all its functions

class Human( var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        weight+=foodWeight
        println("I am eating ${foodWeight}kgs of food")
        }

    fun speak(speech: String){
        println(speech)
    }
    fun birthday( ){
        age++
        println(age)
    }
    }

//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
//attributes
 data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){

   }


