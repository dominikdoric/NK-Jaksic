package hr.fragmenti.novoDodavanje

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import hr.database.table.TablicaRezultati
import hr.dominik.nkjaki.R
import hr.fragmenti.novoDodavanje.DodajNoviRezultatLigaFragmentDirections
import hr.viewModel.TablicaRezultatiViewModel
import kotlinx.android.synthetic.main.fragment_novi_rezultati_liga.*
import kotlinx.android.synthetic.main.fragment_novi_rezultati_liga.view.*
import kotlinx.coroutines.InternalCoroutinesApi

@AndroidEntryPoint
class DodajNoviRezultatLigaFragment: Fragment() {

    @InternalCoroutinesApi
    private val mTablicaRezultatViewModel: TablicaRezultatiViewModel by viewModels()

    @InternalCoroutinesApi
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_novi_rezultati_liga,container, false)

        view.gumbSpremiTablicaRezultat.setOnClickListener {
            val action =
                DodajNoviRezultatLigaFragmentDirections.actionDodajNoviRezultatLigaFragmentToTablicaRezultatiFragment()
            findNavController().navigate(action)
            insertDataToDatabase()
        }

        return view
    }

    @InternalCoroutinesApi
    private fun insertDataToDatabase() {
        val noviRezultatLigaBrojKola = noviRezultatLigaBrojKola.text.toString()

        val noviRezultatLigaPrviDatum = noviRezultatLigaPrviDatum.text.toString()
        val noviRezultatLigaPrviDomacin = noviRezultatLigaPrviDomacin.text.toString()
        val noviRezultatLigaPrviGost = noviRezultatLigaPrviGost.text.toString()
        val noviRezultatLigaPrvoVrijeme = noviRezultatLigaPrviRezultat.text.toString()

        val noviRezultatLigaDrugiDatum = noviRezultatLigaDrugiDatum.text.toString()
        val noviRezultatLigaDrugiDomacin = noviRezultatLigaDrugiDomacin.text.toString()
        val noviRezultatLigaDrugiGost = noviRezultatLigaDrugiGost.text.toString()
        val noviRezultatLigaDrugoVrijeme = noviRezultatLigaDrugiRezultat.text.toString()

        val noviRezultatLigaTreciDatum = noviRezultatLigaTreciDatum.text.toString()
        val noviRezultatLigaTreciDomacin = noviRezultatLigaTreciDomacin.text.toString()
        val noviRezultatLigaTreciGost = noviRezultatLigaTreciGost.text.toString()
        val noviRezultatLigaTreceVrijeme = noviRezultatLigaTreciRezultat.text.toString()

        val noviRezultatLigaCetvrtiDatum = noviRezultatLigaCetvrtiDatum.text.toString()
        val noviRezultatLigaCetvrtiDomacin = noviRezultatLigaCetvrtiDomacin.text.toString()
        val noviRezultatLigaCetvrtiGost = noviRezultatLigaCetvrtiGost.text.toString()
        val noviRezultatLigaCetvrtoVrijeme = noviRezultatLigaCetvrtiRezultat.text.toString()


        val noviRezultatLigaPetiDatum = noviRezultatLigaPetiDatum.text.toString()
        val noviRezultatLigaPetiDomacin = noviRezultatLigaPetiDomacin.text.toString()
        val noviRezultatLigaPetiGost = noviRezultatLigaPetiGost.text.toString()
        val noviRezultatLigaPetoVrijeme = noviRezultatLigaPetiRezultat.text.toString()

        val noviRezultatLigaSestiDatum = noviRezultatLigaSestiDatum.text.toString()
        val noviRezultatLigaSestiDomacin = noviRezultatLigaSestiDomacin.text.toString()
        val noviRezultatLigaSestiGost = noviRezultatLigaSestiGost.text.toString()
        val noviRezultatLigaSestoVrijeme = noviRezultatLigaSestiRezultat.text.toString()

        val noviRezultatLigaSedmiDatum = noviRezultatLigaSedmiDatum.text.toString()
        val noviRezultatLigaSedmiDomacin = noviRezultatLigaSedmiDomacin.text.toString()
        val noviRezultatLigaSedmiGost = noviRezultatLigaSedmiGost.text.toString()
        val noviRezultatLigaSedmoVrijeme = noviRezultatLigaSedmiRezultat.text.toString()

            //Create object
            val tablicaRezultat = TablicaRezultati(0,noviRezultatLigaBrojKola,
                noviRezultatLigaPrviDatum,noviRezultatLigaPrviDomacin,noviRezultatLigaPrviGost,noviRezultatLigaPrvoVrijeme,
                noviRezultatLigaDrugiDatum,noviRezultatLigaDrugiDomacin,noviRezultatLigaDrugiGost,noviRezultatLigaDrugoVrijeme,
                noviRezultatLigaTreciDatum,noviRezultatLigaTreciDomacin,noviRezultatLigaTreciGost,noviRezultatLigaTreceVrijeme,
                noviRezultatLigaCetvrtiDatum,noviRezultatLigaCetvrtiDomacin,noviRezultatLigaCetvrtiGost,noviRezultatLigaCetvrtoVrijeme,
                noviRezultatLigaPetiDatum,noviRezultatLigaPetiDomacin,noviRezultatLigaPetiGost,noviRezultatLigaPetoVrijeme,
                noviRezultatLigaSestiDatum,noviRezultatLigaSestiDomacin,noviRezultatLigaSestiGost,noviRezultatLigaSestoVrijeme,
                noviRezultatLigaSedmiDatum,noviRezultatLigaSedmiDomacin,noviRezultatLigaSedmiGost,noviRezultatLigaSedmoVrijeme)

            mTablicaRezultatViewModel.addTablicaRezultat(tablicaRezultat)
            Toast.makeText(requireContext(),"Successfully added", Toast.LENGTH_LONG).show()

    }
}