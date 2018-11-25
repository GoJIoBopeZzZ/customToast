package com.example.aleksandr.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toast_activity.*
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout = layoutInflater.inflate(R.layout.toast_activity, linearLayout)
        this.button.setOnClickListener {
            val myToast = Toast(applicationContext)
            myToast.apply {
                duration = Toast.LENGTH_LONG
                setGravity(Gravity.CENTER_VERTICAL, 0, 0)
                view = layout
                view.findViewById<TextView>(R.id.custom_toast_message).setText("Ваш товар успешно добавлен в корзину!")
                view.findViewById<ImageView>(R.id.custom_toast_image).setImageResource(R.drawable.ok)
                show()
            }
        }
    }
}

