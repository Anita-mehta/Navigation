package com.bhanguz.customnavigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.bhanguz.customnavigation.databinding.FragmentAboutBinding



class AboutFragment : Fragment() {
  private var _binding :FragmentAboutBinding?=null
 private  val binding :FragmentAboutBinding
 get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_about, container, false)
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
           setClicklistener()
        return binding.root
    }

        fun navigateTo(directions: NavDirections) {
            findNavController().navigate(directions)

        }


        fun setClicklistener(){
            binding.btn1.setOnClickListener { navigateTo(AboutFragmentDirections.actionMyAboutFragmentToMyNavigationFragment()) }

        }

}
