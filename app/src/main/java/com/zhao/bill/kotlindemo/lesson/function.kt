package com.zhao.bill.kotlindemo.lesson

/**
 * @Date on 2019-11-15
 * @author bill
 * @Desc:
 */

fun main(args: Array<String>) {

    printHello()

    val max = max(10, 20)
    println("带返回值  === max = $max")
}


// 不带返回值的函数
fun printHello() {
    println("不带返回值  ===  hello world")
}

// 带返回值的函数
fun max(a: Int, b: Int): Int {

    // if是有结果的表达式  if (a > b) a else b   和Java里边的三元表达式类似

    return if (a > b) a else b
}


