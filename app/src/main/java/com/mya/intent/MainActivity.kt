package com.mya.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var ednim:EditText
    private lateinit var ednama:EditText
    private lateinit var ednilai:EditText
    private lateinit var btn_pros:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ednim = findViewById(R.id.enim)
        ednama = findViewById(R.id.enama)
        ednilai = findViewById(R.id.enilai)
        btn_pros = findViewById(R.id.btn_prs)

        btn_pros.setOnClickListener(){
            val intent = Intent(this,proses::class.java)
            intent.putExtra("nim", ednim.text.toString())
            intent.putExtra("nama", ednama.text.toString())
            intent.putExtra("nilai", ednilai.text.toString())
            startActivity(intent)
        }
    }
}
