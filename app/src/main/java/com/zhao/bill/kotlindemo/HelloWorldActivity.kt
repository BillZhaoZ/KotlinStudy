package com.zhao.bill.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hello_world.*

/**
 * Hello World界面
 */
class HelloWorldActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)

        tv_hello_world_demo.text = getString(R.string.hw)
        tv_hello_world_demo.textSize = 20.0f

    }
}
