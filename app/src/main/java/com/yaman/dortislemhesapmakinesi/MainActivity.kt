package com.yaman.dortislemhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view : View){

        val sayi1 = editText.text.toString().toDoubleOrNull()
        val sayi2 = editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2 == null){
            textView.text = "Yanlış İşlem!!"
        } else{
            val sonuc = sayi1 + sayi2
            textView.text = "Sonuç: ${sonuc}"
        }

    }

    fun cikar(view : View){
        val sayi1 = editText.text.toString().toDoubleOrNull()
        val sayi2 = editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2 == null){
            textView.text = "Yanlış İşlem!!"
        } else{
            val sonuc = sayi1 - sayi2
            textView.text = "Sonuç: ${sonuc}"
        }

    }

    fun carp(view : View){
        val sayi1 = editText.text.toString().toDoubleOrNull()
        val sayi2 = editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2 == null){
            textView.text = "Yanlış İşlem!!"
        } else{
            val sonuc = sayi1 * sayi2
            textView.text = "Sonuç: ${sonuc}"
        }

    }

    fun bol(view : View){
        val sayi1 = editText.text.toString().toDoubleOrNull()
        val sayi2 = editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2 == null){
            textView.text = "Yanlış İşlem!!"
        } else{
            val sonuc = sayi1 / sayi2
            textView.text = "Sonuç: ${sonuc}"
        }

    }

    fun reset(view : View){
        textView.text = "Sonucu Görmek İçin İşlem Gerçekleştiriniz"
    }
}