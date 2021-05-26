package com.example.lotto20210512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import java.util.*


fun getRandomLottoNumber () : Int{
    return Random().nextInt(45)+1
}
fun getRandomLottoNumbers():MutableList<Int> {
    val lottoNumbers = mutableListOf<Int>()


        while (true) {
            var number: Int = getRandomLottoNumber()
            var flag_existing: Int = 0

          //  for (j in 0..lottoNumbers.size) {
           if (lottoNumbers.contains(number)) {
            //    if(number.equals(lottoNumbers[j]))
                    flag_existing = 1
                    //continue;
           }
            if (flag_existing.equals(1))
                continue
            else
                lottoNumbers.add(number)
            if (lottoNumbers.size >= 6)
                break;
        }
        return lottoNumbers
    }


    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            val CnsResultView = findViewById<CardView>(R.id.CnsResultView)
            CnsResultView.setOnClickListener {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
                startActivity(intent)
            }
            val CnsCardView = findViewById<CardView>(R.id.CnsCardView)
            CnsCardView.setOnClickListener {
                startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
            }
            val CnsNameView = findViewById<CardView>(R.id.CnsNameView)
            CnsNameView.setOnClickListener {
                startActivity(Intent(this@MainActivity, NameActivity::class.java))
            }

        }

    }



