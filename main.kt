fun firstClick() {
    println("Welcome for Online Pet Service.")//
    println("1. Veterinary Service ")
    println("2. Food and Water service")
//    println("3. Dog walking Service")
//    println("4. Buy a pet")
//    println("5. Pet educational resources")
//    println("6.Other")
}

var userOption = ""
var userChoice = 0
fun chosenOption() {
    try {
        while (userOption == "") {
            println("Please choose the options here:(use 1,2,3,4 or 5")
            userChoice = readln().toInt()

            userOption = when (userChoice) {
                1 -> " Veterinary Service"
                2 -> " Food Service"
//                3 -> "Dog walking"
//                4 -> "Buy a Pet"
//                5 -> "Pet education"
//                6 -> "Other additional"
                else -> continue
            }

        }
//        println("Which $userOption service would you like: ")

    } catch (name: Throwable) {
        println("Error!!!,Please use a number between 1 to 6. ")
    }


    if (userChoice == 1) {
        println("1. Available Vert")
        println("2. Last treatment.")
        println()
        try {
            userChoice = readln().toInt()
            userOption = when (userChoice) {
                1 -> "Available vert(s)"
                2 -> "Last Treatment"
                else -> return
            }

        } catch (_: Throwable) {

        }

        if (userChoice == 1) {
            println("Choose one of the available vert(s)")
            println("1. Stevn Oya")
            println("2. James JJ")
            println("3. John Doe")
            userChoice = readln().toInt()

            userOption = when (userChoice) {
                1 -> "Steven Oyaro"
                2 -> "JAmes JJ"
                3 -> "John Doe"
                else -> return
            }
            if (userChoice == 1 || userChoice == 2 || userChoice == 3) {
                println("Book Appointment with $userOption via texting 254******* Indicate name and availability ")

            }

        } else if (userChoice == 2) {
            println("Select latest treatment:(use 1,2,3)")
            println("1. 12/02/2023")
            println("2. 11/01/2024")
            println("3. 12/12/2024")
            userChoice = readln().toInt()
        }
        if (userChoice == 1) {
            println("Deworming  use of **** medicine on")
        } else if (userChoice == 2) {
            println("Vaccination using **** ")
        } else if (userChoice == 3) {
            println("Cough  treatment using *** medicine.")
        } else {
            println("Start over!!")
        }
    } else if (userChoice == 2) {
        println("Welcome to food section.")
        println("Available per foods(choose using 1, 2 or 3")
        println("1. Omena")
        println("2. Mixed chinese for pet")
        println("3. Pet milk")
        userChoice = readln().toInt()
        userOption = when (userChoice) {
            1 -> "Omena"
            2 -> " Mixed chinese for Pet"
            3 -> "pet milk"
            else -> return
        }
        if (userChoice== 1){
            println("please pay Ksh.150 for $userOption")
        }else if (userChoice == 2){
            println("Please pay Ksh.900 for $userOption ")
        }else if (userChoice == 3){
            println("Please pay Ksh.300 for $userOption ")
        }

    }

}

fun main() {

    firstClick()
    chosenOption()
}
