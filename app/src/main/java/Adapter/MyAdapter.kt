package Adapter

import Model.Food
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.vohidov.foodapp.R
import kotlinx.android.synthetic.main.item_rv.view.*

class MyAdapter(context: Context, val list: List<Food>) :
    ArrayAdapter<Food>(context, R.layout.item_rv, list) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val itemView: View
        if (convertView == null) {
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        } else {
            itemView = convertView
        }
        itemView.txt_name1.text = list[position].name

        return itemView
    }
}