package com.mya.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_proses.*

class proses : AppCompatActivity() {
    private lateinit var tnim : TextView
    private lateinit var tnama : TextView
    private lateinit var tnilai : TextView
    private lateinit var tket : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proses)

        tnim = findViewById(R.id.textnim)
        tnama = findViewById(R.id.textnama)
        tnilai = findViewById(R.id.textnilaia)
        tket = findViewById(R.id.textket)

        if (intent.extras != null) {
            val bundle = intent.extras
            val nim = bundle?.getString("nim")
            val nama = bundle?.getString("nama")
            val nilai = bundle?.getString("nilai")
            val n = nilai?.toInt() ?: 0
            var ket = ""

            if (n >= 80 && n <=100) {
                ket = "A"
            } else if (n >= 60 && n < 80){
                ket = "B"
            } else if (n >= 40 && n < 60){
                ket = "C"
            } else if (n >= 20 && n < 40){
                ket = "D"
            } else if (n >= 0 && n < 20){
                ket = "E"
            } else {
                ket = "NOB BGT BGSD"
            }

            tnim.setText("NIM : " +nim)
            tnama.setText("Nama : "+nama)
            tnilai.setText("Nilai : "+nilai)
            tket.setText("Keterangan : "+ket)
        }

        btn_back.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
