package com.adytyapasangan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener {Pasangan()}
    }

    fun Pasangan() {
        val randomCewe = Random().nextInt (3)+1
        val randomCowo = Random().nextInt (3)+1
        val drawableResCewek = when (randomCewe) {
            1 -> R.drawable.cewe1
            2 -> R.drawable.cewek2
            else -> R.drawable.cewe3
        }
        val drawableResCowok = when (randomCowo) {
            1 -> R.drawable.pria1
            2 -> R.drawable.pria2
            else -> R.drawable.pia2
        }
        ivdadu1.setImageResource(drawableResCewek)
        ivdadu2.setImageResource(drawableResCowok)
    }
}
