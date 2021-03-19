package hr.detailFragmenti

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import hr.dominik.nkjaki.R
import hr.viewModel.MomcadViewModel
import kotlinx.android.synthetic.main.detail_momcad_fragment.view.*
import kotlinx.coroutines.InternalCoroutinesApi

class DetailMomcadFragment: Fragment() {

    private val args by navArgs<DetailMomcadFragmentArgs>()
    @InternalCoroutinesApi
    private lateinit var mDetailMomcadViewModel: MomcadViewModel

    @InternalCoroutinesApi
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.detail_momcad_fragment,container,false)

        mDetailMomcadViewModel = ViewModelProvider(this).get(MomcadViewModel::class.java)

        view.detailIgracIme.setText(args.detailMomcadArgs.ime)
        view.detailIgracPrezime.setText(args.detailMomcadArgs.prezime)
        view.detailIgracPozicija.setText(args.detailMomcadArgs.pozicija)
        view.detailIgracOdigraniSusreti.setText(args.detailMomcadArgs.odigranihSusreta)
        view.detailIgracGolovi.setText(args.detailMomcadArgs.golova)
        view.detailIgracAsistencije.setText(args.detailMomcadArgs.asistencija)
        view.detailIgracOdigraneMinute.setText(args.detailMomcadArgs.odigranihMinuta)
        view.detailIgracZutiKartoni.setText(args.detailMomcadArgs.zutiKartoni)
        view.detailIgracCrveniKartoni.setText(args.detailMomcadArgs.crveniKartoni)
        view.detailIgracBroj.setText(args.detailMomcadArgs.broj)
        view.detailIgracOpis.setText(args.detailMomcadArgs.opis)

        return view
    }

}