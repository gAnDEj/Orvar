import kotlin.system.exitProcess

// main menu

fun main() {
    println("Orvar\n\n")  // prints out the menu

    println("1 = 'Start'")
    println("2 = 'Exit'\n")

    val choice = readln().toInt()

    if (choice == 1){
        Page1()
    }

    if (choice == 2){
        exitProcess(0)
    }
}

