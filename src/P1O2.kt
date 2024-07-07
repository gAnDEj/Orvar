import kotlin.system.exitProcess

fun P1O2() {
    println("""
        
        You decide to wait until mom leaves so you get some more sleep.
        Once you wake up mom is gone.
        You go down to the basement and grab everything and put it in a backpack.
        You go back up to your room and you feel tired so you sleep for another hour.
        
        1. Wake up | 2. Quit
        
    """.trimIndent())

    val decision = readln()

    if (decision == "1"){
        TODO("make a new file")
    }

    else if (decision == "2"){
        exitProcess(0)
    }
}