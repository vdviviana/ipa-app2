package com.bujolandia.ipaapp2.view.info_diphthongs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

import com.bujolandia.ipaapp2.R
import com.bujolandia.ipaapp2.view.diphthongs.DiphthongsFragment

class InfoDiphthongsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info_diphthongs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnVolver = view.findViewById<Button>(R.id.btnVolver)

        btnVolver.setOnClickListener {
            openFragment(DiphthongsFragment())
        }
    }

    private fun openFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .addToBackStack(null)
            .commit()
    }
}