package com.zhao.bill.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 主界面
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_lesson.setOnClickListener(this)
        tv_practice.setOnClickListener(this)
    }

    /**
     * 点击事件处理
     */
    override fun onClick(v: View?) {
        when (v?.id) {

        // 跳转课程
            R.id.tv_lesson -> startActivity(Intent(this, KotlinLessonActivity::class.java))

        // 跳转练习
            R.id.tv_practice -> startActivity(Intent(this, PracticeActivity::class.java))
        }
    }

}
