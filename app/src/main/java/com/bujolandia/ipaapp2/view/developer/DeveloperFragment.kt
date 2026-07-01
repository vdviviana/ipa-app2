package com.bujolandia.ipaapp2.view.developer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

import com.bujolandia.ipaapp2.R
import com.bujolandia.ipaapp2.view.home.HomeFragment

class DeveloperFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_developer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnVolver = view.findViewById<Button>(R.id.btnVolver)

        btnVolver.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, HomeFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}