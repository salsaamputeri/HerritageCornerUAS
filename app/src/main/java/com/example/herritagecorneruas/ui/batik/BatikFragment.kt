package com.example.herritagecorneruas.ui.batik

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
import com.example.herritagecorneruas.databinding.FragmentBatikBinding
import com.example.herritagecorneruas.ui.batik.BatikAdapter
import com.example.herritagecorneruas.ui.batik.BatikClass
import com.example.herritagecorneruas.ui.batik.DetailBatik


class BatikFragment : Fragment() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private lateinit var binding: FragmentBatikBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBatikBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvDescription: TextView = binding.tvDescription
        tvDescription.text =
            "Batik Larangan Keraton Yogyakarta atau Awisan Dalem, adalah motif-motif batik yang penggunaannya terikat dengan aturan tertentu di Keraton Yogyakarta dan tidak semua orang boleh memakainya."
        tvDescription.gravity = Gravity.CENTER
        tvDescription.setTextColor(Color.WHITE)
        tvDescription.setBackgroundColor(Color.parseColor("#6B4226"))

        val animeList = listOf(
            BatikClass(
                R.drawable.huk,
                namabatik = "Batik Motif Huk",
                deskbatik = "Motif huk terdiri dari motif kerang, binatang, tumbuhan, cakra, burung, sawat (sayap), dan garuda. Motif kerang bermakna kelapangan hati, binatang menggambarkan watak sentosa, tumbuhan melambangkan kemakmuran, sedangkan sawat ketabahan hati. Motif ini dipakai sebagai simbol pemimpin yang berbudi luhur, berwibawa, cerdas, mampu memberi kemakmuran, serta selalu tabah dalam menjalankan pemerintahannya.",
                tambahan = "Hanya boleh dikenakan oleh raja dan putra mahkota."
            ),

            BatikClass(
                R.drawable.kawung,
                namabatik = "Batik Motif Kawung",
                deskbatik = "Motif kawung merupakan pola geometris dengan empat bentuk elips yang mengelilingi satu pusat. Bagan seperti ini dikenal dalam budaya Jawa sebagai keblat papat lima pancer. Ini dimaknai sebagai empat sumber tenaga alam atau empat penjuru mata angin. Motif kawung juga sering diartikan sebagai biji kawung atau kolang-kaling, buah pohon enau atau aren yang sangat bermanfaat bagi manusia.",
                tambahan = "Boleh dipakai oleh para Sentana Dalem."
            ),

            BatikClass(
                R.drawable.pklithik,
                namabatik = "Batik Motif Parang Klithik",
                deskbatik = "Motif ini merupakan pola parang dengan stilasi yang halus. ukurannya pun lebih kecil dan juga menggambarkan citra feminim, Motif ini melambangkan kelemah-lembutan, perilaku halus dan bijaksana.",
                tambahan = "Dipakai oleh putra ampeyan Dalem, putri raja, dan garwa ampeyan."
            ),

            BatikClass(
                R.drawable.parangbar,
                namabatik = "Batik Motif Parang Barong",
                deskbatik = " Motif Parang Barong menggambarkan pola garis-garis melintang yang bersifat terus-menerus, tanpa terputus. Garis-garis ini melambangkan kekuatan, keberanian, dan perlindungan yang melindungi pemakainya.",
                tambahan = "Dipakai oleh putra ampeyan Dalem, selir putra mahkota, cucu, dan wareng ."
            ),

            BatikClass(
                R.drawable.parangrusakbar,
                namabatik = "Batik Motif Parang Rusak Barong",
                deskbatik = "Motif Parang Rusak Barong memiliki pola garis-garis melintang yang terputus-putus atau tampak tidak sempurna. Motif ini mencerminkan ketidaksempurnaan dunia dan kehidupan manusia, namun tetap mempertahankan simbol perlindungan dan kekuatan dari sosok Barong.",
                tambahan = "Hanya boleh dikenakan oleh raja dan putra mahkota."
            ),

            BatikClass(
                R.drawable.pgendreh,
                namabatik = "Batik Motif Parang Gendreh",
                deskbatik = "Batik Parang Gendreh adalah salah satu motif batik yang memiliki pola Parang, yaitu garis-garis diagonal yang saling memotong membentuk segitiga. Motif ini memiliki makna dan simbolisme yang dalam dalam tradisi budaya Jawa.",
                tambahan = "Dipakai oleh istri sultan, istri putra mahkota, putra-putri dari putra mahkota."
            ),

            BatikClass(
                R.drawable.parangcur,
                namabatik = "Batik Motif Parang Curigo",
                deskbatik = "Batik Parang Curigo adalah salah satu motif batik yang terkenal dalam budaya Jawa. Motif ini menggambarkan garis-garis melengkung yang membentuk seperti duri atau dahan yang melingkar. Motif ini bermakna harapan agar pemakainya mendapatkan ketenangan, kecerdasan, dan kewibawaan.",
                tambahan = "Dikenakan hanya anggota keluarga kerajaan"
            ),

            BatikClass(
                R.drawable.parangslo,
                namabatik = "Batik Motif Parang Slobog",
                deskbatik = "Motif ini melambangkan keteguhan, ketelitian dan kesabaran, dan biasanya digunakan dalam upacara pelantikan. Motif ini mempunyai makna harapan agar pemimpin yang dilantik dapat mengemban dan menjalankan tugasnya dengan amanah disertai kebijaksanaan dalam diri.",
                tambahan = "Dikenakan hanya anggota keluarga kerajaan"
            ),

            BatikClass(
                R.drawable.semengurdha,
                namabatik = "Batik Motif Semen Ageng Sawat Gurdha",
                deskbatik = "Motif batik larangan lainnya adalah semen yang berkonotasi “semi” atau “tumbuh”. Motif semen memiliki makna kesuburan, kemakmuran, dan alam semesta. Dalam motif semen terdapat gambar lain berupa gunung atau meru, dan pada motif ini garuda. Pemakai motif semen diharapkan dapat menjadi pemimpin yang mampu melindungi bawahannya.",
                tambahan = "Dipakai untuk cucu sultan, istri para pangeran, dan penghulu"
            ),

            BatikClass(
                R.drawable.semenlar,
                namabatik = "Batik Motif Semen Ageng Sawat Lar",
                deskbatik = "Motif batik larangan lainnya adalah semen yang berkonotasi “semi” atau “tumbuh”. Motif semen memiliki makna kesuburan, kemakmuran, dan alam semesta. Dalam motif semen terdapat gambar lain berupa gunung atau meru, dan pada motif ini sayap. Pemakai motif semen diharapkan dapat menjadi pemimpin yang mampu melindungi bawahannya.",
                tambahan = "Dipakai untuk buyut dan canggah sultan"
            ),

            BatikClass(
                R.drawable.cemukiran,
                namabatik = "Batik Motif Cemukiran",
                deskbatik = "Motif cemukiran berbentuk lidah api atau sinar. Api adalah unsur kehidupan yang melambangkan keberanian, kesaktian, dan ambisi. Pola seperti sinar diibaratkan pancaran matahari yang melambangkan kehebatan dan keagungan. Baik api maupun sinar dalam konsep Jawa diibaratkan sebagai mawateja atau bersinar seperti wahyu, yaitu salah satu kriteria yang harus dimiliki seorang raja.",
                tambahan = "Hanya boleh dikenakan oleh raja dan putra mahkota."
            ),


            BatikClass(
                R.drawable.udanliris,
                namabatik = "Batik Motif Udan Liris",
                deskbatik = "Selanjutnya adalah motif udan liris yang diartikan sebagai hujan gerimis atau hujan rintik-rintik pembawa kesuburan bagi tumbuhan dan ternak. Udan Liris merupakan gabungan dari bermacam-macam motif dalam bentuk garis-garis sejajar.Makna dari motif ini adalah pengharapan agar pemakainya selamat sejahtera, tabah, dan berprakarsa dalam menunaikan kewajiban demi kepentingan nusa dan bangsa.",
                tambahan = "Dikenakan oleh putra dari garwa ampeyan, Pangeran Sentana dan Pangeran Adipati Anom."
            ),
        )

        val recyclerView: RecyclerView = binding.rv
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BatikAdapter(requireContext(), animeList) {
            val intent = Intent(requireContext(), DetailBatik::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

        recyclerView.setOnTouchListener { _, _ ->
            tvDescription.translationZ = recyclerView.translationZ
            false
        }
    }
}