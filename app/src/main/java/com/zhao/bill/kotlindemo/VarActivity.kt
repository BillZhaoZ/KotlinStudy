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

        tv_var.text = "名称:$name + 单价:$price + 数量：$quanity"

        // 内部方法调用
        val firstName: String = "zhuang"
        val lastName: String? = "zhao"

        tv_show_method.text = "my name is ${getName(firstName, lastName)}"


        // 类的方法调用
        /* val person = Person("Bill")
         person.sayHello()*/

        val person = Person("jack")
        person.sayHello()
    }

    /**
     * 获取姓名
     */
    private fun getName(firstName: String?, lastName: String? = "unKnow"): String {

        if (hasEmpty(firstName, lastName)) {
            lastName?.let { return@getName "${checkName(firstName)} $lastName" }
            firstName?.let { return@getName "$firstName ${checkName(lastName)}" }
        }

        return "$firstName $lastName"
    }

    /**
     * 判断名字是否为空
     */
    private fun hasEmpty(vararg strArray: String?): Boolean {
        for (str in strArray) {
            str ?: return true
        }

        return false
    }

    fun checkName(name: String?): String = name ?: "unknow"

    // 定义一个方法
    // 创建了一个名为say()的函数，它接受一个String类型的参数，并返回一个String类型的值
    fun say(str: String): String {

        return str
    }

    // 缩略版
    fun sayAgain(str: String): String = str

}
