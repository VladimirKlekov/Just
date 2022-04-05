package ru.netology

import kotlin.random.Random
import kotlin.random.nextInt

const val ONE_MINUTE = 60
const val ONE_HOUR = 3600
const val ONE_DAY = 86400
const val SECOND_DAY = 172800


fun main() {
    while (true) {
        println(" ")
        println("Добро пожаловать в социальную сеть VK")
        println(" ")
        println("Выберите соответствующий пункт меню: ")
        println("1.Заскочу на секунду")
        println("2.Зайду на минутку")
        println("3.Зависну на часик-другой")
        println("4.Ездил в Питер на выходные")
        println("Введите end для выхода")

        println(" ")
        val chek = readln()
        if (chek == "end") {
            println("Программа завершена!")
            break
        }
        val input = chek?.toInt()

        when (input) {
            1 -> seconds()
            2 -> minutes()
            3 -> hours()
            4 -> days()
            else -> {
                print("Ошибка ввода. Выберите правильный вариант")
            }
        }
    }
}

fun seconds() {
    val result = Random.nextInt(0..ONE_MINUTE)

    if (result % 10 == 1 && result % 100 != 11) {
        println("Пользователь был(а) $result секунду назад")
    } else if (result % 100 != 13 && result % 100 != 12 && result % 100 != 14 && (result % 10 == 2 || result % 10 == 3 || result % 10 == 4)) {
        println("Пользователь был(а) $result секунды назад")
    } else {
        println("Пользователь был(а) $result секунд назад")
    }
}

fun minutes() {
    val result = Random.nextInt(ONE_MINUTE..ONE_HOUR) / 60
    if (result % 10 == 1 && result % 100 != 11) {
        println("Пользователь был(а) $result минуту назад")
    } else if (result % 100 != 13 && result % 100 != 12 && result % 100 != 14 && (result % 10 == 2 || result % 10 == 3 || result % 10 == 4)) {
        println("Пользователь был(а) $result минуты назад")
    } else {
        println("Пользователь был(а) $result минут назад")
    }

}

fun hours() {
    val result = Random.nextInt(ONE_HOUR..ONE_DAY) / 3600
    if (result == 1 || result == 21) {
        println("Пользователь был(а) $result час назад")
    } else if (result == 2 || result == 3 || result == 4 || result == 22 || result == 23 || result == 24) {
        println("Пользователь был(а) $result часа назад")
    } else {
        println("Пользователь был(а) $result часов назад")
    }
}

fun days() {
    val result = Random.nextInt(ONE_DAY..SECOND_DAY)
    if (result < SECOND_DAY) {
        println("Пользователь был(а) 1 день назад")
    } else {
        println("Пользователь был(а) 2 дня назад")
    }

}
