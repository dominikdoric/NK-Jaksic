package hr.pokus

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import hr.dominik.nkjaki.R

class ExampleAdapter(private val exampleList: List<ExampleItem>): RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleAdapter.ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_item, parent, false)
        return ExampleViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: ExampleAdapter.ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2
    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }


}