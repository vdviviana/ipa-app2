package com.bujolandia.ipaapp2.view.vowels

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

import com.bujolandia.ipaapp2.R
import com.bujolandia.ipaapp2.view.home.HomeFragment

import android.media.MediaPlayer
import com.bujolandia.ipaapp2.view.info_vowels.InfoVowelsFragment

class VowelsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_vowels, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /* vuelve a home*/
        val btnVolver = view.findViewById<Button>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            openFragment(HomeFragment())
        }
        /*navega a info*/
        val btnInfoVowels = view.findViewById<Button>(R.id.btnInfoVowels)
        btnInfoVowels.setOnClickListener {
            openFragment(InfoVowelsFragment())
        }

        /* boton sonido "ae"*/
        val btnvocal1 = view.findViewById<Button>(R.id.btnvocal1)
        btnvocal1.setOnClickListener {
            playSound(R.raw.soundvocal1)
        }

        /* boton sonido "ɜː"*/
        val btnvocal2 = view.findViewById<Button>(R.id.btnvocal2)
        btnvocal2.setOnClickListener {
            playSound(R.raw.soundvocal2)
        }

        /* boton sonido "ɪ"*/
        val btnvocal3 = view.findViewById<Button>(R.id.btnvocal3)
        btnvocal3.setOnClickListener {
            playSound(R.raw.soundvocal3)
        }

        /* boton sonido "ɛ"*/
        val btnvocal4 = view.findViewById<Button>(R.id.btnvocal4)
        btnvocal4.setOnClickListener {
            playSound(R.raw.soundvocal4)
        }

        /* boton sonido "iː"*/
        val btnvocal5 = view.findViewById<Button>(R.id.btnvocal5)
        btnvocal5.setOnClickListener {
            playSound(R.raw.soundvocal5)
        }

        /* boton sonido "ə"*/
        val btnvocal6 = view.findViewById<Button>(R.id.btnvocal6)
        btnvocal6.setOnClickListener {
            playSound(R.raw.soundvocal6)
        }

        /* boton  vocal "ʌ"*/
        val btnvocal7 = view.findViewById<Button>(R.id.btnvocal7)
        btnvocal7.setOnClickListener {
            playSound(R.raw.soundvocal7)
        }

        /* boton  vocal "ɑː"*/
        val btnvocal8 = view.findViewById<Button>(R.id.btnvocal8)
        btnvocal8.setOnClickListener {
            playSound(R.raw.soundvocal8)
        }

        /* boton vocal "ɒ" */
        val btnvocal9 = view.findViewById<Button>(R.id.btnvocal9)
        btnvocal9.setOnClickListener {
            playSound(R.raw.soundvocal9)
        }

        /* boton vocal "ʊ" */
        val btnvocal10 = view.findViewById<Button>(R.id.btnvocal10)
        btnvocal10.setOnClickListener {
            playSound(R.raw.soundvocal10)
        }
        /* boton vocal "ɔː" */
        val btnvocal11 = view.findViewById<Button>(R.id.btnvocal11)
        btnvocal11.setOnClickListener {
            playSound(R.raw.soundvocal11)
        }
        /* boton vocal "uː"*/
        val btnvocal12 = view.findViewById<Button>(R.id.btnvocal12)
        btnvocal12.setOnClickListener {
            playSound(R.raw.soundvocal12)
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