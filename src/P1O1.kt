import kotlin.system.exitProcess

fun P1O1() {
    println("""
        
        You open your door hearing your mom snoring.
        Are you sure about this?
        
        1. Yes 2. Wait until mom leaves.
        
    """.trimIndent())

    val choice_p1o1 = readln()

    if (choice_p1o1 == "1"){
        println("""
            
            You quietly sneak downstairs and down to the basement.
            You grab what you need and go back up.
            When opening your door you see your mom in the kitchen making breakfast.
            When you take a step back the stairs creak and your mom turns around seeing you.
            
            Mom 'Orvar what the hell are you doing here this early?! And why do you have a backpack on you?'
            Orvar 'I'm just as confused as you are, I woke up and i was here. Must be sleepwalking or something.'
            Mom 'Iv'e never seen you sleep walking once but I guess that can randomly happen. Get some sleep so you have energy for chores.'
            Orvar 'Alr mom, see you later'
            
            You go upstairs to room and get some more sleep.
            
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

    else if (choice_p1o1 == "2"){
        P1O2()
    } else {
        P1O1()
    }
}