package com.geektech.k1homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var listPictures = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        addPictures()
        submitPicture()
        randomPicture()
    }

    private fun submitPicture() {
        btn_submit.setOnClickListener {
            listPictures.add(et_url.text.toString())
        }
    }

    private fun randomPicture() {
        btn_random.setOnClickListener {
            iv_url.loadImage(listPictures.random())
        }
    }

    private fun addPictures() {
        listPictures.add("https://icdn.lenta.ru/images/2021/04/27/16/20210427163138131/detail_9b31eaf4376cdff03e0ba1bcaa826a01.jpg")
        listPictures.add("https://i.pinimg.com/564x/4f/2c/69/4f2c69428f94f690daadb55ab198c344.jpg")
        listPictures.add("https://i.pinimg.com/564x/35/84/71/358471f47296a3f13a01a80a44700bbc.jpg")
        listPictures.add("https://i.pinimg.com/474x/7a/82/39/7a8239fa911a3074ba3a76c782bc52f2.jpg")
        listPictures.add("https://cdn.wallpapersafari.com/16/34/ZSeXDC.jpg")
    }
}