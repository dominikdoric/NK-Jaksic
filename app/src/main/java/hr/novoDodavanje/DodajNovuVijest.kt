package hr.novoDodavanje

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import hr.database.table.Vijesti
import hr.dominik.nkjaki.R
import hr.viewModel.VijestiViewModel
import kotlinx.android.synthetic.main.fragment_nova_vijest.*
import kotlinx.android.synthetic.main.fragment_nova_vijest.view.*
import kotlinx.android.synthetic.main.fragment_novi_igrac.*
import kotlinx.coroutines.InternalCoroutinesApi
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class DodajNovuVijest: Fragment() {

    @InternalCoroutinesApi
    private val mVijestiViewModel: VijestiViewModel by viewModels()

    @InternalCoroutinesApi
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_nova_vijest, container, false)

        view.novaVijestGumbSpremi.setOnClickListener {
            val action = DodajNovuVijestDirections.actionDodajNovuVijest2ToVijestiFragment()
            findNavController().navigate(action)
            insertDataToDatabase()
        }
        return view
    }

    @InternalCoroutinesApi
    private fun insertDataToDatabase() {
        val sdf = SimpleDateFormat("dd.MM.yyyy. HH:mm")
        val currentDate = sdf.format(Date())

        val noviNaslov = novaVijestNaslov.text.toString()
        val novoVrijeme = currentDate
        val noviClanak = novaVijestClanak.text.toString()
        val novaSlika = R.drawable.jaksic

        val vijest = Vijesti(0,noviNaslov,noviClanak,novoVrijeme,novaSlika)
        mVijestiViewModel.addVijesti(vijest)
    }
 }
