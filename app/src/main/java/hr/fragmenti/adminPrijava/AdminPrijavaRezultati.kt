package hr.fragmenti.adminPrijava

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import hr.dominik.nkjaki.R
import hr.dominik.nkjaki.databinding.AdminPrijavaRezultatiBinding

class AdminPrijavaRezultati: Fragment(R.layout.admin_prijava_rezultati) {

    private lateinit var binding: AdminPrijavaRezultatiBinding
    private val args by navArgs<AdminPrijavaRezultatiArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = AdminPrijavaRezultatiBinding.bind(view)

        binding.gumbPrijavaAdminPrijaviSe.setOnClickListener {
            val korisnickoIme = binding.etPrijavaAdminKorisnickoIme.text.toString()
            val lozinka = binding.etPrijavaAdminLozinka.text.toString()
            val token = binding.etPrijavaAdminToken.text.toString()

            if(korisnickoIme == "Dominik" && token == "token" && lozinka == "lozinka"){
                val action = AdminPrijavaRezultatiDirections.actionAdminPrijavaRezultatiToUpdateRezultatFragment(args.currentRezultatArgs)
                findNavController().navigate(action)
            }else if (binding.etPrijavaAdminKorisnickoIme.text.toString().isEmpty()){
                binding.etPrijavaAdminKorisnickoIme.error = "Ovo polje je obavezno!"
            }else if (binding.etPrijavaAdminLozinka.text.toString().isEmpty()){
                binding.etPrijavaAdminLozinka.error = "Ovo polje je obavezno!"
            }else if(binding.etPrijavaAdminToken.text.toString().isEmpty()){
                binding.etPrijavaAdminToken.error = "Ovo polje je obavezno!"
            }else{
                Toast.makeText(requireContext(),"Unjeli ste krive podatke!", Toast.LENGTH_LONG).show()
            }
        }
    }

}