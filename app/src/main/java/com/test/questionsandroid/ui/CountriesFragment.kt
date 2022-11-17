package com.test.questionsandroid.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.test.questionsandroid.databinding.FragmentCountriesBinding
import com.test.questionsandroid.ui.adapters.CountriesAdapter
import com.test.questionsandroid.ui.viewmodels.CountriesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CountriesFragment : Fragment() {

    private val viewModel: CountriesViewModel by viewModels()

    private var _binding: FragmentCountriesBinding? = null
    private val binding get() = _binding!!

    private val adapterCountry = CountriesAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCountriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initObservers()
    }

    private fun initView() = with(binding) {
        rvCountries.adapter = adapterCountry
    }

    private fun initObservers() = with(viewModel) {
        fifaCountries.observe(viewLifecycleOwner) { list ->
            adapterCountry.submitList(list)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}