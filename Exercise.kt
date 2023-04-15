//Ejercicio 1 Println y print
fun main()
{
    printear()
    println("============================")
    usoVariable()
    println("============================")
    usoVariableDouble()
    println("============================")
    omitirTipo()
    println("============================")
    varVariable()
    println("============================")
    var saludoFun = Saludo()
    println(saludoFun)
    println("============================")
    println(Saludo2("15", 5))
}

fun printear():Unit
{
    println("Tuesday")
    println("Thursday")
    println("Wednesday")
    println("Friday")
    println("Monday")
    print("Hola Esto es una prueba ")
    print("Sin Salto de linea")
    println(" ")

}
//Ejercicio 2 Variables y concatenar
fun usoVariable() {
    val numero: Int = 2
    val numero2: Int = 4
    println("la suma de $numero y $numero2 es ${numero+numero2}")
}
fun usoVariableDouble() {
    val numero: Double = 2.4
    val numero2: Double = 4.6
    println("la multiplicacion de $numero y $numero2 es ${numero*numero2}")
}
// Omitiendo el tipo de la variable.
fun omitirTipo() {
	val count = 2
    println(count)
}
//Ejercicio 3 Variables con var, la cual se puede cambiar el valor durante el programa, con el val solo podemos leerlo.
fun varVariable() {
	var count = 2
    count = 20
    println(count)
}
//Retornar Valor string
fun Saludo(): String {
    val saludo = "Buenos Dias"
    val nombre = "Daniel :)"
    return "$saludo\n$nombre"
}
fun Saludo2(edad: String, numfav: Int): String {
    val saludo = "Buenos Dias"
    val nombre = "Daniel :)"
    return "$saludo\n$nombre y su edad es $edad y su numero favorito es $numfav"
}