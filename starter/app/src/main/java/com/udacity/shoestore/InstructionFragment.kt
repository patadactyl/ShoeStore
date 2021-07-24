package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentInstructionBinding


class InstructionFragment : Fragment() {

    private var _binding: FragmentInstructionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentInstructionBinding.inflate(
            inflater, container, false
        )
        binding.enterButton.setOnClickListener {
            findNavController().navigate(InstructionFragmentDirections.actionInstructionFragmentToShoeFragment())
        }
        return binding.root
    }
}