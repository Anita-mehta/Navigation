package com.bhanguz.customnavigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.bhanguz.customnavigation.R
import com.bhanguz.customnavigation.databinding.FragmentNagiationBinding


class NagiationFragment : Fragment() {
    private var _binding : FragmentNagiationBinding?= null
    private val binding: FragmentNagiationBinding
    get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_nagiation, container, false)
        _binding = FragmentNagiationBinding.inflate(inflater,container,false)
        return binding.root
    }
        fun setClicklistener(){
            binding.btn2.setOnClickListener { navigateTo(NagiationFragmentDirections.actionMyNavigationFragmentToMyAboutragment()) }
        }

    private fun navigateTo(directions: NavDirections) {
        findNavController().navigate(directions)

    }
}