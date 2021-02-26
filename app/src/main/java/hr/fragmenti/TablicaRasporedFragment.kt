package hr.fragmenti

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import hr.adapteri.TablicaRasporedAdapter
import hr.adapteri.RasporedAdapter
import hr.database.NKJaksicDatabase
import hr.database.table.TablicaRaspored
import hr.dominik.nkjaki.R
import hr.viewModel.TablicaRasporedViewModel
import kotlinx.android.synthetic.main.tablica_fragment_raspored.*
import kotlinx.android.synthetic.main.tablica_fragment_raspored.view.*
import kotlinx.coroutines.InternalCoroutinesApi

class TablicaRasporedFragment : Fragment() {

    @InternalCoroutinesApi
    private lateinit var mTablicaRasporedViewModel: TablicaRasporedViewModel

    @InternalCoroutinesApi
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tablica_fragment_raspored, container, false)

        //RecyclerView
        val adapter = TablicaRasporedAdapter()
        val recyclerTablicaRaspored = view.tablicaRecyclerViewRaspored
        recyclerTablicaRaspored.adapter = adapter
        recyclerTablicaRaspored.layoutManager = LinearLayoutManager(requireContext())

        //TablicaRasporedViewModel
        mTablicaRasporedViewModel = ViewModelProvider(this).get(TablicaRasporedViewModel::class.java)
        mTablicaRasporedViewModel.readAllDataTablicaRaspored.observe(viewLifecycleOwner, Observer { tablicaRaspored ->
            adapter.setData(tablicaRaspored)
        })

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
/*
        val database = getActivity()?.let {
            Room.databaseBuilder(
                it, NKJaksicDatabase::class.java,"nk_jaksic_baza"
            )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        }
*/
        tablicaRecyclerViewRaspored.addItemDecoration(DividerItemDecoration
            (tablicaRecyclerViewRaspored.context,DividerItemDecoration.VERTICAL))
/*
        database?.rasporedDao()?.insertRaspored(Raspored(0,"21.02","NK Jakšić-NK Kuzmica"))
        database?.rasporedDao()?.insertRaspored(Raspored(1,"21.02","NK Jakšić-NK Požega"))
        database?.rasporedDao()?.insertRaspored(Raspored(2,"21.02","NK Jakšić-NK Mihaljevci"))
        database?.rasporedDao()?.insertRaspored(Raspored(3,"21.02","NK Jakšić-NK Gradac"))
        database?.rasporedDao()?.insertRaspored(Raspored(4,"21.02","NK Jakšić-NK Trenkovo"))
        database?.rasporedDao()?.insertRaspored(Raspored(5,"21.02","NK Jakšić-NK Vidovci"))
        database?.rasporedDao()?.insertRaspored(Raspored(6,"21.02","NK Jakšić-NK Eminovci"))
        database?.rasporedDao()?.insertRaspored(Raspored(7,"21.02","NK Jakšić-NK Rajsavac"))
        database?.rasporedDao()?.insertRaspored(Raspored(8,"21.02","NK Jakšić-NK Buk"))
*/
        //database?.najboljiStrijelciDao()?.deleteNajboljiStrijelci()
        //val examplePokusRasporedList = database?.rasporedDao()?.getRasporedData()

        //tablicaRecyclerViewRaspored.adapter = examplePokusRasporedList?.let { TablicaRasporedAdapter(it) }
        //tablicaRecyclerViewRaspored.layoutManager = LinearLayoutManager(context)
        //tablicaRecyclerViewRaspored.setHasFixedSize(true)

/*
        database?.tablicaRasporedDao()?.insertRaspored(TablicaRaspored(0,1,
            "19.09","NK Jakšić","NK Kuzmica","15:30",
            "19.09","NK Vidovci","NK Požega","15:30",
            "20.09","NK Mihaljevci","NK Trenkovo","16:00",
            "20.09","NK Buk","NK Rajsavac","16:15",
            "19.09","NK Papuk","NK Gradac","14:30",
            "19.09","NK Eminovci","NK Drenovac","15:00",
            "21.09","NK Zagrađe","NK Bučje","14:15"))


        database?.tablicaRasporedDao()?.insertRaspored(TablicaRaspored(1,2,
            "19.09","NK Jakšić","NK Kuzmica","15:30",
            "19.09","NK Vidovci","NK Požega","15:30",
            "20.09","NK Mihaljevci","NK Trenkovo","16:00",
            "20.09","NK Buk","NK Rajsavac","16:15",
            "19.09","NK Papuk","NK Gradac","14:30",
            "19.09","NK Eminovci","NK Drenovac","15:00",
            "21.09","NK Zagrađe","NK Bučje","14:15"))


        database?.tablicaRasporedDao()?.insertRaspored(
            TablicaRaspored(2,3,
            "19.09","NK Jakšić","NK Kuzmica","15:30",
            "19.09","NK Vidovci","NK Požega","15:30",
            "20.09","NK Mihaljevci","NK Trenkovo","16:00",
            "20.09","NK Buk","NK Rajsavac","16:15",
            "19.09","NK Papuk","NK Gradac","14:30",
            "19.09","NK Eminovci","NK Drenovac","15:00",
            "21.09","NK Zagrađe","NK Bučje","14:15")
        )

        database?.tablicaRasporedDao()?.insertRaspored(TablicaRaspored(3,4,
            "19.09","NK Jakšić","NK Kuzmica","15:30",
            "19.09","NK Vidovci","NK Požega","15:30",
            "20.09","NK Mihaljevci","NK Trenkovo","16:00",
            "20.09","NK Buk","NK Rajsavac","16:15",
            "19.09","NK Papuk","NK Gradac","14:30",
            "19.09","NK Eminovci","NK Drenovac","15:00",
            "21.09","NK Zagrađe","NK Bučje","14:15"))
*/
        //database?.tablicaRasporedDao()?.deletePodatkeRaspored()
        //val sviTablicaRasporedObjekti = database?.tablicaRasporedDao()?.getRasporedData()
        //tablicaRecyclerViewRaspored.adapter = sviTablicaRasporedObjekti?.let {TablicaRasporedAdapter(it)}
        //tablicaRecyclerViewRaspored.layoutManager = LinearLayoutManager(context)
        //tablicaRecyclerViewRaspored.setHasFixedSize(true)
    }

}