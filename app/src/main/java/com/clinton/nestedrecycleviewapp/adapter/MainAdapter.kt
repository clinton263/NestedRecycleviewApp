package com.clinton.nestedrecycleviewapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.clinton.nestedrecycleviewapp.R
import com.clinton.nestedrecycleviewapp.databinding.ParentItemBinding
import com.clinton.nestedrecycleviewapp.model.MainModel

class MainAdapter(private val collection : List<MainModel>) : RecyclerView.Adapter<MainAdapter.CollectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.parent_item,parent,false)
        return CollectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collection[position]
            tvGenreMovie.text =collection.title
            val movieAdapter = MovieAdapter(collection.movieModels)
            rvMovieChild.adapter=movieAdapter
        }
    }

    override fun getItemCount() =collection.size

    inner class CollectionViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = ParentItemBinding.bind(itemView)
    }


}