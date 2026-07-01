package com.bujolandia.ipaapp2.view.consonants

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

import com.bujolandia.ipaapp2.R
import com.bujolandia.ipaapp2.view.home.HomeFragment
import com.bujolandia.ipaapp2.view.info_consonants.InfoConsonantsFragment
import com.bujolandia.ipaapp2.view.info_vowels.InfoVowelsFragment

class ConsonantsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_consonants, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /* vuelve a home*/
        val btnVolver = view.findViewById<Button>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            openFragment(HomeFragment())
        }
        /*navega a info*/
        val btnInfoConsonants = view.findViewById<Button>(R.id.btnInfoConsonants)
        btnInfoConsonants.setOnClickListener {
            openFragment(InfoConsonantsFragment())
        }

        /* boton sonido "ð" */
        val btnconsonants1 = view.findViewById<Button>(R.id.btnconsonants1)
        btnconsonants1 .setOnClickListener {
            playSound(R.raw.soundconsonants1)
        }
        /* boton sonido "θ"*/
        val btnconsonants2 = view.findViewById<Button>(R.id.btnconsonants2)
        btnconsonants2 .setOnClickListener {
            playSound(R.raw.soundconsonants2)
        }
        /* boton sonido "v" */
        val btnconsonants3 = view.findViewById<Button>(R.id.btnconsonants3)
        btnconsonants3 .setOnClickListener {
            playSound(R.raw.soundconsonants3)
        }
        /* boton sonido "z" */
        val btnconsonants4 = view.findViewById<Button>(R.id.btnconsonants4)
        btnconsonants4 .setOnClickListener {
            playSound(R.raw.soundconsonants4)
        }
        /* boton sonido "ʃ" */
        val btnconsonants5 = view.findViewById<Button>(R.id.btnconsonants5)
        btnconsonants5 .setOnClickListener {
            playSound(R.raw.soundconsonants5)
        }
        /* boton sonido "ŋ" */
        val btnconsonants6 = view.findViewById<Button>(R.id.btnconsonants6)
        btnconsonants6 .setOnClickListener {
            playSound(R.raw.soundconsonants6)
        }
        /* boton sonido "h" */
        val btnconsonants7 = view.findViewById<Button>(R.id.btnconsonants7)
        btnconsonants7 .setOnClickListener {
            playSound(R.raw.soundconsonants7)
        }

        /*boton sonido "tʃ" */
        val btnconsonants8 = view.findViewById<Button>(R.id.btnconsonants8)
        btnconsonants8 .setOnClickListener {
            playSound(R.raw.soundconsonants8)
        }
        /*boton sonido "dʒ" */
        val btnconsonants9 = view.findViewById<Button>(R.id.btnconsonants9)
        btnconsonants9 .setOnClickListener {
            playSound(R.raw.soundconsonants9)
        }
        /*boton sonido "j" */
        val btnconsonants10 = view.findViewById<Button>(R.id.btnconsonants10)
        btnconsonants10 .setOnClickListener {
            playSound(R.raw.soundconsonants10)
        }
    }

    /*funcion para btn sonido*/
    private fun playSound(soundResId: Int) {
        val mediaPlayer = MediaPlayer.create(requireContext(), soundResId)
        mediaPlayer.start()
        mediaPlayer.setOnCompletionListener {
            it.release()
        }
    }

    private fun openFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .addToBackStack(null)
            .commit()
    }
}