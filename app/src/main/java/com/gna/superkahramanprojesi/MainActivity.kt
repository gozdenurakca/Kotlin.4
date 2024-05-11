package com.gna.superkahramanprojesi

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private var isim = " "
    private var yas : Int? = null
    private var meslek = " "

    private lateinit var isimText: TextView
    private lateinit var yasText: TextView
    private lateinit var meslekText : TextView
    private lateinit var sonucTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        isimText = findViewById(R.id.isimText)
        yasText = findViewById(R.id.yasText)
        meslekText = findViewById(R.id.meslekText)


    }

    @SuppressLint("SetTextI18n")
    fun superKahramanYap() {


        isim = isimText.text.toString()
        yas = yasText.text.toString().toIntOrNull()
        meslek = meslekText.text.toString()

        if(yas == null) {
            println("Doğru yaşı giriniz.")
        } else {
            val superKahraman = SuperKahraman(isim , yas!!, meslek)
            sonucTextView.text = "İsim : ${superKahraman.isim} Yaş : ${superKahraman.yas} Meslek : ${superKahraman.meslek}"

        }




    }
}
