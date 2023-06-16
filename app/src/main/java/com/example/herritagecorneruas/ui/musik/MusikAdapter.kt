package com.example.herritagecorneruas.ui.musik

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.herritagecorneruas.R
import com.example.herritagecorneruas.ui.musik.MusikClass

class MusikAdapter(
    private val context: Context,
    private val musik: List<MusikClass>,
    val listener: (MusikClass) -> Unit
) : RecyclerView.Adapter<MusikAdapter.MusikViewHolder>() {

    class MusikViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val musikimg = view.findViewById<ImageView>(R.id.image)
        private val namamusik = view.findViewById<TextView>(R.id.tv_name)
        private val deskmusik = view.findViewById<TextView>(R.id.tv_desk)

        fun bindView(musik: MusikClass, listener: (MusikClass) -> Unit) {
            musikimg.setImageResource(musik.musikimg)
            namamusik.text = musik.namamusik
            deskmusik.text = musik.deskmusik
            itemView.setOnClickListener {
                listener(musik)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusikViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.musik_view, parent, false)
        return MusikViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusikViewHolder, position: Int) {
        holder.bindView(musik[position], listener)
    }

    override fun getItemCount(): Int = musik.size
}