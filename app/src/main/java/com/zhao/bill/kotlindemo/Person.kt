package com.zhao.bill.kotlindemo

/**
 * Created by Bill on 2017/10/17.
 */
/*
class Person(private val name: String) {

    fun sayHello() {
        println("hello $name , i am here")
    }

}*/


class Person(private var firstName: String) {

    init {
        System.out.print("FirstName is $firstName")
    }

    internal fun sayHello() {
        println("  hello $firstName , i am here")
    }

}

