package com.example.recyclerview_tiaratsania_32

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.TaskStackBuilder
import org.w3c.dom.Text

class DetailSeventeenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_seventeen)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val seventeen = intent.getParcelableExtra<Sebong>(MainActivity.INTENT_PARCELABLE)

        val imgSebong = findViewById<ImageView>(R.id.img_item_photo)
        val namaSebong = findViewById<TextView>(R.id.tv_item_name)
        val descSebong = findViewById<TextView>(R.id.tv_item_description)

        imgSebong.setImageResource(seventeen?.imgSebong!!)
        namaSebong.text = seventeen.nameSebong
        descSebong.text = seventeen.descSebong
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}