package com.route.islamiappc41gsunwed.home.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.route.islamiappc41gsunwed.databinding.ItemHadethBinding
import com.route.islamiappc41gsunwed.home.model.Hadeth

class HadethAdapter(val hadethList: List<Hadeth>) : Adapter<HadethAdapter.HadethViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HadethViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemHadethBinding.inflate(inflater, parent, false)
        return HadethViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return hadethList.size
    }

    override fun onBindViewHolder(holder: HadethViewHolder, position: Int) {
        val item = hadethList[position]
        holder.bind(hadeth = item)
    }

    class HadethViewHolder(val binding: ItemHadethBinding) : ViewHolder(binding.root) {
        fun bind(hadeth: Hadeth) {
            binding.hadethTitle.text = hadeth.title
            binding.hadethDescription.text = hadeth.description
        }
    }


}