package com.example.herritagecorneruas.ui.batik

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

class DetailBatik : AppCompatActivity() {
    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.batik_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val batik = intent.getParcelableExtra<BatikClass>(INTENT_PARCELABLE)

        val batikimg = findViewById<ImageView>(R.id.image)
        val namabatik = findViewById<TextView>(R.id.tv_name)
        val deskbatik = findViewById<TextView>(R.id.tv_desk)
        val tambahan = findViewById<TextView>(R.id.tv_tambahan)


        batikimg.setImageResource(batik?.batikimg!!)
        namabatik.text = batik.namabatik
        deskbatik.text = batik.deskbatik
        tambahan.text = batik.tambahan

        val buttonOpenLink = findViewById<Button>(R.id.buttonOpenLink)
        buttonOpenLink.setOnClickListener {
            val url = "https://www.kratonjogja.id/kagungan-dalem/12-motif-batik-larangan-keraton-yogyakarta/"
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