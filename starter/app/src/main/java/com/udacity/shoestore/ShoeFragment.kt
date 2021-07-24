package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentShoeBinding
import com.udacity.shoestore.databinding.FragmentWelcomeBinding

class ShoeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentShoeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe, container, false)
        return binding.root
    }
}