package com.example.recyclerview_tiaratsania_32

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seventeenlist = listOf<Sebong>(
            Sebong(
                R.drawable.seungcheoll,
                "Seungcheol",
                "Choi Seungcheol. Daegu, 8 Agustus 1995. Seventeen Leader & Leader Hip hop team"
            ),
            Sebong(
                R.drawable.jeonghann,
                "Jeonghan",
                "Yoon Jeonghan. Seoul, 4 Oktober 1995. Member Vocal team"
            ),
            Sebong(
                R.drawable.joshuaa,
                "Joshua",
                "Hong Jisoo. Los Angeles, 30 Desember 1995. Member Vocal Team"
            ),
            Sebong(
                R.drawable.junn,
                "Jun",
                "Wen Junhui. Shenzen, 10 Juni 1996. Member Performance Team"
            ),
            Sebong(
                R.drawable.hoshii,
                "Hoshi",
                "Kwon Soon Young. Namyangjusi, 15 Juni 1996. Leader Performance Team"
            ),
            Sebong(
                R.drawable.wonwooo,
                "Wonwoo",
                "Jeon Wonwoo. Changwon, 17 Juli 1996. Member Hip hop Team"
            ),
            Sebong(
                R.drawable.woozii,
                "Woozi",
                "Park Jihoon. Busan, 22 November 1996. Leader Vocal Team"
            ),
            Sebong(
                R.drawable.thee8,
                "The8",
                "Xu Minghao. Haicheng, 7 November 1997. Member Performance Team"
            ),
            Sebong(
                R.drawable.mingyuu,
                "Mingyu",
                "Kim Mingyu. Anyang, 6 April 1997. Member Hip hop Team"
            ),
            Sebong(
                R.drawable.dikey,
                "DK",
                "Lee Seokmin. Seoul, 18 Februari 1997. Member Vocal Team"
            ),
            Sebong(
                R.drawable.seungkwann,
                "seungkwan",
                "Boo Seungkwan. Jeju, 16 Januari 1998. Member Vocal Team"
            ),
            Sebong(
                R.drawable.vernonn,
                "Vernon",
                "Chwe Hansol. New York, 18 Februari 1998. Member Hip hop Team"
            ),
            Sebong(
                R.drawable.dinoo,
                "Dino",
                "Lee Chan. Iksan, 11 Februari 1999. Member Performance Team"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_sebongie)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SeventeenAdapter(this, seventeenlist){
            val intent = Intent (this, DetailSeventeenActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}