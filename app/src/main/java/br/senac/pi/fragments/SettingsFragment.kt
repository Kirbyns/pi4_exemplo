package br.senac.pi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.senac.pi.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {
        lateinit var binding:FragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      binding =FragmentSettingsBinding.inflate(inflater)
        // na atividade setContentView(binding.root)

        //antes do return vai to do codigo de configuração da Activity
        return binding.root
    }

}