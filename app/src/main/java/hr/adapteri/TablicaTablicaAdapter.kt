package hr.adapteri

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import hr.database.table.Raspored
import hr.database.table.TablicaTablica
import hr.dominik.nkjaki.R
import kotlinx.android.synthetic.main.jedan_red_tablica_tablica.view.*

class TablicaTablicaAdapter : RecyclerView.Adapter<TablicaTablicaAdapter.ViewHolder>(){

    private var tablicaTablicaList = emptyList<TablicaTablica>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.jedan_red_tablica_tablica, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = tablicaTablicaList[position]
        holder.itemView.tablica_tablica_pozicija.text = currentItem.pozicija.toString()
        holder.itemView.tablica_tablica_ime.text = currentItem.imeTima
        holder.itemView.tablica_tablica_susreti.text = currentItem.odigraniSusreti.toString()
        holder.itemView.tablica_tablica_golovi.text = currentItem.golRazlika
        holder.itemView.tablica_tablica_bodovi.text = currentItem.bodovi.toString()
    }

    override fun getItemCount(): Int{
        return tablicaTablicaList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tablicaPozicija: TextView = itemView.tablica_tablica_pozicija
        val tablicaIme: TextView = itemView.tablica_tablica_ime
        val tablicaSusreti: TextView = itemView.tablica_tablica_susreti
        val tablicaGolovi: TextView = itemView.tablica_tablica_golovi
        val tablicaBodovi: TextView = itemView.tablica_tablica_bodovi
    }

    fun setData(tablicaTablica: List<TablicaTablica>){
        this.tablicaTablicaList = tablicaTablica
        notifyDataSetChanged()
    }


}