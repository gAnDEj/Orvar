fun Page1() {
    println(
        "Chapter 1 'Civilisation is a prison we can't escape'\n\n" +

                "Mom: 'Orvar! Wake up! You're gonna be late for work!'\n" +
                "Orvar: 'Dammit, getting right up mom!'\n\n" +
                "You go to the kitchen expecting breakfast\n\n" +
                "Orvar: 'Where's breakfast?'\n" +
                "Mom: 'You turn 18 next week god dammit, make your own. You're too late anyway. HURRY UP!!'\n" +
                "Orvar: 'Damn mom, take it easy I'm on my way'\n" +
                "(I'm sick and tired of my mom whining and bitching all the time. I can't live like this, gotta plan on how to move away from here by next week.)\n" +
                "\nYou take your bike to your work at Willy's\n\n" +
                "(The only thing I enjoy every day is this bike ride. Civilisation is a prison we can't escape.)\n" +
                "\nYou arrive at work and you see your boss inside waiting for you.\n\n" +
                "Boss 'Orvar, I don't know how to put this...'\n" +
                "Orvar 'What?'\n" +
                "Boss 'If you ever come this late again, you're fired! Now go back to restocking shelves'\n" +
                "\nYour boss walks away and you go to an empty shelf where all the stuff is in a box in front of it.\nYou feel a hand on your shoulder and startle a little bit\n\n" +
                "Orvar 'Woah.'\n" +
                "Erik 'It's just me, take it easy.'" +
                "Orvar 'Oh, hey Erik.'" +
                "Erik 'Overheard our boss talking to your mom about firing you.'\n" +
                "Orvar 'Ugh, I'm gonna get a lot of shit when I come home. I just want to get out of this place you know, like escape civilisation without leaving the country you know.'\n" +
                "Erik 'Yeah I get that. Did you pass your driving test last week?'" +
                "Orvar 'Yeah, why?'" +
                "Erik 'My uncle is selling an RV for 5000kr. I could try to get you discount. That way you can get out of here.'\n" +
                "Orvar 'Yeah but it's pretty unrealistic to just disappear. I would be found eventually anyway'\n" +
                "Erik 'Yeah true, change your name and move up to the mountains or something. You can still live in the RV.'\n" +
                "Orvar 'You know what, I'll buy it and move out and go from there. Thanks\n" +
                "Erik 'No worries. Always here to help! Anyway gotta keep working. See you later.'\n" +
                "Orvar 'Take care!'\n" +
                "\nYou finish your shift like usual and bike home. \nUnsurprisingly you see your mom standing outside waiting for you. \n\n" +
                "Orvar 'Hey mom...'\n" +
                "Mom 'What was that all about?'\n" +
                "Orvar 'Look mom I'm sorry...'\n" +
                "Mom 'I don't want to hear it. How do you think we're gonna get food if you're like this?'\n" +
                "Orvar 'You know what?! I'm tired of working my ass off for you to eat and drink all the money up and do nothing. Ever since dad died you haven't worked a single day. \n'" +
                "Mom 'Dont ever talk to me like that ever again, you hear me?!'\n" +
                "Orvar 'Can't wait to get out of here.'\n" +
                "Mom 'You're never leaving on my watch!'\n" +
                "Orvar 'Whatever.'\n\n" +
                "You go to your room in anger. You sit on your bed staring at your wall when you remember that RV Erik's uncle is selling.\n\n" +
                "(Next week I'll buy that RV and get a lighter and a hatchet from the basement then I'll get out of here.) \n\n" +
                "One week and 1 day goes by...\n\n Your alarm goes off at 5 am\n\n" +
                "(I'm finally 18, time to get out of here)\n\n" +
                "1. Sneak down to the basement | 2. Walk normally\n\n")

    val choice1 = readln().toInt()

    if (choice1 == 1){
        P1O1()
    }

    if (choice1 == 2){
        P1O2()
    } else{
        Page1()
    }
}

