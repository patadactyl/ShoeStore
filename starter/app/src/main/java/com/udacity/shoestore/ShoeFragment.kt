package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentShoeBinding
import com.udacity.shoestore.models.ShoeViewModel

class ShoeFragment : Fragment() {

    private lateinit var viewModel: ShoeViewModel
    private lateinit var binding: FragmentShoeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe, container, false)

        viewModel = ViewModelProvider(this).get(ShoeViewModel::class.java)
        binding.shoeViewModel = viewModel

        return binding.root
    }
}