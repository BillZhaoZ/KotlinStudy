package com.zhao.bill.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_var.*

/**
 * 变量页面
 */
class VarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_var)

        // 定义变量
        var quanity = 5
        val price: Double = 20.3
        val name: String = "大米"

        tv_var.text = "名称:$name + 单价:$price" + "数量：$quanity"

    }
}
