package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentDetailBinding
import com.udacity.shoestore.databinding.FragmentShoeBinding
import com.udacity.shoestore.models.ShoeDetailViewModel
import com.udacity.shoestore.models.ShoeViewModel


class DetailFragment : Fragment() {

    private lateinit var viewModel: ShoeDetailViewModel
    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_detail, container, false)
        binding.enterDetailsButton.setOnClickListener {
            findNavController().navigate(DetailFragmentDirections.actionDetailFragmentToShoeFragment())
        }

        viewModel = ViewModelProvider(this).get(ShoeDetailViewModel::class.java)
        binding.shoeDetailViewModel = viewModel

        return binding.root
    }
}