package com.example.interfacetestkotlin

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    var counter = 0
    var input = 0

    var onPlayer: GameClass = GameClass()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnChoose = findViewById<Button>(R.id.button2)
        val txtE = findViewById<EditText>(R.id.editTextTextPersonName)
        val txtE2 = findViewById<EditText>(R.id.editTextTextPassword)
        txtE2.isFocusable = false
        txtE2.setText("")

        btnChoose.setOnClickListener {
            val input2 = txtE.text.toString()
            val input = input2.toInt()
            update(input)
            txtE.setText("")
            txtE2.setText("Du bist im Spielmodus $input")
        }
    }
    fun update(position: Int) {
        val btn = findViewById<Button>(R.id.button)
        val txt = findViewById<TextView>(R.id.textView)
        txt.text = ""
        when (position) {
            1 -> {
                onPlayer.setModus(TwoFingerRun())
                btn.setBackgroundColor(Color.parseColor(onPlayer.colorModus()))
                btn.setOnClickListener { view ->
                    val back: Int =
                        onPlayer.runModus(Integer.valueOf(view.tag.toString()))
                    txt.text = back.toString()
                }
            }
            2 -> {
                onPlayer.setModus(MaxFingerRun())
                btn.setBackgroundColor(Color.parseColor(onPlayer.colorModus()))
                btn.setOnClickListener { view ->
                    val back: Int =
                        onPlayer.runModus(Integer.valueOf(view.tag.toString()))
                    txt.text = back.toString()
                }
            }
            else -> {}
        }
    }

