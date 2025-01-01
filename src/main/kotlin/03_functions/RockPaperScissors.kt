package org.example.`03_functions`

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options) // Вызвать функцию getGameChoice
}

// Ф-ция getGameChoice - случайным образом выбирает один из вариантов
fun getGameChoice(optionsParam: Array<String>) {
    optionsParam[(Math.random() * optionsParam.size).toInt()]
}

// Ф-ция getUserChoice - запрос выбора пользователя
fun getUserChoice(optionsParam: Array<String>): String {
    // Запросить у пользователя его выбор
    println("Please enter one of the following:")
    for (item in optionsParam) // цикл переберет значение массива options (Rock, Paper, Scissors)
        print(" $item")
    println(".")
    // Прочитать пользовательский ввод
    val userInput = readLine()
}