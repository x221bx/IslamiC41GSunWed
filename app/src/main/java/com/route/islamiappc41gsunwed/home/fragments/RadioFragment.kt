package com.route.islamiappc41gsunwed.home.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islamiappc41gsunwed.databinding.FragmentHadethBinding
import com.route.islamiappc41gsunwed.databinding.FragmentQuranBinding
import com.route.islamiappc41gsunwed.databinding.FragmentRadioBinding

class RadioFragment : Fragment() {
    lateinit var binding: FragmentRadioBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRadioBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
