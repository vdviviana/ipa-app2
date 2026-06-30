package com.bujolandia.ipaapp2.activity

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

import com.bujolandia.ipaapp2.R
import com.bujolandia.ipaapp2.view.home.HomeFragment

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, HomeFragment())
                .commit()
        }
    }
}