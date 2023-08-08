package com.example.fitnessapp

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.MenuItem
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.appcompat.app.AppCompatDelegate

import com.google.android.material.bottomnavigation.BottomNavigationView

class HOME : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)


        supportActionBar?.hide()

        setContentView(R.layout.home)

       val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navbar)
        bottomNavigationView.setOnNavigationItemSelectedListener(itemSlc)
        //this code use to fix this fragment on  home page//
        fragmentReplacer(fragmenthome())

    }

    //code for replacing and enforcing fragment in frame layout//
    private fun fragmentReplacer(frag: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag)
        ft.commit()
    }

    private val itemSlc = BottomNavigationView.OnNavigationItemSelectedListener{ menuItem ->
        when (menuItem.itemId) {
            R.id.gtips -> {
                val fragment1tips = fragment1tips()// Create an instance of your custom Fragment class
               // fragment1tips.setCustomLayout(R.layout.image_icon) // Set the custom layout for the fragment
               // fragment1tips.setIconResource(R.drawable.gymtips2) // Set the image resource for the custom ImageView
                fragmentReplacer(fragment1tips())
                return@OnNavigationItemSelectedListener true
            }
            R.id.foodnut -> {
                val fragment2nut = fragment2nut()
               // fragment2nut.setCustomLayout(R.layout.image_icon) // Set the custom layout for the fragment
               // fragment2nut.setIconResource(R.drawable.nutritionapp) // Set the image resource for the custom ImageView
                fragmentReplacer(fragment2nut())
                return@OnNavigationItemSelectedListener true
            }
            R.id.ownwork -> {
                val fragment3own=fragment3own()
              //  fragment3own.setCustomLayout(R.layout.image_icon) // Set the custom layout for the fragment
              //  fragment3own.setIconResource(R.drawable.whattodo) // Set the image resource for the custom ImageView
                fragmentReplacer(fragment3own())
                return@OnNavigationItemSelectedListener true
            }
            else -> {
                // Handle other cases here
                return@OnNavigationItemSelectedListener false
            }

        }

    }
}


