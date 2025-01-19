package com.route.islamiappc41gsunwed.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.route.islamiappc41gsunwed.R
import com.route.islamiappc41gsunwed.databinding.ActivityHomeBinding
import com.route.islamiappc41gsunwed.home.fragments.HadethFragment
import com.route.islamiappc41gsunwed.home.fragments.QuranFragment
import com.route.islamiappc41gsunwed.home.fragments.RadioFragment
import com.route.islamiappc41gsunwed.home.fragments.TasbeehFragment

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.islamicBottomNavView.setOnItemSelectedListener { menuItem ->
            if (menuItem.itemId == R.id.navigation_quran) {
                showFragment(QuranFragment())
            } else if (menuItem.itemId == R.id.navigation_hadeth) {
                showFragment(HadethFragment())
            } else if (menuItem.itemId == R.id.navigation_tasbeeh) {
                showFragment(TasbeehFragment())
            } else if (menuItem.itemId == R.id.navigation_radio) {
                showFragment(RadioFragment())
            } else {
                showFragment(RadioFragment())
            }
            return@setOnItemSelectedListener true
        }
        binding.islamicBottomNavView.selectedItemId = R.id.navigation_quran
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.islamic_fragment_container, fragment)
            .commit()
    }

}