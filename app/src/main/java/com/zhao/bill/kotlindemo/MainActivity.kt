package com.zhao.bill.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 主界面
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hello_world.setOnClickListener(this)
        tv_toast.setOnClickListener(this)
    }

    /**
     * 点击事件处理
     */
    override fun onClick(v: View?) {
        when (v?.id) {

        // 跳转Helloworld
            R.id.tv_hello_world -> startActivity(Intent(this, HelloWorldActivity::class.java))

        // 吐司
            R.id.tv_toast -> Toast.makeText(this, "Okay，you got me here!!!", Toast.LENGTH_SHORT).show()
        }
    }


}
