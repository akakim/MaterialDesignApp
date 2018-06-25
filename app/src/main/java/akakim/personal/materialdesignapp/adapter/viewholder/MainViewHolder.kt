package akakim.personal.materialdesignapp.adapter.viewholder

import akakim.personal.materialdesignapp.R
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

/**
 * Created by RyoRyeong Kim on 2018-06-25.
 */


open class MainViewHolder : RecyclerView.ViewHolder{

    val tvActivity : TextView
    constructor(itemView: View?) : super(itemView){

        tvActivity = itemView?.findViewById(R.id.tvActivity)!!
    }
}