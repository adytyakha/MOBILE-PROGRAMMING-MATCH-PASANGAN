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
        val randomCewe = Random().nextInt (5)+1
        val randomCowo = Random().nextInt (13)+1
        val drawableResCewek = when (randomCewe) {
            1 -> R.drawable.ayu_mobile
            2 -> R.drawable.faliz_mobile
            3 -> R.drawable.fuji_mobile
            4 -> R.drawable.hanum_mobile
            5 -> R.drawable.mela_mobile


            else -> R.drawable.umi_mobile
        }
        val drawableResCowok = when (randomCowo) {
            1 -> R.drawable.deni_mobile
            2 -> R.drawable.didik_mobile
            3 -> R.drawable.edi_mobile
            4 -> R.drawable.eggy_mobile
            5 -> R.drawable.fanji_mobile
            6 -> R.drawable.faqih_mobile
            7 -> R.drawable.filipus_mobile
            8 -> R.drawable.hafid_mobile
            9 -> R.drawable.harris_mobile
            10 -> R.drawable.huda_mobile
            11-> R.drawable.iav_mobile
            12 -> R.drawable.kiki_mobile
            13-> R.drawable.luhur_mobile

            else -> R.drawable.riki_mobile
        }
        ivdadu1.setImageResource(drawableResCewek)
        ivdadu2.setImageResource(drawableResCowok)
    }
}
