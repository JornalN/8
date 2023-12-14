package com.example.a8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var redbtn: Button
    private lateinit var yellowbtn: Button
    private lateinit var greenbtn: Button
    private lateinit var upfont: Button
    private lateinit var downfont: Button
    private lateinit var textView: TextView
    private lateinit var rLayout: ConstraintLayout
    private var font = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redbtn = findViewById(R.id.redbtn)
        yellowbtn = findViewById(R.id.yellowbtn)
        greenbtn = findViewById(R.id.greenbtn)
        upfont = findViewById(R.id.upfont)
        downfont = findViewById(R.id.downfont)
        textView = findViewById(R.id.textview)
        rLayout = findViewById(R.id.root_layout)

        redbtn.setOnClickListener{
            textView.text = resources.getText(R.string.red)
            rLayout.setBackgroundColor(resources.getColor(R.color.red, null))
        }

        greenbtn.setOnClickListener{
            textView.text = resources.getText(R.string.green)
            rLayout.setBackgroundColor(resources.getColor(R.color.green, null))
        }

        yellowbtn.setOnClickListener{
            textView.text = resources.getText(R.string.yellow)
            rLayout.setBackgroundColor(resources.getColor(R.color.yellow, null))
        }

        upfont.setOnClickListener{
            if(font < 2){
                font++
            }
            when (font) {
                2 -> R.dimen.font_large
                1 -> R.dimen.font_medium
                0 -> R.dimen.font_small
                else -> null
            }?.let {
                textView.textSize = resources.getDimension(it)
            }
        }

        downfont.setOnClickListener{
            if(font > 0){
                font--
            }
            when (font) {
                2 -> R.dimen.font_large
                1 -> R.dimen.font_medium
                0 -> R.dimen.font_small
                else -> null
            }?.let {
                textView.textSize = resources.getDimension(it)
            }
        }
    }
}