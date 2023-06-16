package com.example.herritagecorneruas.ui.batik

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.herritagecorneruas.R

class BatikAdapter(
    private val context: Context,
    private val batik: List<BatikClass>,
    val listener: (BatikClass) -> Unit
) : RecyclerView.Adapter<BatikAdapter.BatikViewHolder>() {

    class BatikViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val batikimg = view.findViewById<ImageView>(R.id.image)
        private val namabatik = view.findViewById<TextView>(R.id.tv_name)
        private val deskbatik = view.findViewById<TextView>(R.id.tv_desk)

        fun bindView(batik: BatikClass, listener: (BatikClass) -> Unit) {
            batikimg.setImageResource(batik.batikimg)
            namabatik.text = batik.namabatik
            deskbatik.text = batik.deskbatik
            itemView.setOnClickListener {
                listener(batik)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BatikViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.batik_view, parent, false)
        return BatikViewHolder(view)
    }

    override fun onBindViewHolder(holder: BatikViewHolder, position: Int) {
        holder.bindView(batik[position], listener)
    }

    override fun getItemCount(): Int = batik.size
}