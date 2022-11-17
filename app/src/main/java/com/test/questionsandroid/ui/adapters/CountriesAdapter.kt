package com.test.questionsandroid.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.test.questionsandroid.databinding.ItemCountryBinding
import com.test.questionsandroid.ui.modelsUi.CountriesUi
import com.test.questionsandroid.ui.modelsUi.FifaCountriesUi

class CountriesAdapter : ListAdapter<FifaCountriesUi, CountriesAdapter.ViewHolderCountry>(COMPARATOR) {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolderCountry {
        return ViewHolderCountry(
            binding = ItemCountryBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolderCountry, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolderCountry(
        private val binding: ItemCountryBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: FifaCountriesUi) = with(binding) {
            tvCountryName.text = item.name

            Glide.with(ivCountryFlag)
                .load(item.flag)
                .into(ivCountryFlag)
        }
    }

    companion object {
        private val COMPARATOR = object : DiffUtil.ItemCallback<FifaCountriesUi>() {
            override fun areItemsTheSame(
                oldItem: FifaCountriesUi,
                newItem: FifaCountriesUi
            ): Boolean =
                oldItem.name == newItem.name

            override fun areContentsTheSame(
                oldItem: FifaCountriesUi,
                newItem: FifaCountriesUi
            ): Boolean =
                oldItem == newItem
        }
    }

}