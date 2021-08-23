package com.febrian.indonesiantravelguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.febrian.indonesiantravelguide.databinding.ItemListBinding

class ListAdapter(private val  list : ArrayList<Model>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    companion object{
        const val KEY_DATA = "KEY_DATA"
    }

    inner class ViewHolder(private val binding : ItemListBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(m : Model){
            with(binding){
                binding.title.text = m.name
                binding.location.text = m.tag
                Glide.with(itemView.context).load(m.images?.get(0)).into(binding.imageNews)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(KEY_DATA, m)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ViewHolder {
        val view = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListAdapter.ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}