package com.example.herritagecorneruas.ui.museum

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.herritagecorneruas.R
import com.example.herritagecorneruas.databinding.FragmentMuseumBinding

class MuseumFragment : Fragment() {

    private var _binding: FragmentMuseumBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val MuseumViewModel =
            ViewModelProvider(this).get(MuseumViewModel::class.java)

        _binding = FragmentMuseumBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMuseum
        MuseumViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }


        val buttonpesan = root.findViewById<Button>(R.id.buttonpesan)
        buttonpesan.setOnClickListener {
            val url = "https://ullensentalu.com/index.html"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val buttonmap = root.findViewById<Button>(R.id.buttonmap)
        buttonmap.setOnClickListener {
            val url = "https://goo.gl/maps/qPysV7b2bx9EvkbLA"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}