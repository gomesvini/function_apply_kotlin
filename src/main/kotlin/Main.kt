data class Person(var name: String, var age: Int, var about: String){
    constructor() : this("", 0 , "")
}
fun main() {
    val vinicius = Person()
    val stringDescription = vinicius.apply {
        name = "Vinícius"
        age = 27
        about = "Support Analist Jr"
    }.toString()

    println(vinicius.toString())
}