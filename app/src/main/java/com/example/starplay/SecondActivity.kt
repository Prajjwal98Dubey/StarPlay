package com.example.starplay

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var entered_name:TextView
    lateinit var rotate:Button
    lateinit var translate:Button
    lateinit var fade:Button
    lateinit var star:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        rotate=findViewById(R.id.rotate)
        translate=findViewById(R.id.translate)
        fade=findViewById(R.id.fade)
        star=findViewById(R.id.star_image)

        entered_name=findViewById(R.id.entered_name)
        val user_name=intent.getStringExtra("UserName")
        entered_name.text=" Welcome !! $user_name"

        fade.setOnClickListener {
            fader()
        }
        translate.setOnClickListener {
            translater()
        }
        rotate.setOnClickListener {
            rotater()
        }
    }

    private fun fader() {
        val animator=ObjectAnimator.ofFloat(star,View.ALPHA,0f)
        animator.repeatCount=1
        animator.repeatMode=ObjectAnimator.REVERSE
        animator.start()
    }

    private fun translater() {
        val animator=ObjectAnimator.ofFloat(star,View.TRANSLATION_X,200f)
        animator.repeatCount=1
        animator.repeatMode=ObjectAnimator.REVERSE
        animator.start()
    }

    private fun rotater() {
        val animator=ObjectAnimator.ofFloat(star, View.ROTATION,-360f,0f)
//        animator.repeatCount=1
//        animator.repeatMode=ObjectAnimator.REVERSE
        animator.duration=1000
        animator.start()
    }
}