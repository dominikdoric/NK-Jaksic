package hr.fragmenti

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import hr.adapteri.RasporedAdapter
import hr.database.NKJaksicDatabase
import hr.dominik.nkjaki.R
import hr.adapteri.TablicaRasporedAdapter
import kotlinx.android.synthetic.main.tablica_fragment_raspored.*

class TablicaRasporedFragment : Fragment(R.layout.tablica_fragment_raspored) {

    private lateinit var adapter: RasporedAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tablica_fragment_raspored, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val database = getActivity()?.let {
            Room.databaseBuilder(
                it, NKJaksicDatabase::class.java,"nk_jaksic_baza"
            )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        }

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
        val examplePokusRasporedList = database?.rasporedDao()?.getRasporedData()

        tablicaRecyclerViewRaspored.adapter = examplePokusRasporedList?.let { TablicaRasporedAdapter(it) }
        tablicaRecyclerViewRaspored.layoutManager = LinearLayoutManager(context)
        tablicaRecyclerViewRaspored.setHasFixedSize(true)

    }

}