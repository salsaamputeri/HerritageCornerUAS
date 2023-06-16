package com.example.herritagecorneruas.ui.musik

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.herritagecorneruas.R
import com.example.herritagecorneruas.databinding.FragmentMusikBinding
import com.example.herritagecorneruas.ui.musik.MusikAdapter
import com.example.herritagecorneruas.ui.musik.MusikClass
import com.example.herritagecorneruas.ui.musik.DetailMusik


class MusikFragment : Fragment() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private lateinit var binding: FragmentMusikBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMusikBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvDescription: TextView = binding.tvDescription
        tvDescription.text =
            "Gamelan Pakurmatan dimainkan terutama untuk mengiringi Hajad Dalem atau upacara adat keraton, upacara keneegaraan yang penting sedangkan Gamelan Ageng dimainkan terutama sebagai penggiring pagelaran seni budaya keraton."
        tvDescription.gravity = Gravity.CENTER
        tvDescription.setTextColor(Color.WHITE)
        tvDescription.setBackgroundColor(Color.parseColor("#6B4226"))

        val animeList = listOf(
            MusikClass(
                R.drawable.bonang,
                namamusik = "Bonang",
                deskmusik = "Bonang terbagi menjadi 2 jenis, bonang barung (besar) dan bonang penerus (kecil). Bonang terbuat dari perunggu berbentuk bulat berongga (tertelungkup) dengan pencon (benjolan) di atas bagian tengah. Untuk laras Slendro, Bonang ditata dengan dua jajar, atas/depan berjumlah 5 pencon, bawah/belakang 5 pencon. Untuk laras Pelog, bonang ditata dua jajar, atas/depan berjumlah 7 pencon, bawah/belakang 7 pencon. \n" +
                        "\n" +
                        "Susunan nada bonang slendro dari kiri ke kanan: atas 6,5,3,2,1 dan bawah 1,2,3,5,6 \n" +
                        "sedangkan susunan nada bonang pelog dari kiri ke kanan: atas 4,6,5,3,2,1,7 dan bawah 7,1,2,3,5,6,4."
            ),

            MusikClass(
                R.drawable.demung,
                namamusik = "Demung",
                deskmusik = "Demung adalah jenis instrumen gamelan terbuat daru perunggu yang berbentuk bilah persegi panjang yang ditata berderet. Demung laras Slendro berjumlah 6 bilah, sedangkan demung laras pelog berjumlah 7 bilah. Seperangkat gamelan Ageng biasanya terdapat 1 atau 2 buah demung. \n" +
                        "\n" +
                        "Susunan nada demung slendro dari kiri ke kanan: 1,2,3,5,6,i sedangkan nada demung pelog dari kiri ke kanan: 1,2,3,4,5,6,7\n"
            ),

            MusikClass(
                R.drawable.gambang,
                namamusik = "Gambang",
                deskmusik = "Gambang adalah jenis instrumen gamelan berupa bilah persegi panjang yang terbuat dari kayu ditata berderet. Pada seperangkat gamelan yang lengkap terdapat tiga buah gambang, yaitu gambang slendro, gambang pelog bem, dan gambang pelog barang. Pada fungsi pemakaiannya, khususnya untuk gambang pelog, nada 1 dan 7 dapat disesuaikan dengan gendhing yang dimainkan."
            ),

            MusikClass(
                R.drawable.kempul,
                namamusik = "Kempul",
                deskmusik = "Kempul terbuat dari perunggu berbentuk bulat berongga dengan pencon (benjolan) di bagian tengah. Kempul juga ditata dengan cara digantung pada rancakan/gayor. Ukuran kempul lebih kecil dari gong dan suwukan. Seperangkat gamelan biasanya terdapat 5 buah kempul laras slendro dengan nada 1,2,3,5,6 sedangkan kempul laras pelog berjumlah 5 atau 6 buah dengan nada 1,2,3,5,6,7"
            ),

            MusikClass(
                R.drawable.kendhang,
                namamusik = "Kendhang",
                deskmusik = "Kendhang terdiri dari 3 buah, yaitu kendhang bem/ageng (besar), kendhang batangan/ciblon (sedang), dan kendhang ketipung (kecil). Kendhang terbuat dari kayu bulat berlubang ditengah dengan ujung besar dan kecil yang dilapisi membran terbuat dari kulit kerbau atau sapi."
            ),

            MusikClass(
                R.drawable.kenong,
                namamusik = "Kenong",
                deskmusik = "Kenong terbuat dari perunggu berbentuk bulat berongga (tertelungkup) dengan pencon (benjolan) di atas bagian tengah. Ukuran kenong lebih besar dari bonang dan ditata berjajar satu membentuk kotak."
            ),

            MusikClass(
                R.drawable.kethukkempyang,
                namamusik = "Kethuk & Kempyang",
                deskmusik = "Kethuk terbuat dari perunggu berbentuk bolat berongga (tertelungkup) dengan pencon (benjolan) di atas bagian tengah. Ukurang kethuk lebih besar/hampir sama dengan bonang namun lebih kecil dari kenong. Kethuk berjumlah dua (satu untuk laras slendro dan satu untuk laras pelog). Nada kethuk adalah nada 2, baik untuk slendro maupun pelog.\n" +
                        "\n" +
                        "Kempyang terbuat dari perunggu berbentuk bulat berongga (tertelungkup) dengan pencon (benjolan) di atas bagian tengah. Kempyang berjumlah 2 pencon dan hanya digunakan dalam laras pelog dengan nada 7 dan nada 6.\n"
            ),

            MusikClass(
                R.drawable.peking,
                namamusik = "Peking",
                deskmusik = "Peking adalah jenis instrumen gamelan terbuat dari perunggu yang berbentuk bilah persegi panjang yang ditata berderet dengan ukuran nada lebih kecil dari saron. Peking laras Slendro berjumlah 6 bilah, sedangkan peking laras pelog berjumlah 7 bilah. Seperangkat gamelan Ageng pasti terdapat 1 buah peking.\n" +
                        "\n" +
                        "Susunan nada peking slendro dari kiri ke kanan: 1,2,3,5,6,i sedangkan nada peking pelog dari kiri ke kanan: 1,2,3,4,5"
            ),

            MusikClass(
                R.drawable.rebab,
                namamusik = "Rebab",
                deskmusik = "Rebab adalah jenis intrumen terbuat dari kayu, dilapisi membran dari kulit hewan dilengkapi dengan dua buah dawai. Cara memainkannya dengan digesek. Nada dawai pada rebab adalah nem (6) dan ro (2). Pada permainan gamelan sederhana, rebab jarang digunakan.\n"
            ),

            MusikClass(
                R.drawable.saron,
                namamusik = "Saron",
                deskmusik = "Saron adalah jenis instrumen gamelan terbuat dari perunggu yang berbentuk bilah persegi panjang yang ditata berderet dengan ukuran dan nada lebih kecil dari demung. Saron laras Slendro berjumlah 6 bilah, sedangkan saron laras pelog berjumlah 7 bilah. Seperangkat gamelan Ageng biasanya terdapat 2 atau 4 buah saron. \n" +
                        "\n" +
                        "Susunan nada saron slendro dari kiri ke kanan: 1,2,3,5,6,i sedangkan nada saron pelog dari kiri ke kanan: 1,2,3,4,5,6,7\n"
            ),
        )

        val recyclerView: RecyclerView = binding.rv
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MusikAdapter(requireContext(), animeList) {
            val intent = Intent(requireContext(), DetailMusik::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

        recyclerView.setOnTouchListener { _, _ ->
            tvDescription.translationZ = recyclerView.translationZ
            false
        }
    }
}