package akakim.personal.materialdesignapp.adapter

import akakim.personal.materialdesignapp.R
import akakim.personal.materialdesignapp.data.BaseViewType
import akakim.personal.materialdesignapp.data.MainData
import akakim.personal.materialdesignapp.data.SimpleViewType
import akakim.personal.materialdesignapp.adapter.viewholder.MainViewHolder
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by RyoRyeong Kim on 2018-06-25.
 */


open class MainAdapter : RecyclerView.Adapter<MainViewHolder> {

    val context : Context
    val mainList : ArrayList<MainData>

    constructor(context: Context, mainList: ArrayList<MainData>): super(){

        this.context = context
        this.mainList = mainList


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {


        when (viewType ){
            SimpleViewType.SIMPLE_TEXT_VIEW ->{
                return MainViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_main, parent,false))
            }
            else -> {
                return MainViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_main, parent,false ))
            }

        }



    }


    override fun getItemViewType(position: Int): Int {

        return mainList.get(position).viewType
    }

    override fun getItemCount(): Int {

        return mainList.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {



        holder.tvActivity.text = mainList.get(position ).content
        holder.itemView.setOnClickListener {


            val intent = Intent( context ,mainList.get(position).activityClazz )
            context.startActivity(intent )
        }
    }



}