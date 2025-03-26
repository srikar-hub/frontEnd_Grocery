package com.klu.onlinegrocery

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        setContentView(R.layout.activity_home)
        val bottomnav=findViewById<BottomNavigationView>(R.id.bottom_nav_bar)
        loadFragment(home_fragment())
        bottomnav.setOnItemSelectedListener {
                item->when(item.itemId){
            R.id.nav_dashboard->loadFragment(home_fragment())
            R.id.nav_search->loadFragment(search_fragmant_1())
            R.id.nav_profile->loadFragment(profile_fragment())
            R.id.nav_fees->loadFragment(fees_fragment())
        }
            true
        }
    }

    private fun loadFragment(fragment: Fragment): Boolean {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,fragment)
            .commit()
        return true
    }
}