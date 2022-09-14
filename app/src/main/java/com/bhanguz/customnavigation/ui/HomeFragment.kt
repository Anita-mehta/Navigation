package com.bhanguz.customnavigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.bhanguz.customnavigation.R
import com.bhanguz.customnavigation.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding
        get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        setClicklistener()
        return binding.root
    }
   fun setClicklistener(){
   binding.temporaryButton2.setOnClickListener { navigateTo(HomeFragmentDirections.actionMyHomeFragmentToMyAboutFragment()) }

   }
    private fun navigateTo(directions: NavDirections) {
        findNavController().navigate(directions)
    }


}