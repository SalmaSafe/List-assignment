fun main(){
    evenName(mutableListOf("Sam","Ken","Tom","Tim","Ham","Seth","Sean","Dan","Bill","Jill"))
    println( height(listOf(3.0,9.8,7.9)))


    var sister = PersonObject("Verite",23,75)
    var brother  = PersonObject("Dave",27,80)
    var mother = PersonObject("Zeitun",33,60)

    var myPerson= listOf(sister,brother,mother)
    var mP=myPerson.sortedByDescending { person -> person.age }
    println(mP)


        var themOne = PersonObject("Judy", 19, 60)
        var themTwo = PersonObject("Susan", 25, 50)
        var ongeza = mutableListOf(themOne,themTwo)

        println(ongeza.plus(myPerson))

    var toyota=Car("KAA 001A",45.0)
    var ford=Car("KAB 001A",60.9)
    var Audi=Car("KCA 001A",51.2)
    var carr= listOf(toyota,ford,Audi)
    println(care(carr))






}


//Given a list of 10 strings, write a function that returns a list of the strings at even indices

fun evenName(nam:List<String>):List<String>{
    nam.forEachIndexed { index, i ->
        if (index % 2== 0){
            println(i)
        }
    }
    return nam

}
//Given a list of people's heights in meters.Write a function that returns the average height and the total
// height
fun height(hei:List<Double>):String {
    var sum = hei.sum()
    var elements = hei.average()
    var both = "$sum, $elements"
    return both
}
data class PersonObject(var name:String, var age:Int,var weight:Int){

}
fun person(second:List<Any>):List<Any>{
    return listOf()
}
//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)

data class Car(var registration:String,var mileage:Double)
    fun care(carz: List<Car>): Double {
        var total = 0.0
        carz.forEach { cars ->
            total += cars.mileage
        }
        return total / carz.count()
    }


