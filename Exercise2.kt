//Problemas prácticos 
/*
https://developer.android.com/codelabs/basic-android-kotlin-compose-intro-kotlin-practice-problems?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-1%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-intro-kotlin-practice-problems#0
*/
//Ejercicio

fun main()
{
    ejercicio2()
    println("============================")
    ejercicio3()
    println("============================")
    ejercicio4()
    println("============================")
    ejercicio5()
    println("============================")
    ejercicio6()
    println("============================")
    ejercicio7()
    println("============================")
    ejercicio8()
}
fun ejercicio2()
{
    println("Use the val keyword when the value doesn't change.\nUse the var keyword when the value can change.\nWhen you define a function, you define the parameters that can be passed to it. \nWhen you call a function, you pass arguments for the parameters.")
}
fun ejercicio3()
{
    println("New chat message from a friend")
}
fun ejercicio4()
{

        var discountPercentage: Int = 0
        var offer: String = ""
        val item = "Google Chromecast"
        discountPercentage = 20
        offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
        println(offer)
}
fun ejercicio5()
{
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
fun ejercicio6()
{
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
fun ejercicio7()
{
    val firstNumber = 10
    val secondNumber = 5
    val firstNumber2 = 255
    val secondNumber2 = 643
    val result = add(firstNumber, secondNumber)
    val result2 = add(firstNumber2, secondNumber2)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber2 + $secondNumber2 = $result2")

}
fun add(num1: Int, num2: Int): Int
{
    return num1 + num2
}
fun ejercicio8() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}
fun displayAlertMessage(system: String, email: String): String
{
    return "There's a new sign-in request on ${system} for your Google Account ${email}"
}