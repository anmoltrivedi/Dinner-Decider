package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodlist= arrayListOf("Chinese","Sandy's Kitchen", "TandooriQ","Domino's Pizza", "Dosa")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decidebtn.setOnClickListener {

            val random = Random()
            val randomFood = random.nextInt(foodlist.count())
            textView.text = foodlist[randomFood]
        }

        addfood.setOnClickListener {
            val newFood = editText.text.toString()
            foodlist.add(newFood)
            editText.text.clear()
            println(foodlist)

        }
    }
}
