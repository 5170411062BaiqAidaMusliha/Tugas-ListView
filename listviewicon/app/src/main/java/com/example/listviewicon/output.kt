package com.example.listviewicon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.listviewicon.R

class output(private val list_data: ArrayList<getset>) : RecyclerView.Adapter<output.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback
    //mendeklarasikan OnItemClickCallBack untuk menampilkan data sentuh

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.icon, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int { //mendapatkan data item dari DataArray
        return list_data.size
    }

    override fun onBindViewHolder(holder: output.ListViewHolder, position: Int) {
        val data = list_data[position]
        Glide.with(holder.itemView.context)
            .load(data.iconis)
            .apply(RequestOptions().override(55, 55))
            .into(holder.image)

        holder.Name.text = data.tittles
        holder.Detail.text = data.subtittles
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(list_data[holder.adapterPosition]) }

    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback ) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var Name: TextView = itemView.findViewById(R.id.tittle)
        var Detail: TextView = itemView.findViewById(R.id.sub)
        var image: ImageView = itemView.findViewById(R.id.imageView)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: getset)
    }
}