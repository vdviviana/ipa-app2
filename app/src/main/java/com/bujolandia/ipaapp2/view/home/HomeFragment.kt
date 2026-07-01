package com.bujolandia.ipaapp2.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

import com.bujolandia.ipaapp2.R
import com.bujolandia.ipaapp2.view.consonants.ConsonantsFragment
import com.bujolandia.ipaapp2.view.developer.DeveloperFragment
import com.bujolandia.ipaapp2.view.diphthongs.DiphthongsFragment
import com.bujolandia.ipaapp2.view.vowels.VowelsFragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnVowels = view.findViewById<Button>(R.id.btnVowels)
        val btnConsonants = view.findViewById<Button>(R.id.btnConsonants)
        val btnDiphthongs = view.findViewById<Button>(R.id.btnDiphthongs)
        val btnDev= view.findViewById<Button>(R.id.btnDev)

        btnVowels.setOnClickListener {
            openFragment(VowelsFragment())
        }

        btnConsonants.setOnClickListener {
            openFragment(ConsonantsFragment())
        }

        btnDiphthongs.setOnClickListener {
            openFragment(DiphthongsFragment())
        }
        /*pantalla dev bujolandia*/
        btnDev.setOnClickListener {
            openFragment(DeveloperFragment())
        }
    }

    private fun openFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .addToBackStack(null)
            .commit()
    }
}