package hr.adapteri

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import hr.database.TablicaTablica
import hr.dominik.nkjaki.R
import kotlinx.android.synthetic.main.jedan_red_tablica.view.*

class TablicaTablicaAdapter constructor (private val sveTabliceUBazi: List<TablicaTablica>): RecyclerView.Adapter<TablicaTablicaAdapter.ViewHolder>() {

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val tablicaPozicija: TextView = itemView.tablica_pozicija
        val tablicaIme: TextView = itemView.tablica_ime
        val tablicaSusreti: TextView = itemView.tablica_susreti
        val tablicaGolovi: TextView = itemView.tablica_golovi
        val tablicaBodovi: TextView = itemView.tablica_bodovi
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TablicaTablicaAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.jedan_red_tablica, parent, false)
        return TablicaTablicaAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: TablicaTablicaAdapter.ViewHolder, position: Int) {
        holder.itemView.tablica_pozicija.text = sveTabliceUBazi[position].pozicija.toString()
        holder.itemView.tablica_ime.text = sveTabliceUBazi[position].imeTima
        holder.itemView.tablica_susreti.text = sveTabliceUBazi[position].odigraniSusreti.toString()
        holder.itemView.tablica_golovi.text = sveTabliceUBazi[position].golRazlika.toString()
        holder.itemView.tablica_bodovi.text = sveTabliceUBazi[position].bodovi.toString()
    }

    override fun getItemCount() = sveTabliceUBazi.size
}