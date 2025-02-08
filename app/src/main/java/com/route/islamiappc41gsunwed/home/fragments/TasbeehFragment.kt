package com.route.islamiappc41gsunwed.home.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islamiappc41gsunwed.R
import com.route.islamiappc41gsunwed.databinding.FragmentTasbeehBinding

class TasbeehFragment : Fragment() {
    private var azkarCounter = 0
    private var azkarCounterPosition = 0
    lateinit var azkList: MutableList<String>
    lateinit var binding: FragmentTasbeehBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTasbeehBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        azkList = resources.getStringArray(R.array.azkarlist).toMutableList()
        initViews()
        sebhaclick()
    }

    private fun initViews() {
        binding.txZek.text = azkList[azkarCounterPosition]
        binding.count.text = azkarCounter.toString()
    }

    private fun sebhaclick() {
        binding.imgSebha.setOnClickListener {
            binding.imgSebha.rotation += (360 / 33).toFloat()
            if (azkarCounter < 33) {
                azkarCounter++
                binding.count.text = azkarCounter.toString()
            } else {
                azkarCounter = 0
                azkarCounterPosition =
                    if (azkarCounterPosition < azkList.size - 1) azkarCounterPosition + 1 else 0
                binding.txZek.text = azkList[azkarCounterPosition]
            }
            binding.count.text = azkarCounter.toString()
        }
    }
}

