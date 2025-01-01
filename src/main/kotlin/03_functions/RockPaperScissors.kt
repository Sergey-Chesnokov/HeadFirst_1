package org.example.`03_functions`

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options) // Вызвать функцию getGameChoice
    val userChoice = getUserChoice(options)
}

// Ф-ция getGameChoice - случайным образом выбирает один из вариантов
fun getGameChoice(optionsParam: Array<String>) {
    optionsParam[(Math.random() * optionsParam.size).toInt()]
}

// Ф-ция getUserChoice - запрос выбора пользователя
fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false // Переменная isValidChoice будет показывать ввел ли пользователь допустимый вариант
    var userChoice = ""

    // Выполнять цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoice) { // Цикл продолжиться до тех пор, пока переменная isValidChoice не будет равна true

        // Запросить пользователя его выбор
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")

        // Прочитать пользовательский ввод
        val userInput = readLine()

        // Проверить пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true // Если ввод пользователя прошел проверку, цикл прерывается
            userChoice = userInput
        }
        // Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("You must enter a valid choice.") // Если ввод пользователя недопустим, цикл продолжается
    }
    return userChoice
}