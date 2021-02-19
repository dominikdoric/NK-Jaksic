package hr.pokus

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import hr.database.table.NajboljiStrijelci
import hr.dominik.nkjaki.R
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter(private val exampleList: List<NajboljiStrijelci>): RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleAdapter.ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.jedan_red_najbolji_strijelci, parent, false)
        return ExampleViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2
    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.image_view
        val textView1: TextView = itemView.text_view_1
        val textView2: TextView = itemView.text_view_2
    }


}