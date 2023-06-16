package com.example.herritagecorneruas.ui.musik

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.herritagecorneruas.R
import com.example.herritagecorneruas.ui.musik.MusikClass

class DetailMusik : AppCompatActivity() {
    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.musik_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val musik = intent.getParcelableExtra<MusikClass>(INTENT_PARCELABLE)

        val musikimg = findViewById<ImageView>(R.id.image)
        val namamusik = findViewById<TextView>(R.id.tv_name)
        val deskmusik = findViewById<TextView>(R.id.tv_desk)


        musikimg.setImageResource(musik?.musikimg!!)
        namamusik.text = musik.namamusik
        deskmusik.text = musik.deskmusik



        val buttonOpenMusik = findViewById<Button>(R.id.buttonOpenMusik)
        buttonOpenMusik.setOnClickListener {
            val url = "https://www.kratonjogja.id/kagungan-dalem/16-mengenal-gamelan-keraton-yogyakarta/F"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}